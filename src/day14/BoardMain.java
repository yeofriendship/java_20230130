package day14;

import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		DBConn db = DBConn.getInstance();
		
		BoardDB bDB = new BoardDBImpl();
		
		// insertBoardOne
		Board board = new Board();
//		board.setTitle("신애린이");
//		board.setContent("도와준");
//		board.setWriter("문제");
//		board.setHit(100L);
//		board.setDate(new Date());
//		System.out.println(bDB.insertBoardOne(board));
		
		// selectBoardList
//		List<Board> list = bDB.selectBoardList(1);
//		for (Board b : list) {
//			System.out.println("번호 : " + b.getNo());
//			System.out.println("제목 : " + b.getTitle());
//			System.out.println("내용 : " + b.getContent());
//			System.out.println("작성자 : " + b.getWriter());
//			System.out.println("조회수 : " + b.getHit());
//			System.out.println("게시일 : " + b.getDate());
//			System.out.println("-----------------------------------");
//		}
		
		// selectBoardOne
//		System.out.println(bDB.selectBoardOne(6L));
		
		// updateBoardOne
//		board.setNo(5L);
//		board.setTitle("내일은");
//		board.setContent("금요일");
//		System.out.println(bDB.updateBoardOne(board));
		
		// deleteBoardOne
//		System.out.println(bDB.deleteBoardOne(10L));
	}

}
