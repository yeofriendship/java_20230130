package day8;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Book {
	private int no = 0;
	private String title = null;
	private String author = null;
	private long price = 0L;
	private char cate = 'A';
	private Date date = null;
}
