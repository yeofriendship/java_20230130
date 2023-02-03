package day5;

import java.util.ArrayList;

public class Main1 {
	public static void main(String[] args) {
		// 배열
		// 배열은 원시타입, object타입 다 가능함
		// 초기값 지정하지 않은 경우) 원시 타입 초기값 : 0
		// 					 object 타입 초기값 : null
		int[] a = new int[5]; 	   // 5개 만들어짐. 초기값 : 0
		int[] b = {1, 2, 3, 4, 5}; // 5개 만들어짐. 초기값 : {} 안 숫자
		
		String c[] = new String[5];   // 5개 만들어짐. 초기값 : null
		Integer d[] = new Integer[5]; // 5개 만들어짐. 초기값 : null
		
		// -----------------------------------------------------------------
		
		// 컬렉션
		// 사용 이유) 1. 배열의 개수 모름
		// 		   2. 가변 배열
		ArrayList<Integer> e = new ArrayList<Integer>();
		e.add(100);
		e.add(200);
		e.add(300);
		e.add(400);
		System.out.println(e.size());	
		e.remove(2); // 인덱스 번호 -> 삭제
		System.out.println(e.size());
		
		for (int i=0; i<e.size(); i++) {
			System.out.print(e.get(i) + " ");
		}
		
		System.out.println();
		for (int j=e.size()-1; j>=0; j--) {
			System.out.print(e.get(j) + " ");
		}
		
		System.out.println();
		for (int k=0; k<e.size(); k++) {
			System.out.print(e.get(e.size()-1-k) + " ");
		}
	}
	
}
