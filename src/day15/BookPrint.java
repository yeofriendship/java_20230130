package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookPrint {
	// 3권 정도 임의의 값으로 추가한 후 실행하기
	public void PrintBook(List<Book> book) {
		for (Book b : book) {
			System.out.print(b.getCode() + " ");
			System.out.print(b.getTitle() + " ");
			System.out.print(b.getAuthor() + " ");
			System.out.print(b.getPrice() + " ");
			System.out.println(b.getRegdate());
		}
	}
	
	// 전체 책과 필터하는 가격 조건 전달 받으면 가격보다 큰 책만 반환
	public List<Book> queryPrice(List<Book> book, long price){
		List<Book> result = new ArrayList<>();
		for (Book b : book) {
			if (b.getPrice() > price) {
				result.add(b);
			}
		}
		return result;
	}
	
	// 가격에서 일의 자리가 0인것만 조회
	// ex) 12233 => 조회 X
	// 	   12300 => 조회 O
	public List<Map<String, Object>> queryPrice(List<Book> book){
		List<Map<String, Object>> list = new ArrayList<>();
		for (Book b : book) {
			if (b.getPrice() % 10 == 0) {
				Map<String, Object> map = new HashMap<>();
				map.put("code", b.getCode());
				map.put("title", b.getTitle());
				map.put("author", b.getAuthor());
				map.put("price", b.getPrice());
				map.put("regdate", b.getRegdate());
				
				list.add(map);
			}
		}
		return list;
	}
}
