package day15;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		// BookPrint
//		BookPrint bDB = new BookPrint();
//		
//		List<Book> list = new ArrayList<>();
//		for (int i=0; i<3; i++) {
//			Book b = new Book();
//			b.setCode(i+1);
//			b.setTitle("aaa");
//			b.setAuthor("bbb");
//			b.setPrice((i+1)*10000);
//			
//			list.add(b);
//		}
//		bDB.PrintBook(list);
//		
//		System.out.println(bDB.queryPrice(list, 15000));
//		
//		System.out.println(bDB.queryPrice(list));
		
		// BookStore
		BookStore bookStore = new BookStore();
		Book book = new Book();
		book.setCode(1L);
		book.setTitle("가나다");
		book.setAuthor("A");
		book.setPrice(10000L);
		int ret = bookStore.addBook(book);
//		System.out.println(ret);
//		System.out.println(bookStore.removeBook(book));
		bookStore.searchBook("가");
		bookStore.searchBookPrice(8000L);
	}

}
