package main;

import java.util.Scanner;

// 반복문
public class Main6 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명(준비물)
		Scanner sc = new Scanner(System.in);
		
		// 키보드로 정수형 숫자 입력받기
		int num = sc.nextInt();
		sc.close();
		
		// 1. for문
		// for (임시변수=초기값; 임시변수 조건문; 임시변수 증감){}
		// i++ => i = i + 1
		// i+=2 => i = i + 2
		int i;
		for (i=1; i<=num; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (i=num; i>=1; i--) {
			System.out.print(i + " ");
		}	
	}

}
