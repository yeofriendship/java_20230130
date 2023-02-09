package day8;

// 환경설정과 관련된 속성 정보를 보관하는 클래스(Properties)
public class Config {
	// 서버 접속 정보
	// final : 변경 불가능한 변수 = 상수
	public static final String URL 
		= "mongodb://id211:pw211@1.234.5.158:37017/db211";	
	
	// 사용할 수 있는 인원 정보
	public static final int MAX = 10000;
	
	// 게시글의 숫자를 10개
	public static final int BOARDMAX = 10;
	
	// 데이터베이스 명칭
	public static final String DBNAME = "db211";
	
	// 답글 컬렉션 명칭(테이블)
	public static final String REPLYCOL = "replies";
	
	// 시퀀스용 컬렉션 명칭(테이블)
	public static final String RESEQUENCECOL = "sequence";
}
