package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Student {
	private int no = 0; 		// 학번
	private String name = null; // 이름
	private int grade = 1; 		// 학년
	private Date date = null; 	// 등록일자
	
	// 빈 생성자
	public Student() {
		super();
	}
	
	// 모든 필드가 있는 생성자
	public Student(int no, String name, int grade, Date date) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.date = date;
	}
	
	// 학년을 1씩 증가시키는 메소드 (4학년까지만)
	public void plusGrade() {
		this.grade++;
		
		if (this.grade > 4) {
			this.grade = 4;
		}
	}
}
