package day8.Frame;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import day8.Book;
import day8.BookDB;
import day8.BookDBImpl;

public class BookSelectListPageFrame extends JDialog implements ItemListener {
	private BookDB bookDB = new BookDBImpl(); // DB연결 필요한 컬렉션 객체 생성 완료됨.
	
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JComboBox<String> combo;
	
	public BookSelectListPageFrame() {
		// 전체 레이아웃 BorderLayout
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		// 중앙의 table 위치
		table = new JTable();
		
		printAction(1);
		
		// 스크롤
		JScrollPane jScrollPane = new JScrollPane(table);
		getContentPane().add(jScrollPane, BorderLayout.CENTER);
		
		// 위쪽에 페이지번호 세팅
		combo = new JComboBox<>();
		combo.addItem("1");
		combo.addItem("2");
		combo.addItem("3");
		combo.addItemListener(this);
		getContentPane().add(combo, BorderLayout.NORTH);
		
		this.setSize(600, 500);
		this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			// 여기가 선택된 페이지 번호
			System.out.println(combo.getSelectedItem());
			
			int page = Integer.parseInt(combo.getSelectedItem().toString());
			
			printAction(page);
		}
	}
	
	public void printAction(int page) {
		String[] column = {"번호", "제목", "저자", "가격", "분류", "날짜"};
		DefaultTableModel model = new DefaultTableModel(column, 0);
		
		List<Book> list = bookDB.selectBookListPage(page);
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
	}
}
