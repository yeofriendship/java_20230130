package main2;

import java.util.Date;

import cls.Book;
import cls.BookStore;

public class Main2 {

	public static void main(String[] args) {		
		// 생성자가 만들어지면 객체명.set~은 해줄 필요가 없다
		// 생성자는 보통 빈 생성자 1개와 모든 변수를 넣은 생성자 1개를 만든다
//		book.setNo(1);
//		book.setTitle("java");
//		book.setAuthor("가나다");
//		book.setPrice(40000);
//		book.setCate('B');
//		book.setDate(new Date());
		
		// 서점이 생성됨. 책을 100권 보관할 수 있는 배열 생성
		BookStore bookStore = new BookStore();
		
		bookStore.setPhone("051-707-7070");
		bookStore.setAddress("부산 남구");
		
		//추가하고자 하는 책을 먼저 생성
		Book book = new Book(100, "java", "저자", 40000, 'B', new Date());
		
		// 서점에 1권의 책 등록
		bookStore.insertBook(book);
		
		// 문제 1) 임의의 책 2권 생성한 후 서점에 등록하기
		Book book1 = new Book(105, "Python", "저자1", 300, 'A', new Date());
		Book book2 = new Book(110, "HTML", "저자2", 20000, 'C', new Date());
		
		bookStore.insertBook(book1);
		bookStore.insertBook(book2);
		
		// 마지막 1권 삭제
		bookStore.deleteBook();
		
		// 현재까지 등록된 책 조회
		bookStore.selectBook();
		
		// BookStore 문제 1) 등록한 책의 가격을 전달받은 할인율만큼 변경
		bookStore.discountPrice(0.2f);
		
		// BookStore 문제 2) 가격이 n 1000원 이상인 책 수량을 반환
		bookStore.priceQuery(1000);
		
		// BookStore 문제 3) 분류 코드가 전달받은 값인 항목만 출력
		bookStore.printCate('A');
	}

}
