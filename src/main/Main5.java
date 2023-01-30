package main;

import java.util.Scanner;

// 세 수를 입력받아 세 수의 평균 구분
public class Main5 {
	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명(준비물)
		Scanner	sc = new Scanner(System.in);
		
		float a1 = sc.nextFloat();
		float a2 = sc.nextFloat();
		float a3 = sc.nextFloat();
		
		float avg = (a1+a2+a3) / 3.0f;
		
		if (avg >= 90) {
			System.out.println("A");
		}
		else if (avg >= 80) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
		
		// scanner 닫기(마지막에 한번만)
		sc.close();
	} 
}
