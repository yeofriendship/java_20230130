package day9;

import java.util.List;

public class ReplyMain {

	public static void main(String[] args) {
		try {
			// 1. 접속, 컬렉션2개 객체 변수 보관
			// 인터페이스명 객체명 = new 클래스명();
			ReplyDB replyDB = new ReplyDBImpl();
			
			// insert
			// 3. 답글 객체
//			Reply reply = new Reply();
//			
//			// 2. 추가하는 메소드
//			reply.setContent("답글4");
//			reply.setWriter("작성자4");
//			reply.setRegdate(new Date());
//			
//			Board board = new Board();
//			board.setBrdNo(4L);
//			reply.setBoard(board);
//			
//			System.out.println(replyDB.insertReply(reply));
			
			// selectreply
//			Reply reply = replyDB.selectReplyreply(203L);
//			if (reply != null) {
//				System.out.println("답글 번호 => " + reply.getNo());
//				System.out.println("답글 내용 => " + reply.getContent());
//				System.out.println("답글 작성자 => " + reply.getWriter());
//				System.out.println("답글 작성일자 => " + reply.getRegdate());
//				System.out.println("원본 게시글 정보 => " + reply.getBoard().toString());
//			}
			
			// selectAll
			// list 내부가 vector, arraylist인지 알 필요 없음
//			List<Reply> list = replyDB.selectReplyList(2L);
//			if (list != null) {
//				for (Reply reply : list) {
//					if (reply != null) {
//						System.out.println("답글 번호 => " + reply.getNo());
//						System.out.println("답글 내용 => " + reply.getContent());
//						System.out.println("답글 작성자 => " + reply.getWriter());
//						System.out.println("답글 작성일자 => " + reply.getRegdate());
//						System.out.println("------------------------------------------");
//					}
//				}
//			}
			
			// delete
//			System.out.println(replyDB.deleteReply(203L));
			
			// update
//			Reply reply = new Reply();
//			reply.setNo(205L);
//			reply.setContent("답글 내용 변경");
//			reply.setWriter("작성자 변경");
//			System.out.println(replyDB.updateReply(reply));
			
			// Board 연결
//			BoardDAO boardDAO = new BoardDAOImpl();
//			List<Board> list = boardDAO.selectBoardList();
//			
//			for(Board board : list) {
//				System.out.println("게시글 번호 => " + board.getBrdNo());
//				System.out.println("게시글 제목 => " + board.getBrdTitle());
//				System.out.println("게시글 내용 => " + board.getBrdContent());
//				System.out.println("게시글 작성자 => " + board.getBrdWriter());
//				System.out.println("게시글 조회수 => " + board.getBrdHit());
//				System.out.println("게시글 등록일자 => " + board.getBrdDate());
//				System.out.println("답글 개수 => " + board.getReplyCount());
//				
//				System.out.print("답글 번호 => ");
//				for (Long doc : board.getReplyNoList()) {
//					System.out.print(doc + " ");
//				}
//				
//				System.out.println();
//				System.out.println("----------------------------");
//			}
			
			// BoardDAO - 답글의 개수가 n개 이상인 게시글 조회
			BoardDAO boardDAO = new BoardDAOImpl();
			List<Board> list = boardDAO.selectBoardReplyCount(2);
			
			for (Board board : list) {
				System.out.println("게시글 번호 => " + board.getBrdNo());
				System.out.println("게시글 제목 => " + board.getBrdTitle());
				System.out.println("게시글 내용 => " + board.getBrdContent());
				System.out.println("게시글 작성자 => " + board.getBrdWriter());
				System.out.println("게시글 조회수 => " + board.getBrdHit());
				System.out.println("게시글 등록일자 => " + board.getBrdDate());
				System.out.println("답글 개수 => " + board.getReplyCount());
				System.out.println("----------------------------");
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
