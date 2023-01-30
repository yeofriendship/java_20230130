package main;

// 주석문 -> ctrl + shift + /
/* 여러줄 */
// 블록 주석 -> ctrl + /

// 클래스명 첫번째 문자 : 대문자 ex) Student Car StudentClass
// 변수명 첫번째 문자 : 소문자 ex) car student studentAge
// 메소드(함수) ex) printMyAge()

public class Main1 {

	public static void main(String[] args) {
		// ctrl + space : 코드 상세
		System.out.println("hello world");
		
		// 타입 변수명 = 초기값
		// byte, short, int(32 비트), long(64 비트) => 정수(소수점 X)
		// char => 문자
		// float, double => 실수(소수점 O)
		// boolean => 논리형(참 or 거짓 / true or false)
		
		int a = 15;
		int b = 16;
		
		System.out.println(a + b); // 더하기
		System.out.println(a - b); // 빼기
		System.out.println(a * b); // 곱하기
		// 나누기 	(정수 / 정수 => 정수)
		//		(정수 / 실수 => 실수)
		System.out.println(a / b); // 나누기
		System.out.println(a % b); // 나머지
		
		// 문제 1) int a = 124;일 경우 각 자리수의 합을 구하시오.(100~999)
		// ex) 124 => 7
		// ex) 235 => 10
		int c = 124;
		int c1 = c % 10; // 4
		int c2 = c / 10 % 10; // 2
		int c3 = c / 100; // 1
		int c4 = c1 + c2 + c3;
		System.out.println("문제 1 : " + c4);
		
		// 문제 2) 1000~9999의 숫자를 뒤집어서 출력하시오.
		// ex) 2451 -> 1542
		int d = 2451;
		int d1 = d % 10; // 1
		int d2 = d / 10 % 10; // 5
		int d3 = d / 100 % 10; // 4
		int d4 = d / 1000; // 2
		int d5 = d1*1000 + d2*100 + d3*10 + d4;
		System.out.println("문제 2 : " + d5);
	}

}
