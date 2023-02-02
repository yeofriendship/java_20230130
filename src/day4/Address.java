package day4;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Address {
	private long code = 0L;
	private String address = null;
	private String postcode = null;
	private Date regdate = new Date();
	private Member memberid = null;
	
	// getter, setter, toString 생성하기 => lombok 사용(@~)
	
	// 빈 생성자
	public Address() {
		super();
	}
	
	// 날짜 필드를 제외한 필드 생성자
	public Address(long code, String address, String postcode, Member memberid) {
		super();
		this.code = code;
		this.address = address;
		this.postcode = postcode;
		this.memberid = memberid;
	}
	
	// 1. 코드가 1000~9999 사이인지 확인하는 메소드
	public int checkCode() {
		if (this.code >= 1000 && this.code <=9999) {
			return 1;
		}
		System.out.println("code를 1000~9999 사이로 입력하세요.");
		return 0;
	}
	
	// 2. 주소는 100 미만인지 확인하는 메소드
	public int checkAddress() {
		if (this.address.length() < 100) {
			return 1;
		}
		System.out.println("주소를 100글자 미만으로 입력하세요.");
		return 0;
	}
	
	// 3. 우편번호가 5자리인지 확인하는 메소드
	public int checkPostcode() {
		if (this.postcode.length() == 5) {
			return 1;
		}
		System.out.println("우편번호를 5자리로 입력하세요.");
		return 0;
	}
	
	
	// Date 타입 -> String으로 변경
	// 4. 날짜에서 년만 반환하는 메소드 (문자로)
	public String getYear() {
		SimpleDateFormat obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String year = obj.format(this.regdate);
		
		System.out.println("년도 : " + year.substring(0, 4));
		return year;
	}
	
	// 5. 날짜에서 월만 반환하는 메소드 (문자로)
	public String getMonth() {
		SimpleDateFormat obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String month = obj.format(this.regdate);
		
		System.out.println("월 : " + month.substring(5, 7));
		return month;
	}
	
	// 6. 날짜에서 일만 반환하는 메소드 (문자로)
	public String getDay() {
		SimpleDateFormat obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String day = obj.format(this.regdate);
		
		System.out.println("월 : " + day.substring(8, 10));
		return day;
	}
}
