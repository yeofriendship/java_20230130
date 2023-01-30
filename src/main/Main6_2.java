package main;

import java.util.Scanner;

public class Main6_2 {

	public static void main(String[] args) {
		// 문제 2) 1~10까지 숫자 -> 3의 배수는 1, 3의 배수가 아니면 0으로 출력
		// 		     1 2 3 4 5 6 7 8 9 10
		// 출력 결과 => 0 0 1 0 0 1 0 0 1 0
		Scanner scanner = new Scanner(System.in);		
		int num = scanner.nextInt();
		scanner.close();

		int i;
		
		for (i=1; i<=num; i++) {
			if (i%3 == 0) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
			}
		}
		
	}

}
