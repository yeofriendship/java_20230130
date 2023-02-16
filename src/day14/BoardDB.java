package day14;

import java.util.List;

public interface BoardDB {
	// 게시판 글쓰기
	public int insertBoardOne(Board board);
	
	// 게시판 조회(최신글 순으로 10개씩)
	// 페이지 알려주면 그 페이지부터 10개
	public List<Board> selectBoardList(int page);
	
	// 게시판 1개 조회
	public Board selectBoardOne(long no);
	
	// 게시판 수정 (제목, 내용만 변경)
	public int updateBoardOne(Board board);
	
	// 게시판 삭제
	public int deleteBoardOne(long no);
}
