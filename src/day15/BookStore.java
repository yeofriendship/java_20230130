package day15;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
// 타입
public class BookStore {
	private String phone;
	private String address;
	
	private List<Book> list = new ArrayList<>();
	
	// 책 추가
	public int addBook(Book book) {
		try {
			this.list.add(book);
			
			if (book != null) {
				return 1;
			}
			return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 책 삭제
	public int removeBook(Book book) {
		try {
			this.list.remove(book);
			
			return 1;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 책 제목이 포함된 것 검색
	public List<Book> searchBook(String title){
		List<Book> result = new ArrayList<>();
		for (Book b : this.list) {
			if (b.getTitle().contains(title)) {
				result.add(b);
			}
		}
		System.out.println(result);
		return result;
	}
	
	// 가격보다 큰 것만 검색
	public List<Book> searchBookPrice(long price){
		List<Book> result = new ArrayList<>();
		for (Book b : this.list) {
			if (b.getPrice() > price) {
				result.add(b);
			}
		}
		System.out.println(result);
		return result;
	}
}
