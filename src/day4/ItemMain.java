package day4;

import java.util.Date;

public class ItemMain {

	public static void main(String[] args) {
		Member member = new Member("abcdefg", "hijklmn", "신애린",
				"010-9896-1402", "D", new Date());
		Item item = new Item(5555, "물품명", "123456789012345678901111", 
								5000, 5, member);
		System.out.println(item.toString());
		
		// 1. 수량이 n개 미만이면 n개로 변경
		System.out.println(item.underCount(20));
		
		// 2. 가격에 할인율만큼 빼서 리턴
		System.out.println(item.percentPrice(0.1f));
		System.out.println(item.toString());
		
		// 3. 총 판매금액을 리턴
		System.out.println(item.totalPrice());
		
		// 4. 내용이 20자 이상이면 변환
		item.checkContent();
		
		// 5. 이름을 뒤집어서 반환
		item.reverseName();
		System.out.println(item.revName());
	}

}
