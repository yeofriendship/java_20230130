package cls;

import java.util.Date;

// 내가 원하는 타입을 만듬. 실행하는 클래스 X
// 아이디, 비밀번호, 이메일, 나이, 연락처, 가입일자 (설계상에서 정해지는 항목)
public class Member {
	String userId = "";
	String userPw = "";
	String userEmail = "";
	int userAge = 0;
	String userPhone = "000-0000-0000";
	Date userDate = null;
	
	// setter => 누군가에 의해서 값을 저장시키는 역할
	// getter => 누군가에 의해서 값을 가지는 역할
	
	// 메소드, 함수
	// 1. Main4에서 사용할 수 있다 - public
	// 2. 반환타입 - String : 문자로 반환(리턴)
	//			- void : 반환값(리턴값)이 없음
	// 3. 메소드명(Main4에서 전달할 값)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
	
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail + ", userAge=" + userAge
				+ ", userPhone=" + userPhone + ", userDate=" + userDate + "]";
	}
	
	

}
