package cls;

// 등록된 교과목 목록을 저장하는 클래스
public class CourseList {
	// 10개를 보관할 수 있는 배열
	// 배열은 반드시 개수가 필요함
	// Course의 필드들을 배열로 만들어서 courseArray에 넣는다
	private Course[] courseArray = new Course[10];
	
	private int idx = 0; // 배열 내부의 개수를 저장하는 변수
	
	// 과목을 1개씩 등록할 수 있는 메소드
	public void insertCourse(Course course) {
		if (this.idx < this.courseArray.length) {
			this.courseArray[this.idx] = course;
			this.idx++;
		}
		else {
			System.out.println("등록 불가");
		}
	}
	
	// 추가된 과목의 전체 내용 출력
	public void printCourse() {
		for (int i=0; i<idx; i++) {
			System.out.println(this.courseArray[i].toString());
		}
	}
	
	// 등록된 교과목의 교수 정보를 출력하는 메소드
	public void printProfessor() {
		for(int i=0; i<this.idx; i++) {
			Professor professor = this.courseArray[i].getProfessor();
			System.out.println(professor.toString());
		}
	}
		
	// 등록된 교과목의 교수 정보 중에서 교수명과 교수방을 출력하는 메소드
	public void printProfessorNameAndRoom() {
		for(int i=0; i<this.idx; i++) {
			Professor professor = this.courseArray[i].getProfessor();
			
			System.out.println("교수명 : " + professor.getName() + " / 교수방 : " + professor.getRoom());
		}
	}
	
	// 마지막에 추가한 과목을 삭제하는 메소드
	public void deleteCourse() {
		
	}
	
	// 과목 중에서 전달받는 학점에 해당하는 과목 조회
	// ex) 3을 전달하면 3학점에 해당하는 과목만 출력
}
