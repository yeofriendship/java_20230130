package main1;

import java.util.Date;

import cls.Board;

public class Main5 {

	public static void main(String[] args) {
		// 1. 객체 생성
		// 클래스명 객체명 = new 클래스명();
		Board board = new Board();
		
		// 2. 객체를 기반으로 메소드를 사용해서 적절한 일을 수행
		board.setBrdNo(123456L);
		board.setBrdTitle("부경대학교 용당캠퍼스");
		board.setBrdContent("빅데이터를 이용한 자바 개발자 두번째 수업");
		board.setBrdWriter("여우정");
		board.setBrdHit(100L);
		
		// 현재 날짜를 출력하기 위해 Date 클래스를 import하고 사용
		Date date = new Date();
		board.setBrdDate(date);
		// board.setBrdDate(new Date());	=> 이렇게 한번에 써도 OK
		
		// 3. toString을 호출해서 현재의 값을 반환 후에 출력
		System.out.println(board.toString());
	}

}
