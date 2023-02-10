package day4;

import java.util.Date;

import day10.Member;

public class MemberMain {

	public static void main(String[] args) {
		// 1. 객체 생성(값 세팅)
		Member member = new Member("abcdefg", "hijklmn", 
									"신애린", "010-9896-1402", 
									"D", new Date());
		
		System.out.println(member.toString());		
		
		// 2. 세팅된 이름값이 유효한지 확인하기
		member.invalidName();
		
		// 3. 세팅된 휴대폰 번호 길이가 정확한지 확인하기
		member.invalidPhone();
		
		// 4. 세팅된 권한 정보가 C와 S로만 되어있는지 확인하기
		member.invalidRole();
		
		// 5. 세팅된 id의 길이가 30자 이내인지 확인하기
		member.invalidId();
		
		// 6. 연락처 정보를 00000000000으로 반환하는 메소드
		member.splitPhone();
		
		// 추가 예제)
		Member member1 = new Member("abcdddddddddddddddddddddddddddddddddefg", 
									"opqrstu", "여우정", 
									"010-9446-2987", 
									"C", new Date());
		System.out.println();
		System.out.println(member1.toString());
		member1.invalidName();
		member1.invalidPhone();
		member1.invalidRole();
		member1.invalidId();
		member1.splitPhone();
	}

}
