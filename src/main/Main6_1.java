package main;

import java.util.Scanner;

public class Main6_1 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명(준비물)
		Scanner sc = new Scanner(System.in);

		// 키보드로 정수형 숫자 입력받기
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		sc.close();

		// 문제 1) 두 개의 숫자를 입력받아서 범위만큼 출력
		// ex) 3 7 => 3 4 5 6 7
		// ex) 8 2 => 2 3 4 5 6 7 8
		int k;
		if (num < num1) {
			for (k = num; k <= num1; k++) {
				System.out.print(k + " ");
			}
		} 
		else if (num > num1) {
			for (k = num1; k <= num; k++) {
				System.out.print(k + " ");
			}
		} 
		else {
			System.out.println("두 수를 다르게 입력하세요.");
		}

	}

}
