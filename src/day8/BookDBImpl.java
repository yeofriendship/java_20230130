package day8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

public class BookDBImpl implements BookDB {
	// 공통변수 생성자, 메소드 모두 접근 가능한 변수
	private MongoCollection<Document> sequence = null;
	private MongoCollection<Document> books = null;
	
	// 생성자
	public BookDBImpl() {
		try {
			MongoDatabase db = MongoClients.create(Config.URL).getDatabase(Config.DBNAME);
			this.sequence = db.getCollection("sequence");
			this.books = db.getCollection("books");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 책 등록
	@Override
	public int insertBook(Book book) {
		try {
			// 책번호(시퀀스), 등록일자(현재 날짜)
			Bson filter = Filters.eq("_id", "SEQ_BOOK_NO");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.sequence.findOneAndUpdate(filter, update);
			
			Document doc1 = new Document();
			doc1.append("_id", doc.getInteger("idx"));
			doc1.append("title", book.getTitle());
			doc1.append("author", book.getAuthor());
			doc1.append("price", book.getPrice());
			doc1.append("cate", book.getCate());
			doc1.append("regdate", new Date());
			
			InsertOneResult result = this.books.insertOne(doc1);
			System.out.println(result);
			
			// AcknowledgedInsertOneResult{insertedId=BsonInt32{value=101}}
			if (result.getInsertedId().asInt32().getValue() == doc.getInteger("idx")) {
				return 1;
			}
			return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 책 전체 조회
	@Override
	public List<Book> selectBookList() {
		try {
			// 반환 타입을 위한 빈 배열 객체 생성
			List<Book> list = new ArrayList<Book>();
			
			FindIterable<Document> docs = this.books.find();
			
			// docs의 값을 list로 다 복사하기
			for (Document doc : docs) {
				Book book = new Book();
				book.setNo(doc.getInteger("_id"));
				book.setTitle(doc.getString("title"));
				book.setAuthor(doc.getString("author"));
				book.setPrice(doc.getLong("price"));
				book.setCate(doc.getString("cate").charAt(0));
				book.setDate(doc.getDate("regdate"));
				
				list.add(book); // 반복 횟수만큼 list에 추가하기
			}
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// 책 10개씩 조회 (책 번호를 받으면 그 번호부터 10개씩 조회)
	@Override
	public List<Book> selectBookListPage(int page) {
		try {
			// 반환 타입을 위한 빈 배열 객체 생성
			List<Book> list = new ArrayList<Book>();
			
			Bson sort = Filters.eq("_id", -1); // 책 번호를 기준으로 내림차순(-1)
			
			// page=1 -> skip(0) / page=2 -> skip(10) / page=3 -> skip(20)
			FindIterable<Document> docs = this.books.find().sort(sort).skip(10*(page-1)).limit(10);
			
			for (Document doc : docs) {
				Book book = new Book();
				book.setNo(doc.getInteger("_id"));
				book.setTitle(doc.getString("title"));
				book.setAuthor(doc.getString("author"));
				book.setPrice(doc.getLong("price"));
				book.setCate(doc.getString("cate").charAt(0));
				book.setDate(doc.getDate("regdate"));
				
				list.add(book);
			}
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int deleteBook(int no) {
		
		return 0;
	}

	@Override
	public int updateBook(Book book) {
		
		return 0;
	}

	@Override
	public Book selectBookOne(int no) {
		
		return null;
	}

	@Override
	public List<Book> selectBookPrice(long price) {
		
		return null;
	}

	@Override
	public List<Book> selectBookCate(char cate) {
		
		return null;
	}
	
}
