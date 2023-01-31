package main1;

// 배열
public class Main2 {

	public static void main(String[] args) {
		// 배열의 인덱스 : 0부터 시작해서 (전체 개수)-1까지
		int[] age = {1, 2, 4, 5, 12}; // 나이 변수 5개 생성
		System.out.println(age[0]);
		System.out.println(age[4]);
		
		int i=0;
		for (i=0; i<age.length; i++) {
			System.out.print(age[i] + " ");
		}
		
		System.out.println();
		
		// 문제 1) age의 값들을 반대로 출력하시오. => 12 5 4 2 1
		for (i=age.length-1; i>=0; i--) {
			System.out.print(age[i] + " ");
		}
		
		System.out.println();
		
		for (i=0; i<age.length; i++) {
			System.out.print(age[age.length-1-i] + " ");
		}
		
		System.out.println();
		
		// 문제 2) age의 값들의 합과 평균을 구하시오.
		int sum=0;
		for (i=0; i<age.length; i++) {
			sum += age[i];
		}
		System.out.println("age의 합 : " + sum);
		float avg = (float)sum / (float)age.length;
		System.out.println("age의 평균 : " + avg);
		
		// 문제 3) age 5개 중에서 짝수만 출력하시오.
		for (i=0; i<age.length; i++) {
			if (age[i]%2==0) {
				System.out.print(age[i] + " ");
			}
		}
		
		System.out.println();
	}

}
