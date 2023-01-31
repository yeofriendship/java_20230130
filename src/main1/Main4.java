package main1;

import java.util.Date;

// import 단축키 : ctrl + shift + o
import cls.Member;

public class Main4 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명();
		Member member = new Member();
		
		member.setUserId("aaa");
		String result = member.getUserId();
		System.out.println(result);
//		System.out.println(member.getUserId());
		
		member.setUserAge(13);
		member.setUserEmail("a@a.com");
		member.setUserPw("bbb");
		member.setUserPhone("010-0000-0001");
		
		// 클래스명 객체명 = new 클래스명();
		Date date = new Date();
		member.setUserDate(date);
		
		
		// 오버라이딩(Override)
		// -> 15번~16번 라인(17번 라인)을 변수마다 적어주지 않아도 결과값이 나옴
		System.out.println(member.toString());
	}

}
