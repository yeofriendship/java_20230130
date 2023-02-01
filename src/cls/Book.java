package cls;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


// 책번호 no, 책제목 title, 저자 author, 가격 12000, 분류 cate 'A', 'B', 'C', 등록일자 date

public class Book {
	
	private int no = 0;
	private String title = null;
	private String author = null;
	private long price = 0L;
	private char cate = 'A';
	private Date date = null;
	
	// 메소드(함수)
	// public void print() {}
	
	// 생성자(Constructor) : 클래스명과 같음, 반환타입 언급 없음
	// 생성자 1 => 빈 생성자 @NoArgsConstructor
//	public Book() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	// 생성자 2 => 모든 변수를 넣은 생성자 @AllArgsConstructor
//	public Book(int no, String title, String author, long price, char cate, Date date) {
//		super();
//		this.no = no;
//		this.title = title;
//		this.author = author;
//		this.price = price;
//		this.cate = cate;
//		this.date = date;
//	}
	
	
}
