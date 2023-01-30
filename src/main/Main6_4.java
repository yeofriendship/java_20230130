package main;

import java.util.Scanner;

public class Main6_4 {
 
	public static void main(String[] args) {
		// 문제 1) 숫자 5를 입력하면 아래처럼 출력하시오
		// 결과 : 1 2 3 4 5 4 3 2 1
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int i = 0;
		for (i=1; i<=num; i++) {
			System.out.print(i + " ");
		}
		for (i=num-1; i>=1; i--) {
			System.out.print(i + " ");
		}
	}

}
