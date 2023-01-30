package main;

import java.util.Scanner;

public class Main6_5 {

	public static void main(String[] args) {
		// 문제 2) 숫자 13을 입력하면 3의 배수의 합 구하기
		// 결과 : 3 6 9 12 => 30
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int i = 0;
		int sum = 0;
		for (i=1; i<=num; i++) {
			if (i%3 == 0){
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.print("=> " + sum);
	}

}
