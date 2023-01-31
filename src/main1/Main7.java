package main1;

import cls.KorScore;

public class Main7 {

	public static void main(String[] args) {
		// 1. 사용자가 입력한 값
		String[] s1 = {"가", "나", "다", "라", "마"};
		int[] s2 = {20, 99, 70, 98, 100};
		
		// 2. KorScore 클래스로 계산해야하는 데이터를 전송(Setter)
		KorScore obj = new KorScore();
		obj.setStudent(s1);
		obj.setScore(s2);
		
		// 3. 출력
		System.out.println(obj.toString());
		
		// 4. 전체 합계 구하기
		System.out.println("점수는 총 " + obj.sumScore() + "점 입니다.");
		
		// 5. 평균 구하기
		System.out.println("평균은 " + obj.avgScore() + "점 입니다.");
		
		// 6. 최고 점수
		System.out.println("최고 점수는 " + obj.maxScore() + "점 입니다.");
		
		// 7. 최저 점수
		System.out.println("최저 점수는 " + obj.minScore() + "점 입니다.");
		
		// 8. 90점 이상인 사람이 몇 명인지?
		System.out.println("90점 이상인 사람은 총 " + obj.score90() + "명 입니다.");
	}

}
