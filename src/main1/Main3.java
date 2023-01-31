package main1;

// 문자열
// char는 원시 타입, String은 클래스형
public class Main3 {

	public static void main(String[] args) {
		// import 안함
		// 클래스명 객체명 = new 클래스명(생성자);
		String str = new String("hello world");
		String str1 = "hello world";
		
		System.out.println(str);
		System.out.println(str1);
		
		// String 클래스의 기능
		// substring(시작 인덱스, 끝+1 인덱스)
		System.out.println(str.substring(0, 3));
		
		// split(구분할 문자)
		// ret[0] = hello
		// ret[1] = world
		String[] ret = str.split(" "); // str을 공백을 기준으로 나눔 -> ret라는 String을 만들고 저장
		System.out.println(ret[0]);
		System.out.println(ret[1]);
	}

}
