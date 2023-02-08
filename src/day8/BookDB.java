package day8;

import java.util.List;

public interface BookDB {
	// 책 등록
	public int insertBook(Book book);
	
	// 책 전체 조회
	public List<Book> selectBookList();
	
	// 책 10개씩 조회 (책 번호를 받으면 그 번호부터 10개씩 조회)
	public List<Book> selectBookListPage(int page);
	
	// 책 삭제
	public int deleteBook(int no);
	
	// 책 수정
	public int updateBook(Book book);
	
	// 책 1권 조회
	public Book selectBookOne(int no);
	
	// 가격이 n 이상인 책 조회
	public List<Book> selectBookPrice(long price);
	
	// 분류에 해당하는 항목만 조회
	public List<Book> selectBookCate(char cate);
}
