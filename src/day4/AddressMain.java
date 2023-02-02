package day4;

import java.util.Date;

public class AddressMain {

	public static void main(String[] args) {
		// 멤버 등록
		Member member = new Member("abcdefg", "hijklmn", "신애린",
									"010-9896-1402", "D", new Date());
		
		Address address = new Address(55555, "부산 남구",
										"123456", member);
		System.out.println(address.toString());
		
		// 1. 코드가 1000~9999 사이인지 확인
		address.checkCode();
		
		// 2. 주소는 100 미만인지 확인
		address.checkAddress();
		
		// 3. 우편번호가 5자리인지 확인
		address.checkPostcode();
		
		// 4. 날짜에서 년만 반환
		address.getYear();
		
		// 5. 날짜에서 월만 반환
		address.getMonth();
		
		// 6. 날짜에서 일만 반환
		address.getDay();
	}

}
