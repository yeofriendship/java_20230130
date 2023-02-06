package day6;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertOneResult;

// 기능용 클래스
// 몽고DB 연동

public class MemberDB {
	// 변수는 모든 메소드에 사용가능하기 위해
	private MongoCollection<Document> collection = null;
	
	// 생성자
	public MemberDB() {
		// 공통변수가 아니기 때문에 생성자 내부에서만 사용가능한 변수 생성
		// final : 바꿀 수 없는 변수
		// final을 붙이면 생성시 값으로 프로그램이 끝날때까지 유지됨 -> 바꿀 수 없기 때문에
		// mongodb://아이디:암호@서버주소:포트번호/DB명
		final String url = "mongodb://id211:pw211@1.234.5.158:37017/db211";
		
		// static 클래스를 통해서 접속이 가능함
		MongoClient client = MongoClients.create(url);
		MongoDatabase db = client.getDatabase("db211");
		this.collection = db.getCollection("members");
	}
	
	// 회원가입 메소드
	public int insertMember(Member member) {
		try {
			// 정상동작
			Document doc = new Document();
			
			// _변수명 => 기본키
			doc.append("_id", member.getId()); // 기본키
			doc.append("password", member.getPassword());
			doc.append("name", member.getName());
			doc.append("phone", member.getPhone());
			doc.append("age", member.getAge());
			doc.append("role", member.getRole());
			doc.append("regdate", member.getRegdate());
			
			InsertOneResult result = this.collection.insertOne(doc);
			System.out.println(result.toString());
			return 1;
		}
		catch(Exception e) {
			// 정상동작 중에서 오류가 발생시 이쪽으로 수행됨
			// Exception 클래스의 e 변수에 오류의 정보(오류 메시지)가 전송되게 됨
			e.printStackTrace(); // 오류 메시지를 전체적으로 출력해줌 -> 개발자를 위한 기능
			return -1;
		}
	}
	
	// 전체 회원 조회 메소드
	public void printMembers() {
		MongoCursor<Document> list = this.collection.find().cursor();
		
		// 반복자 : 처음부터 끝까지 전체 다 반복할 거라고 가정
		// 몇 개가 존재하는지 모름 -> while문 사용
		while(list.hasNext()) { // hasNext : 다음 데이터가 있는지?
			// true일때
			Document doc = list.next();
			
			System.out.println("아이디 => " + doc.getString("_id"));
			System.out.println("암호 => " + doc.getString("password"));
			System.out.println("나이 => " + doc.getInteger("age"));			
			System.out.println("--------------------");
		}
	}
	
	// 이름이 "가나다"인 회원만 조회하는 메소드
	public void printMembersName(String searchName) {
		// 키(필드)가 name인 것 중에서 searchName과 정확하게 일치하는 필터
		Bson filter = Filters.eq("name", searchName);
		
		// cursor()와 iterator() => 같은 기능을 함
		MongoCursor<Document> list = this.collection.find(filter).iterator();
		
		while(list.hasNext()) {
			Document doc = list.next();
			
			System.out.println("아이디 => " + doc.getString("_id"));
			System.out.println("암호 => " + doc.getString("password"));
			System.out.println("이름 => " + doc.getString("name"));
			System.out.println("연락처 => " + doc.getString("phone"));
			System.out.println("나이 => " + doc.getInteger("age"));	
			System.out.println("권한 => " + doc.getString("role"));
			System.out.println("날짜 => " + doc.getDate("regdate"));
			System.out.println("--------------------");
		}
	}
	
	// 고객만 조회하는 메소드
	public void printMemberRole(String roleC) {
		Bson filter = Filters.eq("role", roleC);
		
		printAction(filter);
	}
	
	// 나이가 n 이상인 회원만 조회하는 메소드
	public void printMemberAge(int nAge) {
		// 이상 : gte
		// 이하 : lte
		Bson filter = Filters.gte("age", nAge);
		
		printAction(filter);
	}
	
	// 반복되는 작업은 새로운 메소드를 만들어서 코드 길이를 줄인다
	private void printAction(Bson filter) {
		MongoCursor<Document> list = this.collection.find(filter).iterator();
		
		while(list.hasNext()) {
			Document doc = list.next();
			
			System.out.println("아이디 => " + doc.getString("_id"));
			System.out.println("암호 => " + doc.getString("password"));
			System.out.println("이름 => " + doc.getString("name"));
			System.out.println("연락처 => " + doc.getString("phone"));
			System.out.println("나이 => " + doc.getInteger("age"));	
			System.out.println("권한 => " + doc.getString("role"));
			System.out.println("날짜 => " + doc.getDate("regdate"));
			System.out.println("--------------------");
		}
	}
}
