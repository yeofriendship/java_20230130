package day7;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		
//		// 메소드 호출 => 객체변수명.메소드명();
//		p.work();
//		p.study();
		
//		Child1 c1 = new Child1();
//		c1.work();
//		c1.study();

//		Child2 c2 = new Child2();
//		c2.work();
//		c2.study();
		
//		Parent c1 = new Child1();
//		c1.work();
//		c1.study();
//
//		Parent c2 = new Child2();
//		c2.work();
//		c2.study();
		
//		new Frame1();
		
		// 오류 발생
//		MyListener ml = new MyListener();
		
//		MyListener m1 = new MyInter1();
//		MyListener m2 = new MyInter2();
//		
//		Print p = new Print();
//		p.action(m1);
//		p.action(m2);
		
		// 배열 => 생성시에 반드시 개수가 정해져야 한다
		int[] a = {2, 5, 1, 23, 4}; // 5개의 int형 공간이 생성, 인덱스는 0부터 4까지
		int b[] = new int[5]; // 5개의 int형 공간이 생성, 초기화값 : 0
		String[] c = new String[5]; // 5개의 문자타입 생성, 초기화값 : null
		
		b[0] = 12;
		b[1] = 15;
		b[2] = 233;
		
		// 실제적으로 추가된 개수와 상관없음. 생성할 때의 개수일뿐
		System.out.println(b.length);; // => 5
		
		// 제너릭 형태 => 객체를 생성하면 타입도 설정할 수 있는 클래스
		List<Integer> arr = new ArrayList<Integer>();
		List<String> arr1 = new ArrayList<String>();
		
		for (int i=0; i<3; i++) {
			arr.add(10 + i);
		}
		arr.size();
	}

}
