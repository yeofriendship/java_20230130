package day4;

import java.util.Date;

import day10.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Item {
	private long code = 0L;
	private String name = null;
	private String content = null;
	private int price = 0;
	private int quantity = 0;
	private Date regdate = new Date();
	private Member memberid = null;
	
	// getter, setter, toString 생성하기 => lombok 사용(@~)
	
	// 빈 생성자
	public Item() {
		super();
	}
	
	// 날짜 필드를 제외한 필드 생성자
	public Item(long code, String name, String content, int price, int quantity, Member memberid) {
		super();
		this.code = code;
		this.name = name;
		this.content = content;
		this.price = price;
		this.quantity = quantity;
		this.memberid = memberid;
	}
	
	// 1. 수량이 n개 미만이면 n개로 변경하는 메소드
	public int underCount(int n) {
		if (this.quantity < n) {
			this.quantity = n;
		}
		
		return this.quantity;
	}
	
	// 2. 가격에 할인율만큼 빼서 리턴하는 메소드
	public int percentPrice(float per) {
		this.price = (int)(this.price - this.price*per); 
		
		return this.price;
	}
	
	// 3. 총 판매금액을 리턴하는 메소드 (가격*수량)
	public int totalPrice() {
		int total = this.price * this.quantity;
		
		return total;
	}
	
	// 4. 내용이 20자를 초과하면
	// ex) 12345678901234567890... 으로 변환하는 메소드
	public void checkContent() {
		String[] str = this.content.split("");
		
		if (this.content.length() > 20) {
			for (int i=0; i<20; i++) {
				System.out.print(str[i]);
			}
			System.out.print("...");
			System.out.println();
		}
		else {
			System.out.println(this.content);
		}
	}
	
	// 5. 이름을 뒤집어서 반환하는 메소드 ex) 가나다 -> 다나가
	public void reverseName1() {
		String[] str = this.name.split("");
		
		for (int i=str.length; i>0; i--) {
			System.out.print(str[i-1]);
		}
	}
	
	public String reverseName2() {
		String[] str = this.name.split("");
		String res = ""; // 문자를 누적할 변수
		
		for (int i=str.length; i>0; i--) {
			res = res + str[i-1];
		}
		
		return res;
	}
	
	public String reverseName3() {
		String res = ""; // 문자를 누적할 변수
		
		for (int i=this.name.length()-1; i>=0; i--) {
			char str = this.name.charAt(i);
			res = res + str;
		}
		
		return res;
	}
}
