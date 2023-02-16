package day14;

import java.util.Date;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class MemberDBImpl implements MemberDB {
	MongoCollection<Document> members = null;
	
	public MemberDBImpl() {
		members = DBConn.getInstance().getCollection(Config.MEMBERCOL);
	}

	@Override
	public int memberJoin(Member member) {
		try {
			Document doc = new Document();
			doc.append("_id", member.getId());
			doc.append("password", member.getPassword());
			doc.append("name", member.getName());
			doc.append("phone", member.getPhone());
			doc.append("role", member.getRole());
			doc.append("age", member.getAge());
			doc.append("regdate", member.getRegdate());
			
			InsertOneResult result = this.members.insertOne(doc);
			
			if (result.getInsertedId().asString().getValue().equals(member.getId())) {
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
	public Member memberLogin(Map<String, Object> map) {
		try {
			String id = (String) map.get("_id");
			String pw = (String) map.get("password");
			
			Bson filter = Filters.eq("_id", id);
			Document doc = this.members.find(filter).first();
			
			if (doc.getString("_id").equals(id)
					&& doc.getString("password").equals(pw)) {
				Member member = documentToMember(doc);
				
				return member;
			}
			return null;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Member memberSelectOne(String id) {
		try {
			Bson filter = Filters.eq("_id", id);
			Document doc = this.members.find(filter).first();
			
			Member member = documentToMember(doc);
			
			if (doc != null) {
				return member;
			}
			return null;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int memberUpdateOne(Member member) {
		try {
			Bson filter = Filters.eq("_id", member.getId());
			Bson update1 = Updates.set("name", member.getName());
			Bson update2 = Updates.set("phone", member.getPhone());
			Bson update3 = Updates.set("role", member.getRole());
			Bson update4 = Updates.set("age", member.getAge());
			Bson update = Updates.combine(update1, update2, update3, update4);
			
			UpdateResult result = this.members.updateOne(filter, update);
			
			if (result.getModifiedCount() == 1L) {
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
	public int memberUpdatePwOne(Map<String, Object> map) {
		try {
			String id = (String) map.get("_id"); // 현재 아이디
			String changePw = (String) map.get("changePw"); // 바꿀 비밀번호
					
			Member member = this.memberLogin(map);
			
			if (member != null) { // 로그인 성공
				Bson filter = Filters.eq("_id", member.getId());
				Bson update = Updates.set("password", changePw);
				UpdateResult result = this.members.updateOne(filter, update);
				
				if (result.getModifiedCount() == 1L) {
					return 1;
				}
			}
			return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int memberDeleteOne(String id) {
		try {
			Bson filter = Filters.eq("_id", id);
			DeleteResult result = this.members.deleteOne(filter);
			
			if (result.getDeletedCount() == 1L) {
				return 1;
			}
			return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public Member documentToMember(Document doc) {
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
