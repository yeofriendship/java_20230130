package day5;

public class ExamMain {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 생성자명();		
		// Exam<String> obj = new Exam<String>();
		Exam<String> obj1 = new Exam<>();
		obj1.setElement("aaa");
		String str1 = obj1.getElement();
		System.out.println(str1);
		
		// 에러 발생 -> 제너릭 클래스의 타입은 원시타입은 불가능하다!!
		// Exam<int> obj2 = new Exam<int>();
		Exam<Integer> obj3 = new Exam<Integer>();
		obj3.setElement(13);
		int str3 = obj3.getElement();
		System.out.println(str3);
	}

}
