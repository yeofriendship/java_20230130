package day6;

import java.util.Date;

public class Main4 {

	public static void main(String[] args) {
		// 1. 객체 생성
		ItemDB itemDB = new ItemDB();
		
//		// 2. 임시 데이터
//		Item item = new Item(3, "물품명3", "물품내용3", 50000, 10, new Date());		
//		
//		// 3. DB에 추가하는 메소드 수행
//		int ret = itemDB.insertItem(item);
//		System.out.println(ret);
		
//		// 전체 물품 조회
//		itemDB.printItems();
		
		// 물품 정보 수정
//		Item item = new Item();
//		
//		item.setCode(12345L);
//		item.setName("물품명변경");
//		item.setContent("물품내용변경");
//		item.setPrice(1000);
//		item.setQuantity(600);
//		
//		System.out.println(itemDB.updateItem(item));
		
		// 물품 삭제
		System.out.println(itemDB.deleteItem(123L));
	}

}
