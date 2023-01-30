package main;

import java.util.Scanner;

// ctrl + shift + f : 자동 정렬
// ctrl + alt + 화살표 : 복사&붙이기
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int a = sc.nextInt(); // nextInt() : int

		// = : 값을 넣음
		// == : 같은지?
		// != : 같지 않은지?
		// && : AND
		// || : OR

		if (a % 5 == 0) {
			System.out.println("입력한 값은 5의 배수임");
		} 
		else {
			System.out.println("입력한 값은 5의 배수가 아님");
		}

		// 100~90 : A
		// 89~80 : B
		// 79~70 : C
		// 나머지 : D
		if ( 90 <= a && a <= 100) {
			System.out.println("A");
		}
		else if ( 80 <= a && a <= 89) {
			System.out.println("B");
		}
		else if ( 70 <= a && a <= 79) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		// 문제 1) 입력받은 숫자 a가 짝수인지 홀수인지 확인
		System.out.print("문제 1) ");
		if (a%2 == 0) {
			System.out.println("a는 짝수입니다.");
		}
		else {
			System.out.println("a는 홀수입니다.");
		}
		
		// 문제 2) 입력받은 숫자가 3, 5, 3 5 인지 확인
		// ex) 15 => 3 5
		// ex)  5 => 5
		System.out.print("문제 2) ");
		if (a%3 == 0 && a%5 == 0) {
			System.out.println("3 5");
		}
		else if (a%3 == 0) {
			System.out.println("3");
		}
		else if (a%5 == 0) {
			System.out.println("5");
		}
		else {
			System.out.println("3이나 5의 배수가 아님");
		}
		
		sc.close();
	}

}
