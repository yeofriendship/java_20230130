package day10;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// 배열과 다른 점
		// (1) 순차적으로 데이터가 추가되지 않음
		// (2) 키를 통해서 데이터 꺼냄 (키는 고유해야함, 같은 것은 존재할 수 없음)
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", "abc");
		map.put("name", "가나다");
		map.put("age", 21);
		map.put("name", "나다라"); // name의 "가나다"는 없어짐
		
		// 꺼낸 value가 Object 이기 때문에 형 변환 필요
		String id = (String) map.get("id"); 
		String name = (String) map.get("name");
		int age = (int) map.get("age");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

}
