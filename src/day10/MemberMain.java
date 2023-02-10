package day10;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		// DB연결과 컬렉션 선택된 상황
		MemberDB mDB = new MemberDBImpl();
		
		// insertMemberMap
		// 빈 map 객체를 생성
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("_id", "fff");
//		map.put("password", "fff");
//		map.put("name", "이름");
//		map.put("phone", "010");
//		map.put("role", "S");
//		map.put("age", 19);
//		map.put("regdate", new Date());
//				
//		int ret = mDB.insertMemberMap(map);
//		System.out.println(ret);
		
		// selectMemberMapOne
//		Map<String, Object> map = mDB.selectMemberMapOne("ddd");
//		System.out.println("아이디 => " + map.get("_id"));
//		System.out.println("암호 => " + map.get("password"));
//		System.out.println("이름 => " + map.get("name"));
//		System.out.println("연락처 => " + map.get("phone"));
//		System.out.println("권한 => " + map.get("role"));
//		System.out.println("나이 => " + map.get("age"));
//		System.out.println("등록일 => " + map.get("regdate"));
		
		// selectMemberMapList
//		List<Map<String, Object>> list = mDB.selectMemberMapList();
//		for(Map<String, Object> map : list) {
//			System.out.println("아이디 => " + map.get("_id"));
//			System.out.println("암호 => " + map.get("password"));
//			System.out.println("이름 => " + map.get("name"));
//			System.out.println("연락처 => " + map.get("phone"));
//			System.out.println("권한 => " + map.get("role"));
//			System.out.println("나이 => " + map.get("age"));
//			System.out.println("등록일 => " + map.get("regdate"));
//			System.out.println("-------------------------------------");
//		}
		

		AddressDB aDB = new AddressDBImpl();
		// insertAddress
//		Address address = new Address();
//		address.setAddress("서울");
//		address.setPostcode("66666");
//		address.setRegdate(new Date());
//		
//		Member member = new Member();
//		member.setId("eee");
//		address.setMemberid(member);
//		
//		int ret = aDB.insertAddress(address);
//		System.out.println(ret);
		
		// selectAddressOne
//		Address address = aDB.selectAddressOne(10003L);
//		System.out.println("코드 => " + address.getCode());
//		System.out.println("주소 => " + address.getAddress());
//		System.out.println("우편번호 => " + address.getPostcode());
//		System.out.println("날짜 => " + address.getRegdate());
//		System.out.println("*****************회원 정보*****************");
//		System.out.println("아이디 : " + address.getMemberid().getId());
//		System.out.println("암호 : " + address.getMemberid().getPassword());
//		System.out.println("이름 : " + address.getMemberid().getName());
//		System.out.println("연락처  : " + address.getMemberid().getPhone());
//		System.out.println("권한 : " + address.getMemberid().getRole());
//		System.out.println("나이 : " + address.getMemberid().getAge());
//		System.out.println("등록일 : " + address.getMemberid().getRegdate());
//		// System.out.println("회원 정보 => " + address.getMemberid());
		
		// selectAddressList
		Member member = new Member();
		member.setId("bbb");
		List<Address> list = aDB.selectAddressList(member);
		for (Address address : list) {
			System.out.println("회원 정보 => " + address.getMemberid());
			System.out.println("코드 => " + address.getCode());
			System.out.println("주소 => " + address.getAddress());
			System.out.println("우편번호 => " + address.getPostcode());
			System.out.println("날짜 => " + address.getRegdate());
			System.out.println("------------------------------------");
		}
		
		
	}

}
