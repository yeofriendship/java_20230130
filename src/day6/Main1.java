package day6;

import day5.Exam;

public class Main1 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 생성자명();
		Exam1 exam1 = new Exam1(10);
		
		// 메소드는 객체명을 통해 접근함
		exam1.printAge();
		
		// 다시 나이정보를 변경
		exam1.setAge(20);
		exam1.printAge();
	}

}
