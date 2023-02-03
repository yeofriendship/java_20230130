package day5;

import java.util.ArrayList;

import cls.Book;

public class Main2 {

	public static void main(String[] args) {
		// 가변 길이 배열 - 책을 여러 권 보관
		// ArrayList<Book> list = new ArrayList<Book>();
		ArrayList<Book> list = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			Book book = Input.inputBookData();
			list.add(book);
		}
		// System.out.println(list.toString());
		
		Output.printBookList(list); 
	}

}
