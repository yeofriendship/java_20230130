package main;
 
import java.util.Scanner;

public class Main6_6 {

	public static void main(String[] args) {
		// 문제 3) 숫자 10을 입력하면 홀수의 합, 짝수의 합 각각 구하기
		// 결과 : 10 => 1 3 5 7 9 => 25
		//         => 2 4 6 8 10 => 30
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int i = 0;
		int sum1 = 0; // 홀수 합
		int sum2 = 0; // 짝수 합
		
		// 홀수
		for (i=1; i<=num; i++) {
			if (i%2 != 0) {
				sum1 += i;
				System.out.print(i + " ");
			}
		}
		System.out.println("=> " + sum1);
		
		// 짝수
		for (i=1; i<=num; i++) {
			if (i%2 == 0) {
				sum2 += i;
				System.out.print(i + " ");
			}
		}
		System.out.println("=> " + sum2);

	}

}
