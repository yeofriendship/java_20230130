package day6;

public class Main2 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 생성자명();
		Exam2 obj1 = new Exam2(); // age => 0, age1 => 100
		
		obj1.plusAge(); // age => 1, age1 => 100
		obj1.plusAge(); // age => 2, age1 => 100

//		obj1.printAge();
		
//		// 클래스명 객체명 = new 생성자명();
//		// obj1과 obj2는 서로 공유하지 X(객체는 만들때마다 초기화됨)
//		Exam2 obj2 = new Exam2(); // age => 0, age1 => 100
//		
//		obj2.plusAge(); // age => 1, age1 => 100
//		obj2.printAge();
//		
//		// static 변수는 객체를 만들지 않고
//		// 클래스명.메소드명();
//		Exam2.plusAge1(); // age1 => 101
//		Exam2.plusAge1(); // age1 => 102
		
		obj1.plusAge(); // age => 3
		
		obj1.forAge();
	}

}
