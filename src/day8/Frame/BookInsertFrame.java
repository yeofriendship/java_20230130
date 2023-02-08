package day8.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import day8.Book;
import day8.BookDB;
import day8.BookDBImpl;

public class BookInsertFrame extends JDialog implements ActionListener {
	
	private JTextField textField;   // 제목
	private JTextField textField_1; // 저자
	private JTextField textField_2; // 가격
	private JTextField textField_3; // 분류
	
	private JButton btnNewButton; 	// 등록하기
	
	// 객체 생성하기 => DB 접속, 2개 컬렉션 가져오기 수행...
	private  BookDB bookDB = new BookDBImpl();
	
	public BookInsertFrame() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(77, 47, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(77, 90, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 135, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(77, 180, 116, 21);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		this.btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(87, 230, 97, 23);
		this.btnNewButton.addActionListener(this); // 2번
		getContentPane().add(btnNewButton);
		
		this.setSize(300, 400);
		this.setVisible(true);
	}
	
	// 1번
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼이 클릭될 때 실행되는 위치
		System.out.println(e.getActionCommand());
		
		if (e.getActionCommand().equals("등록하기")) {
			// 사용자가 입력한 4개의 항목 정보 가져오기
			String title = textField.getText();
			String author = textField_1.getText();
			String price = textField_2.getText();
			String cate = textField_3.getText();
			
			// Book 타입으로 객체 생성
			Book book = new Book();
			book.setTitle(title);
			book.setAuthor(author);
			book.setPrice(Long.parseLong(price)); // String -> long
			book.setCate(cate.charAt(0)); // String -> char
			
			int ret = bookDB.insertBook(book);
			System.out.println(ret);
			
			if (ret == 1) {
				JOptionPane.showMessageDialog(null, "책 등록 성공!");
				System.exit(0); // 화면을 종료시키기
			}
			else {
				JOptionPane.showMessageDialog(null, "책 등록 실패");
			}
		}
	}
}
