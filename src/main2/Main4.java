package main2;

import java.util.Date;

import cls.Course;
import cls.Professor;
import cls.Register;
import cls.Student;

public class Main4 {

	public static void main(String[] args) {
		// 1. 학생 등록
		Student student = new Student(703, "여우정", 3, new Date());
		
		// 2. 교수 등록
		Professor professor = new Professor(3000, "신애린", "304호", new Date());
		
		// 3. 과목 등록
		// 생성자를 만들어주지 않았기 때문에 set~ 해줘야함
		Course course = new Course();
		
		course.setCode(4000);
		course.setCredit(3);
		course.setName("컴퓨터활용능력 1급");
		course.setDate(new Date());
		course.setProfessor(professor);
		
		// 4. 수강신청(1개만)
		// 생성자를 만들어주지 않았기 때문에 set~ 해줘야함
		Register register = new Register();
		
		register.setCode(3333);
		register.setCourse(course);
		register.setStudent(student);
		register.setDate(new Date());
		
		// 5. 수강신청 내역 출력
		System.out.println(register.toString());
	}

}
