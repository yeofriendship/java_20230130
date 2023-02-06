package day6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Exam1 {
	// 클래스의 변수
	private int age = 1;
	
	// 생성자 : Main에서 클래스를 생성할때 초기값으로 세팅용
	// 빈 생성자
	public Exam1() {
		super();
	}
	
	// 모든 필드를 포함한 생성자
	public Exam1(int age) {
		super();
		this.age = age;
	}
	
	// 메소드 (getter, setter, toString도 일종의 메소드임)
	// public 리턴타입 메소드명(외부로부터 넘겨받는 값 == 파라미터){}
	public void  printAge() {
		System.out.println(this.age*2);
	}
}
