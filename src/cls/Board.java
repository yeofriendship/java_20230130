package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

// 글번호(long) - brdNo
// 글제목(String) - brdTitle
// 글내용(String) - brdContent
// 작성자(String) - brdWriter
// 조회수(long) - brdHit
// 등록일자(Date) - brdDate

public class Board {
	// 1. 적절한 타입으로 필요한 항목 만들기
	private long brdNo = 0L;
	private String brdTitle = "";
	private String brdContent = "";
	private String brdWriter = "";
	private long brdHit = 0L;
	private Date brdDate = null;
	
	// 2. getter & setter
	// => 변수명이 변경되면 오류 발생함
	// getter와 setter를 더 유용하게 사용 
	// -> lombok 라이브러리 - 편리성, 연결성
	// 오라클 라이브러리

	// lombok 라이브러리를 사용할 것이라 getter와 setter는 사용 X
//	public long getBrdNo() {
//		return brdNo;
//	}
//	public void setBrdNo(long brdNo) {
//		this.brdNo = brdNo;
//	}
//	public String getBrdTitle() {
//		return brdTitle;
//	}
//	public void setBrdTitle(String brdTitle) {
//		this.brdTitle = brdTitle;
//	}
//	public String getBrdContent() {
//		return brdContent;
//	}
//	public void setBrdContent(String brdContent) {
//		this.brdContent = brdContent;
//	}
//	public String getBrdWriter() {
//		return brdWriter;
//	}
//	public void setBrdWriter(String brdWriter) {
//		this.brdWriter = brdWriter;
//	}
//	public long getBrdHit() {
//		return brdHit;
//	}
//	public void setBrdHit(long brdHit) {
//		this.brdHit = brdHit;
//	}
//	public Date getBrdDate() {
//		return brdDate;
//	}
//	public void setBrdDate(Date brdDate) {
//		this.brdDate = brdDate;
//	}

	
	// 3. toString으로 만들기
//	@Override
//	public String toString() {
//		return "Board [brdNo=" + brdNo + ", brdTitle=" + brdTitle + ", brdContent=" + brdContent + ", brdWriter="
//				+ brdWriter + ", brdHit=" + brdHit + ", brdDate=" + brdDate + "]";
//	}
	
	// 4. Main5 클래스를 생성한 다음 게시글 1개를 적절한 내용으로 추가한 후 출력하기
}
