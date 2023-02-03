package frame;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import java.awt.Checkbox;
import java.awt.Label;
import javax.swing.JFormattedTextField;

// 1. extends JDialog 상속
public class JoinFrame extends JDialog{
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	public JoinFrame() {
		setTitle("회원 가입");
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("취소하기");
		btnNewButton.setBounds(215, 324, 97, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(90, 65, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(90, 105, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(90, 145, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(196, 62, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(90, 185, 57, 15);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(196, 142, 116, 21);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 182, 116, 21);
		getContentPane().add(textField_3);
		
		JButton btnNewButton_1 = new JButton("등록하기");
		btnNewButton_1.setBounds(90, 324, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("가입 구분");
		lblNewLabel_4.setBounds(90, 225, 57, 15);
		getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"고객", "판매자"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(196, 222, 116, 21);
		getContentPane().add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(196, 102, 116, 21);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("등록 일자");
		lblNewLabel_5.setBounds(90, 265, 57, 15);
		getContentPane().add(lblNewLabel_5);
		
		this.setModal(true);
		this.setSize(426, 434);
		this.setVisible(true);
	}
}
