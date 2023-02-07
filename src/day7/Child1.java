package day7;

// extends 클래스명 => 클래스를 100% 상속받는다

public class Child1 extends Parent {

	@Override // 부모의 기능을 재정의 할 것임
	public void work() {
		// 부모의 work() 메소드를 호출함
		super.work(); // 부모의 기능
		
		System.out.println("child1 work"); // 내가 필요한 기능 추가
	}
	
}
