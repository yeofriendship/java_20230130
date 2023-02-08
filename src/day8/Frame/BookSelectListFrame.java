package day8.Frame;

import java.awt.BorderLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import day8.Book;
import day8.BookDB;
import day8.BookDBImpl;

public class BookSelectListFrame extends JDialog {
	
	private BookDB bookDB = new BookDBImpl(); // DB연결 필요한 컬렉션 객체 생성 완료됨.
	
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	public BookSelectListFrame() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		
		// 컬럼명 넣기 (1)
		// Vector와 ArrayList는 같은 기능
//		Vector<String> vector = new Vector<String>();
//		vector.add("번호");
//		vector.add("제목");
//		vector.add("저자");
//		vector.add("가격");
//		vector.add("분류");
//		vector.add("날짜");
//		
//		DefaultTableModel model = new DefaultTableModel(vector, 0);
		
		// 컬럼명 넣기 (2)
		String[] column = {"번호", "제목", "저자", "가격", "분류", "날짜"};
		DefaultTableModel model = new DefaultTableModel(column, 0);
		
		// 데이터 넣기
		List<Book> list = bookDB.selectBookList();
		for (Book book : list) {
			String[] data = {
					book.getNo() + "",
					book.getTitle(),
					book.getAuthor(),
					book.getPrice() + "",
					book.getCate() + "",
					book.getDate() + ""
			};
			model.addRow(data);
		}
		
		table.setModel(model);
		
		
		// 스크롤
		JScrollPane jScrollPane = new JScrollPane(table);
		getContentPane().add(jScrollPane, BorderLayout.CENTER);
		
		this.setSize(600, 500);
		this.setVisible(true);
	}
	
}
