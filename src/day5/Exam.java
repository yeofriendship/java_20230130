package day5;

// 제너릭 클래스
// : 타입을 설정한 다음에 클래스로 사용하겠다
// T는 정해져 있지 않음 => T는 ExamMain에서 정할 예정
public class Exam<T> {
	// 변수 1개
	private T element;

	// Getter, Setter
	// public 반환타입 메소드명(){}
	// 리턴타입 : T
	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
}
