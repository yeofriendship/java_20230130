package day14;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		DBConn db = DBConn.getInstance();
		
		MemberDB mDB = new MemberDBImpl();
		
		// 회원 가입
//		Member member = new Member();
//		member.setId("2번");
//		member.setPassword("암호");
//		member.setName("가나다라마바사");
//		member.setPhone("010-0000-1111");
//		member.setRole("C");
//		member.setAge(35);
//		member.setRegdate(new Date());
//		System.out.println(mDB.memberJoin(member));
		
		// 로그인
		Map<String, Object> map = new HashMap<>();
//		map.put("_id", "1번");
//		map.put("password", "qwerty");
//		Member member = mDB.memberLogin(map);
//		if (member == null) {
//			System.out.println("아이디 또는 암호가 틀립니다.");
//		}
//		else {
//			System.out.println(member.getName() + " 님 로그인 성공!!");
//		}
		
		// 회원정보 조회
//		Member m1 = mDB.memberSelectOne(member.getId());
//		System.out.println("아이디 : " + m1.getId());
//		System.out.println("비밀번호 : " + m1.getPassword());
//		System.out.println("이름 : " + m1.getName());
//		System.out.println("연락처 : " + m1.getPhone());
//		System.out.println("권한 : " + m1.getRole());
//		System.out.println("나이 : " + m1.getAge());
//		System.out.println("등록일자 : " + m1.getRegdate());
//		System.out.println(mDB.memberSelectOne(member.getId()));
		
		// 회원정보 변경(비밀번호 변경 X)
//		member.setId("aaa1");
//		member.setName("타파하");
//		member.setPhone("010-0000-0000");
//		member.setRole("S");
//		member.setAge(15);
//		System.out.println(mDB.memberUpdateOne(member));
		
		// 비밀번호 변경
		map.put("_id", "aaa1");
		map.put("password", "비밀번호 변경!!");
		map.put("changePw", "비밀번호");
		System.out.println(mDB.memberUpdatePwOne(map));
		
		// 회원 탈퇴
//		System.out.println(mDB.memberDeleteOne("bbb22"));
	}

}
