package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

import day8.Config;

public class AddressDBImpl implements AddressDB {
	private MongoCollection<Document> addresses = null;
	private MongoCollection<Document> sequence = null;
	private MongoCollection<Document> members = null;
	
	public AddressDBImpl() {
		this.addresses = MongoClients.create(Config.URL)
									.getDatabase(Config.DBNAME)
									.getCollection(Config.ADDRESSCOL);
		this.sequence = MongoClients.create(Config.URL)
									.getDatabase(Config.DBNAME)
									.getCollection(Config.RESEQUENCECOL);
		this.members = MongoClients.create(Config.URL)
									.getDatabase(Config.DBNAME)
									.getCollection(Config.MEMBERCOL);
	}

	@Override
	public int insertAddress(Address address) {
		try {
			Bson filter = Filters.eq("_id", "SEQ_ADDRESS_CODE");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.sequence.findOneAndUpdate(filter, update);
			
			long code = (long) doc.get("idx");
			
			Document saveDoc = new Document()
					.append("_id", code)
					.append("address", address.getAddress())
					.append("postcode", address.getPostcode())
					.append("regdate", address.getRegdate())
					// 회원 정보 전체를 추가하는 것이 아니라 기본키인 아이디만 추가함!!
					.append("memberid", address.getMemberid().getId());
			
			InsertOneResult result = this.addresses.insertOne(saveDoc);
			System.out.println(result);
			
			if (result.getInsertedId().asInt64().getValue() == code) {
				return 1;
			}
			return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int insertAddressMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// 주소코드가 오면 주소정보를 전달하는 + 회원정보도 같이
	@Override
	public Address selectAddressOne(long code) {
		try {
			Bson filter1 = Filters.eq("_id", code);
			Document doc = this.addresses.find(filter1).first();
			
			Address address = documentToAddresss(doc);
			
			// members의 컬렉션에서 해당하는 아이디 정보를 가져와야함
			Bson filter2 = Filters.eq("_id", doc.getString("memberid"));
			Document docMember = this.members.find(filter2).first();
			
			Member member = documentToMember(docMember);
			
			address.setMemberid(member);
			
			if (doc != null) {
				return address;
			}
			return null;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Map<String, Object> selectAddressMapOne(long code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> selectAddressList(Member member) {
		try {
			Bson filter = Filters.eq("memberid", member.getId());
			FindIterable<Document> docs = this.addresses.find(filter);
			
			List<Address> list = new ArrayList<>();
			for (Document doc : docs) {
				Bson filter2 = Filters.eq("_id", member.getId());
				Document docMember = this.members.find(filter2).first();
				
				Address address = documentToAddresss(doc);
				address.setMemberid(documentToMember(docMember));
				
				list.add(address);
			}
			
			if (!list.isEmpty()) {
				return list;
			}
			return null;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Map<String, Object>> selectAddressListMap(Member member) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// document -> Address로 변경하는 메소드
	private Address documentToAddresss(Document doc) {
		Address address = new Address();
		address.setCode(doc.getLong("_id"));
		address.setAddress(doc.getString("address"));
		address.setPostcode(doc.getString("postcode"));
		address.setRegdate(doc.getDate("regdate"));
		
		return address;
	}
	
	private Member documentToMember(Document doc) {
		Member member = new Member();
		member.setId(doc.getString("_id"));
		member.setPassword(doc.getString("password"));
		member.setName(doc.getString("name"));
		member.setPhone(doc.getString("phone"));
		member.setRole(doc.getString("role"));
		member.setAge(doc.getInteger("age"));
		member.setRegdate(doc.getDate("regdate"));
		
		return member;
	}
}
