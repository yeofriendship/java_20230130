package day10;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Member {
	private String id = null;
	private String password = null;
	private String name = null;
	private String phone = null;	// ex) 000-0000-0000
	private String role = null;		// 권한 (C : 고객 / S : 판매자)
	private int age = 0;
	private Date regdate = null;

	// getter, setter, toString 생성하기 => lombok 사용(@~)
	
	// 빈 생성자
	public Member() {
		super();
	}
	
	// 모든 필드가 있는 생성자
	public Member(String id, String password, String name, String phone, String role, Date regdate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.role = role;
		this.regdate = regdate;
	}
	
	// 이름의 길이가 유효한지 확인하는 메소드
	public boolean invalidName() {
		// 2~4자 사이만 true를, 그 이외에는 false를 반환하기
		if (this.name.length() >= 2 && this.name.length() <= 4) {
			return true;
		}
		System.out.println("이름을 2~4자로 입력하세요.");
		return false;
	}
	
	// 휴대폰 번호 길이가 정확한지 확인하는 메소드
	public int invalidPhone() {
		if (this.phone.length() == 13 ) {
			return 1;
		}
		System.out.println("휴대폰 길이를 정확하게 입력하세요.");
		return 0;
	}
	
	// 권한 정보가 C와 S로만 되어있는지 확인하는 메소드
	public int invalidRole() {
		// !! 문자열은 equals라는 메소드를 활용해서 두개의 값을 비교한다 !!
		if (this.role.equals("C")) {
			System.out.println("고객입니다.");
			return 1;
		}
		else if (this.role.equals("S")) {
			System.out.println("판매자입니다.");
			return 1;
		}
		else {
			System.out.println("권한 정보를 C나 S로 입력하세요.");
			return 0;
		}
	}
	
	// id는 길이가 30자 이내만 가능하게 하는 메소드
	public boolean invalidId() {
		if (this.id.length() > 0 && this.id.length() <= 30) {
			return true;
		}
		System.out.println("id 길이를 30자 이내로 입력하세요.");
		return false;
	}
	
	// 연락처 정보가 000-0000-0000인데 00000000000으로 반환하는 메소드(split 사용하기)
	public String[] splitPhone() {
		String[] sPhone = this.phone.split("-");
		
		for (int i=0; i<sPhone.length; i++) {
			System.out.print(sPhone[i]);
		}
		
		return sPhone;
	}
}
