package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

// 전화번호, 위치, 보유책(최대 100개)

public class BookStore {
	
	private String phone = null; // 서점 연락처
	private String address = null; // 서점 위치
	private Book[] books = null; // 보유 책
	
	private int idx = 0; // 현재 배열에 추가되어 있는 책의 위치
	
	// 생성자 한번만 사용가능함. 반환값 없음. 클래스명과 정확하게 일치해야함.
	// 빈 생성자 (준비물이 없는)
	public BookStore() {
		this.books = new Book[100];
	}
	
	// 책 등록하는 메소드(함수)
	public void insertBook(Book book) {
		if (this.idx >= 100) {
			System.out.println("책 추가 불가");
		}
		else {
			this.books[this.idx] = book;
			this.idx++;
		}
	}
	
	// 현재까지 등록된 책 목록 출력하는 메소드
	public void selectBook() {
		int i = 0;
		for (i=0; i<this.idx; i++) {
			System.out.println(this.books[i].toString());
		}
	}
	
	// 마지막 등록한 책을 삭제하는 메소드
	public void deleteBook() {
		if (this.idx > 0) {
			this.idx--;
		}
	}
	
	// 문제 1) 등록한 책의 가격을 전달받은 할인율만큼 변경하는 메소드
	public int discountPrice(float per) {
		for (int i=0; i<this.idx; i++) {
			// 현재 가격
			long price = this.books[i].getPrice();
			long result = (long)(price - price*per);
			this.books[i].setPrice(result);
			
			System.out.println((int)per + "% 할인된 가격 => " + this.books[i].toString());
		}
				
		return 1;
	}
	
	// 문제 2)가격이 n 1000원 이상인 책 수량을 반환하는 메소드
	public int priceQuery(int pr){
		int cnt = 0;
		
		for (int i=0; i<this.idx; i++) {
			if (this.books[i].getPrice() >= pr) {
				cnt++;
			}
		}
		System.out.println("가격이 " + pr + "원 이상인 책은 총 " + cnt + "권");
		
		return cnt;
	}
	
	// 문제 3) 분류 코드가 전달받은 값인 항목만 출력하는 메소드
	public void printCate(char cate) {
		for (int i=0; i<this.idx; i++) {
			if(this.books[i].getCate() == cate) {
				System.out.println("분류 코드가 " + cate + "인 항목 => " + this.books[i].toString());
			}
		}
	}
}
