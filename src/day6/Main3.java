package day6;

import java.util.Date;

public class Main3 {

	public static void main(String[] args) {
		// 1. 객체 생성
		// db서버에 접속하고 members collection에 접속
		MemberDB mDB = new MemberDB();
		
		// 2. 회원가입하고 싶은 임시 데이터
		// (아이디, 암호, 이름, 연락처, 나이, 권한, 현재시간)
//		Member member = new Member("aaa1", "pw1", "이름", "010",
//				12, "C", new Date());

		// 3. DB에 추가하는 메소드 수행
//		int ret = mDB.insertMember(member);
//		System.out.println(ret);
		
		// 전체 회원 조회
//		mDB.printMembers();
		
		// 이름이 "가나다"인 회원만 조회
//		mDB.printMembersName("가나다");
		
		// 고객만 조회
//		mDB.printMemberRole("C");
		
		// 나이가 n 이상인 회원만 조회
		mDB.printMemberAge(50);
	}

}
