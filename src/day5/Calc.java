package day5;

public class Calc {
	// 변수 X
	
	// getter, setter, toString X
	// 생성자를 만들지 않으면 public Calc(){}
	
	// 2개의 정수가 전달되면 합을 리턴하는 메소드
	public int sumPlus(int n, int m) {
		return n+m;
	}
	
	// 2개의 정수가 전달되면 실수형 몫을 리턴하는 메소드
	public float sumDiv(int n, int m) {
		// 예외처리 1) try~catch
		// 나눗셈 : 분모가 0이 되면 안됨 => 예외처리
		try {
			float div = n / m; // 정수/정수 => 정수
			return div;
			
			// 실행 0
			// 실행 1 (오류 발생 -> 실행 2는 실행하지 않고 바로 catch로 간다)
			// 실행 2
			
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace(); // 오류를 추가할 수 있게 상세히 출력해줌(개발자를 위해서)
			return 0.0f;
		}
	}
	
	// 2개의 정수가 전달되면 뺀 값을 리턴하는 메소드
	// 예외처리 2) public ~ () throws Exception{}
	public int sumMinus(int n, int m) throws Exception {
		return n-m;
	}
	
	// 2개의 정수가 전달되면 곱을 리턴하는 메소드
	// static : 정적
	public static int sumMul(int n, int m) {
		return n*m;
	}
}
