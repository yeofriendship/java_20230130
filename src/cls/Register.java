package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

// 수강신청
public class Register {
	private int code = 0;
	private Course course = null; 	// 신청 과목
	private Student student = null; // 학생
	private Date date = new Date();
	
	// Main4에서 수강신청하기
	
	// course에서 교수 정보를 제외한 과목 정보만 보는 메소드
	
}
