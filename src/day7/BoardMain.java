package day7;

import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		// 설계도면 객체 = new 실제로구현한클래스의생성자();
		BoardDAO obj = new BoardDAOImpl();
		
		// 1. 게시글 추가
		// 고객이 입력한 내용에 해당
//		Board board = new Board();
//		
//		board.setBrdTitle("글제목4");
//		board.setBrdContent("글내용4");
//		board.setBrdWriter("작성자4");
//		
//		int ret = obj.insertBoard(board);
//		System.out.println(ret);
		
		// 2. 게시글 1개 조회
//		System.out.println(obj.selectBoardOne(4L).toString());
		
		// 3. 게시글 전체 조회
		// 목록으로 전송됨. 목록은 반드시 반복문을 사용해서 1개씩 출력
//		List<Board> list = obj.selectBoardList();
//
//		// 게시글 전체 조회 (1) - List의 값을 1개씩 꺼내서 one변수에 보관하는 방식
//		for (Board one : list) {
//			System.out.println("글번호 => " + one.getBrdNo());
//			System.out.println("글제목 => " + one.getBrdTitle());
//			System.out.println("글내용 => " + one.getBrdContent());
//			System.out.println("작성자 => " + one.getBrdWriter());
//			System.out.println("조회수 => " + one.getBrdHit());
//			System.out.println("등록일자 => " + one.getBrdDate());
//			System.out.println("---------------------------------------");
//		}
		
		// 게시글 전체 조회 (2) - 배열의 위치를 이용하여 출력하는 방식
//		for(int i=0; i<list.size(); i++) {
//			Board one = list.get(i);
//			System.out.println(one.getBrdNo() + ", "
//					+ one.getBrdTitle() + ", "
//					+ one.getBrdHit() + ", "
//					+ one.getBrdWriter() + ", "
//					+ one.getBrdDate());
//		}
		
		// 4. 게시글 수에 따른 조회 ex) n 이하인 경우
//		List<Board> list = 	obj.selectBoardHitList(100L);
//		for (Board one : list) {
//			System.out.println(one.getBrdNo() + ", "
//					+ one.getBrdTitle() + ", "
//					+ one.getBrdHit() + ", "
//					+ one.getBrdWriter() + ", "
//					+ one.getBrdDate());
//		}
		
		// 5. 게시글 수정
//		Board board = new Board();
//		
//		board.setBrdNo(2L);
//		board.setBrdTitle("신애린");
//		board.setBrdContent("바보");
//		board.setBrdWriter("여우정");
//		
//		System.out.println(obj.updateBoard(board));
		
		// 6. 글 번호가 전달되면 1개 삭제
//		System.out.println(obj.deleteBoard(3L));
	}

}
