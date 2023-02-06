package day6;

import cls.Professor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Exam2 {
	private int age = 0;
	private static int age1 = 100;
	
	public void plusAge() {
		// this.age = this.age + 1;
		this.age++;
	}
	
	public void forAge() {
		for(int i=1; i<=this.age; i++) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		int m = 1;
		while(m<=this.age) {
			System.out.print(m + ", ");
			m++;
		}
	}
	
	public static void plusAge1() {
		age1++;
	}
	
	public void printAge() {
		System.out.println("age => " + age);
		System.out.println("age1 => " + age1);
	}
}
