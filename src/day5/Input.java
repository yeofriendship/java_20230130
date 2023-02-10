package day5;

import java.util.Date;
import java.util.Scanner;

import cls.Book;
import day10.Member;

// 입력을 담당하는 클래스
public class Input {
	// 변수 X
	
	public static Member inputData() {
		Scanner in = new Scanner(System.in);
		System.out.println("가입정보입력 => 아이디, 암호, 이름, 연락처, 권한");
		//  ex) a, b, 가나다, 010-0000-0000, C
		
		// 문제 1) ,로 분할하고 각각의 데이터에 대해서 앞뒤로 공백이 있으면 제거
		String data = in.nextLine();
		in.close();
		
		// (1) ,로 분할 => split()
		String[] str = data.split(",");
		
		Member member = null; // 아직 객체가 안만들어 졌음
		
//		if (str.length == 5) { // 가입정보가 5개일때만
//			for(int i=0; i<str.length; i++) {
//				System.out.print(str[i]);
//			}
//		}
//		
//		System.out.println();
		
		// (2) 앞뒤로 공백 제거 => trim()
		if (str.length == 5) { // 가입정보가 5개일때만
			member = new Member(str[0].trim(),
					str[1].trim(), str[2].trim(),
					str[3].trim(), str[4].trim(),
					new Date());
		}
		
		return member;
	}
	
	public static Book inputBookData() {
		Scanner in = new Scanner(System.in);
		System.out.println("책정보입력 => 책번호,책제목,저자,가격,분류('A', 'B', 'C')");
		
		String data = in.next();
		// Main2.java 실행할때는 주석처리 해줘야 실행됨
		// in.close();
		
		// ,로 분할하고 각각의 데이터에 대해서 앞뒤로 공백이 있으면 제거
		String[] str = data.split(",");
		
		Book book = null;
		
		if (str.length == 5) {
			// 형 변환은 static 메소드
			// 변수들의 데이터타입이 String이 아닌 것이 있어서 형 변환이 필요함
			int no = Integer.parseInt(str[0]); // 형 변환
			String title = str[1];
			String author = str[2];
			long price = Long.parseLong(str[3]); // 형 변환
			char cate = str[4].charAt(0); // 형 변환
			
			book = new Book(no, title,
					author, price, cate, new Date());
		}
		
		return book;
	}
}
