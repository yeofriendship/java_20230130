package main1;

public class Main1 {

	public static void main(String[] args) {
		// 원시 타입(소문자)
		// 정수형 : byte, short, int, long
		// 실수형 : float, double
		// 문자형 : char
		// 논리형 : boolean
		
		// 클래스형(맨 앞 첫문자만 대문자)
		// 정수형 : Byte, Short, Integer, Long
		// String, Date
		
		System.out.println(Integer.SIZE); // 32 bit => 4 byte
		
		int age = 13;
		
		// if (조건)
		if (age >= 50) {
			System.out.println("50보다 크거나 같습니다.");
		}
		else {
			System.out.println("50보다 작습니다.");
		}
		
		// for, while, do while
		// (1) for문
		int i=0;
		for (i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (i=1; i<=1000; i++) {
			System.out.print(i + " ");
			if (i>=10) {
				break; // 반복문을 강제로 종료시킴
			}
		}
		System.out.println();
		
		for (i=1; i<=10; i++) {
			if (i%2==0) { // 짝수인 경우
				continue; // 현위치를 기준으로 아래 소스코드는 수행되지 않음
				// 1부터 10까지 홀수만 출력한 것
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
