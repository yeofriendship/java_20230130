package main2;

import java.util.Date;

import cls.Item;

// <원시 타입>
// 정수 :	byte, short, int, long
// 문자 :   char
// 실수 :	float, double
// 논리 :	boolean

// <클래스>
// 정수 : Byte, Short, Integer, Long
// 문자 : Character
// 실수 : Float, Double,
// 논리 : Boolean
// 문자열 : String
// 날짜 : Date

public class Main1 {

	public static void main(String[] args) {
		// 배열 위치번호 : 0번 ~ (전체개수-1)번
		int[] a = new int[5]; // 배열이 5개 생성됨. 초기값 : 0
		int[] b = {1, 4, 5, 2, 7}; // 배열이 5개 생성됨. 1, 4, 5, 2, 7로 값이 각각 초기화
		
		String str[] = new String[5]; // 문자열 배열 5개 생성됨. 초기값 : null
		
		int i = 0;
		for (i=0; i<b.length; i++) {
			System.out.print(b[i] + ",");
		}
		
		System.out.println();
		
		// Item 배열이 5개 생성. 초기값 : null
		Item[] items = new Item[5];
		for (i=0; i<items.length; i++) {
			// 클래스명 객체명 = new 클래스명();
			Item obj = new Item();
			
			obj.setNo(i);
			obj.setName("물품명 " + i);
			obj.setContent("물품내용 " + i);
			obj.setPrice(1000 + i);
			obj.setQuantity(100 + i);
			obj.setDate(new Date());
			
			items[i] = obj;
		}
		
		for(i=0; i<items.length; i++) {
			System.out.println(items[i].toString());
		}
	}

}
