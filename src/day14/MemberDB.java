package day14;

import java.util.Map;

public interface MemberDB {
	// 회원 가입
	public int memberJoin(Member member);
	
	// 로그인
	public Member memberLogin(Map<String, Object> map);
	
	// 회원정보 조회
	public Member memberSelectOne(String id);
	
	// 회원정보 변경(비밀번호 변경 X)
	public int memberUpdateOne(Member member);
	
	// 비밀번호 변경
	public int memberUpdatePwOne(Map<String, Object> map);
	
	// 회원 탈퇴
	public int memberDeleteOne(String id);
}
