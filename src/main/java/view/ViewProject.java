package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;



import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class ViewProject extends JFrame{
	
	private JFrame frame;
	private JTextField name_login;
	private JTextField password_login;
	private JPanel contentPane;
	private JTable table;
	
	JButton btnNewButton=null;
	JButton btnNewButton_1=null;
	JButton btnNewButton_3=null;
	JButton btnNewButton_4=null;


	// login
	private JPanel contentPane_login;
	private JLabel lblUsernameOrPassword;

	private JTable table_1;
	ViewStudent v = null;
	ViewAdmin a = null;
	RegistrationStudent rs = null;
	RegistrationTeacher rt = null;



	public ViewProject() {
		initialize();

	}

	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		name_login = new JTextField();
		name_login.setBounds(88, 83, 159, 20);
		frame.getContentPane().add(name_login);
		name_login.setColumns(10);

		password_login = new JTextField();
		password_login.setBounds(88, 144, 159, 20);
		frame.getContentPane().add(password_login);
		password_login.setColumns(10);

		 btnNewButton = new JButton("Login Student");
	

		btnNewButton.setBounds(292, 82, 112, 23);
		frame.getContentPane().add(btnNewButton);

		 btnNewButton_1 = new JButton("Login Admin");
	
		btnNewButton_1.setBounds(292, 127, 112, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(88, 58, 159, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(88, 119, 159, 14);
		frame.getContentPane().add(lblNewLabel_1);

		 btnNewButton_3 = new JButton("Register Student");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
	
		btnNewButton_3.setBounds(267, 227, 137, 23);
		frame.getContentPane().add(btnNewButton_3);

		 btnNewButton_4 = new JButton("Register Teacher");
		
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(267, 187, 137, 23);
		frame.getContentPane().add(btnNewButton_4);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void login() {

		setBounds(100, 100, 350, 200);
		contentPane_login = new JPanel();
		contentPane_login.setForeground(Color.WHITE);
		contentPane_login.setBackground(Color.BLACK);
		contentPane_login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_login);
		contentPane_login.setLayout(null);

		lblUsernameOrPassword = new JLabel("Username or password is incorrect");
		lblUsernameOrPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsernameOrPassword.setForeground(Color.WHITE);
		lblUsernameOrPassword.setBounds(42, 68, 267, 30);
		contentPane_login.add(lblUsernameOrPassword);
		setVisible(true);

	}
	public void addLoginStudentListener(ActionListener al) {
		btnNewButton.addActionListener(al);
	}
	public void addLoginTeacherListener(ActionListener al) {
		btnNewButton_1.addActionListener(al);
	}
	public void addRegisterStudentListener(ActionListener al) {
		btnNewButton_3.addActionListener(al);
	}
	public void addRegisterTeacherListener(ActionListener al) {
		btnNewButton_4.addActionListener(al);
	}
	public String getNameLogin() {
		
		return name_login.getText();
	}
public String getPasswordLogin() {
		
		return password_login.getText();
	}



}
