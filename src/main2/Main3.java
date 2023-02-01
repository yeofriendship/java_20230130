package main2;

import java.util.Date;

import cls.Course;
import cls.CourseList;
import cls.Professor;

public class Main3 {

	public static void main(String[] args) {
		// 1. 교수 생성
		Professor professor = new Professor(3000, "신애린", "304호", new Date());
		
		// 2. 과목 생성
		Course course = new Course();
		
		course.setCode(4000);
		course.setCredit(3);
		course.setName("컴퓨터활용능력 1급");
		course.setDate(new Date());
		course.setProfessor(professor);
		
		// 3. 과목 등록
		CourseList courseList = new CourseList();
		courseList.insertCourse(course);
		
		// 4. 과목 조회
		courseList.printCourse();
		
		// 5. 등록한 과목의 교수정보를 조회(출력)
		courseList.printProfessor();
		
		// 6. 등록된 교과목의 교수정보 중에서 교수명과 교수방 조회
		courseList.printProfessorNameAndRoom();
	}

}
