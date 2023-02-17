package day15;

import java.util.Date;

import lombok.Data;

@Data
// 책 타입 생성
public class Book {
	private long code = 0L;
	private String title = null;
	private String author = null;
	private long price = 0L;
	private Date regdate = new Date();
}
