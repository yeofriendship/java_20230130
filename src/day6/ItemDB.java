package day6;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

public class ItemDB {
	// db 연결하고 컬렉션을 items로
	private MongoCollection<Document> collection = null;
	
	// 생성자
	public ItemDB() {
		try {
			final String url = "mongodb://id211:pw211@1.234.5.158:37017/db211";
			
			// static 클래스를 통해서 접속이 가능함
			MongoClient client = MongoClients.create(url);
			MongoDatabase db = client.getDatabase("db211");
			this.collection = db.getCollection("items");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 물품 등록
	public int insertItem(Item item) {
		try {
			Document doc = new Document();
			
			doc.append("_id", item.getCode());
			doc.append("name", item.getName());
			doc.append("content", item.getContent());
			doc.append("price", item.getPrice());
			doc.append("quantity", item.getQuantity());
			doc.append("date", item.getDate());
			
			InsertOneResult result = this.collection.insertOne(doc);
			
			// result => {insertedId=BsonInt64{value=145}}
			if (result.getInsertedId().asInt64().getValue() == item.getCode()) {
				return 1;
			}
			return 0;
		}
		catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
	
	// 전체물품 출력
	public void printItems() {
		// MongoCursor<Document> => ArrayList<Document>
		// size를 알 수 없음		 => size를 알 수 있음
		MongoCursor<Document> list = this.collection.find().cursor();
		
		while(list.hasNext()) {
			Document doc = list.next();
			
			System.out.println("물품코드 => " + doc.getLong("_id"));
			System.out.println("물품명 => " + doc.getString("name"));
			System.out.println("물품내용 => " + doc.getString("content"));
			System.out.println("가격 => " + doc.getInteger("price"));
			System.out.println("수량 => " + doc.getInteger("quantity"));
			System.out.println("날짜 => " + doc.getDate("date"));
			System.out.println("--------------------------");
		}
	}
	
	// 물품코드를 이용한 수정
	// 물품명, 물품내용, 가격, 수량 변경가능
	public int updateItem(Item item) {
		try {
			// 변경하고자 하는 항목의 조건
			Bson filter = Filters.eq("_id", item.getCode());
			
			// 변경할 항목들
			Bson update1 = Updates.set("name", item.getName());
			Bson update2 = Updates.set("content", item.getContent());
			Bson update3 = Updates.set("price", item.getPrice());
			Bson update4 = Updates.set("quantity", item.getQuantity());
			
			// updateOne
			Bson update = Updates.combine(update1, update2, update3, update4);
			
			UpdateResult result = this.collection.updateOne(filter, update);
			
			if (result.getModifiedCount() == 1L) {
				return 1;
			}
			return 0;
		}
		catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 물품 삭제
	public int deleteItem(Long code) {
		try {
			Bson filter = Filters.eq("_id", code);
			DeleteResult result = this.collection.deleteOne(filter);
			System.out.println(result);
			
			if (result.getDeletedCount() == 1L) {
				return 1;
			}
			return 0;
		}
		catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
}
