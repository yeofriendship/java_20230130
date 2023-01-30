package main;

import java.util.Scanner;

public class Main6_7 {
 
	public static void main(String[] args) {
		// 문제 4) 숫자 7을 입력하면 구구단 구하기
		// 7 * 1 = 7
		// 7 * 2 = 14
		// ...
		// 7 * 9 = 63
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int i = 0;
		for (i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
