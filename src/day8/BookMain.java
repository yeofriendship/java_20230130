package day8;

import day8.Frame.BookInsertFrame;
import day8.Frame.BookSelectListFrame;
import day8.Frame.BookSelectListPageFrame;

public class BookMain {
	
	// 화면을 실행시키는 역할
	public static void main(String[] args) {
//		new BookInsertFrame();
		
//		new BookSelectListFrame();
		
		new BookSelectListPageFrame();
		
		// 데이터 여러개 넣기
//		BookDB bookDB = new BookDBImpl();
//		for (int i=0; i<23; i++) {
//			Book book = new Book();
//			book.setTitle("자바" + i);
//			book.setAuthor("저자" + i);
//			book.setPrice(10000 + i);
//			book.setCate('A');
//			bookDB.insertBook(book);
//		}
	}

}
