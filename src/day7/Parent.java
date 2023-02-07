package day7;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Parent {
	private String name = null;
	private int age = 0; // 원시 타입
	private Integer age1 = null; // Object 타입

	// 생성자
	public Parent() {
		super();
	}
	
	public void work() {
		System.out.println("parent work");
	}
	
	public void study() {
		System.out.println("parent study");
	}
}
