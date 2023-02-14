package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import day11.Titanic;
import day8.Config;

public class TitanicDBImpl implements TitanicDB {
	private MongoCollection<Document> titanic = null;
	
	// 1. titanic 컬렉션 접속하기
	public TitanicDBImpl() {
		try {
			this.titanic = MongoClients
							.create(Config.URL)
							.getDatabase(Config.DBNAME)
							.getCollection(Config.TITANICCOL);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Titanic> selectTitanicList() {
		try {
			Bson sort = Filters.eq("fare", 1);
			FindIterable<Document> docs = this.titanic.find().sort(sort);
			
			List<Titanic> list = new ArrayList<>();
			
			for (Document doc : docs) {
				list.add(printAction(doc));
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
	public List<Map<String, Object>> selectTitanicListMap() {
		try {
			// Map<String, Object> == Titanic 타입과 같은 기능
			Bson sort = Filters.eq("fare", 1);
			FindIterable<Document> docs = this.titanic.find().sort(sort);
			
			List<Map<String, Object>> list = new ArrayList<>();
			
			for (Document doc : docs) {
				Map<String, Object> map = new HashMap<>();
				
				// map.put(key, value) : key는 변수명, value는 값
				map.put("survived", doc.getString("survived"));
				map.put("pclass", doc.getInteger("pclass"));
				map.put("sex", doc.getString("sex"));
				map.put("age", doc.getDouble("age").floatValue());
				map.put("sibsp", doc.getInteger("sibsp"));
				map.put("parch", doc.getInteger("parch"));
				map.put("ticket", doc.getString("ticket"));
				map.put("fare", doc.getDouble("fare").floatValue());
				map.put("cabin", doc.getString("cabin"));
				map.put("embarked", doc.getString("embarked"));
				map.put("name", doc.getString("name"));
				map.put("passengerid", doc.getInteger("passengerid"));
				
				list.add(map);
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
	public List<Titanic> selectTitanicAge(int n) {
		try {
			Bson sort = Filters.eq("age", -1);
			FindIterable<Document> docs = this.titanic.find().sort(sort).limit(n);
			
			List<Titanic> list = new ArrayList<>();
			
			for (Document doc : docs) {
				list.add(printAction(doc));
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
	
	public Titanic printAction(Document doc) {
		Titanic t = new Titanic();
		
		t.setSurvived(doc.getString("survived"));
		t.setPclass(doc.getInteger("pclass"));
		t.setSex(doc.getString("sex"));
		t.setAge(doc.getDouble("age").floatValue());
		t.setSibsp(doc.getInteger("sibsp"));
		t.setParch(doc.getInteger("parch"));
		t.setTicket(doc.getString("ticket"));
		t.setFare(doc.getDouble("fare").floatValue());
		t.setCabin(doc.getString("cabin"));
		t.setEmbarked(doc.getString("embarked"));
		t.setName(doc.getString("name"));
		t.setPassengerId(doc.getInteger("passengerid"));
		
		return t;
	}
	
}
