package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class ItemDBImpl implements ItemDB {
	MongoCollection<Document> sequence = null;
	MongoCollection<Document> items = null;

	public ItemDBImpl() {
		try {
			this.sequence = MongoClients.create(Config.URL)
								.getDatabase(Config.DBNAME)
								.getCollection(Config.RESEQUENCECOL);
			this.items = MongoClients.create(Config.URL)
								.getDatabase(Config.DBNAME)
								.getCollection(Config.ITEMCOL);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 전체 조회 (정렬기준 : 물품번호를 내림차순으로)
	@Override
	public List<Map<String, Object>> selectItemListMap(int n) {
		try {
			Bson sort = Filters.eq("_id", -1);
			FindIterable<Document> docs = this.items.find().sort(sort).limit(n);
			
			// List<Map> 타입으로 반환해서 리턴
			List<Map<String, Object>> list = new ArrayList<>();
			for (Document doc : docs) {
				Map<String, Object> map = new HashMap<>();
				
				// doc를 map으로 변환하기
				map.put("_id", doc.getLong("_id"));
				map.put("name", doc.getString("name"));
				map.put("content", doc.getString("content"));
				map.put("price", doc.getInteger("price"));
				map.put("quantity", doc.getInteger("quantity"));
				map.put("date", doc.getDate("date"));
				
				list.add(map);
			}
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public int insertItemMap(Map<String, Object> map) {
		try {
			Bson filter = Filters.eq("_id", "SEQ_ITEM_NO");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.sequence.findOneAndUpdate(filter, update);
			long itemCode = doc.getLong("idx");
			
			Document saveDoc = new Document();
			saveDoc.append("_id", itemCode);
			saveDoc.append("name", map.get("name"));
			saveDoc.append("content", map.get("content"));
			saveDoc.append("price", map.get("price"));
			saveDoc.append("quantity", map.get("quantity"));
			saveDoc.append("date", new Date());
			
			InsertOneResult result = this.items.insertOne(saveDoc);
			if (result.getInsertedId().asInt64().getValue() == itemCode) {
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
	public int deleteItemOne(long no) {
		try {
			Bson filter = Filters.eq("_id", no);
			DeleteResult result = this.items.deleteOne(filter);
			
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

	@Override
	public int deleteItemMany(long[] no) {
		try {
			int cnt = 0; // 지운 개수
			
			// deleteOne => 조건 1개에 n개를 지움
			// 조건 n개에 n개를 지우려면 반복문을 돌려야함
			for (int i=0; i<no.length; i++) {
				Bson filter = Filters.eq("_id", no[i]);
				DeleteResult result = this.items.deleteOne(filter);
				
				cnt += result.getDeletedCount(); // 삭제시 한개씩 더하기
			}
			
			// 삭제한 개수 == 배열의 개수
			if (cnt == no.length) {
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
	public int updateItemOne(Item item) {
		try {
			Bson filter = Filters.eq("_id", item.getNo());
			Bson update1 = Updates.set("name", item.getName());
			Bson update2 = Updates.set("content", item.getContent());
			Bson update3 = Updates.set("price", item.getPrice());
			Bson update4 = Updates.set("quantity", item.getQuantity());
			Bson update = Updates.combine(update1, update2, update3, update4);
			
			UpdateResult result = this.items.updateOne(filter, update);
			
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
	public List<Item> selectItemList() {
		try {
			Bson sort = Filters.eq("_id", 1);
			FindIterable<Document> docs = this.items.find().sort(sort);
			
			List<Item> list = new ArrayList<>();
			for (Document doc : docs) {
				Item item = new Item();
				
				item.setNo(doc.getLong("_id"));
				item.setName(doc.getString("name"));
				item.setContent(doc.getString("content"));
				item.setPrice(doc.getInteger("price"));
				item.setQuantity(doc.getInteger("quantity"));
				item.setDate(doc.getDate("date"));
				
				list.add(item);
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
	
}
