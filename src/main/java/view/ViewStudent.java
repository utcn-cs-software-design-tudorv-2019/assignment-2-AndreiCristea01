package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewStudent extends JFrame{
	
	private JPanel contentPane_s;
	private JTextField name_s;
	private JTextField cnp_s;
	private JTextField id_course_s;
	
	JButton btnViewGrades_s=null;
	JButton btnNewButton_s=null;
	JButton btnNewButton_1s=null;
	JButton btnEnroll_s=null;
	JButton btnNewButton_2s=null;
	JButton btnNewButton_3s=null;
	private JTable table_1;

	public ViewStudent() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		setBounds(100, 100, 500, 400);
		contentPane_s = new JPanel();
		contentPane_s.setBackground(Color.BLACK);
		contentPane_s.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_s);
		contentPane_s.setLayout(null);
		JPanel panel_s = new JPanel();

		 btnViewGrades_s = new JButton("View Grades");
		
		btnViewGrades_s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewGrades_s.setBounds(123, 45, 103, 23);
		contentPane_s.add(btnViewGrades_s);

		 btnNewButton_s = new JButton("Information");
		
		btnNewButton_s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_s.setBounds(10, 45, 103, 23);
		contentPane_s.add(btnNewButton_s);

		 btnNewButton_1s = new JButton("Update info");
		
		btnNewButton_1s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1s.setBounds(10, 11, 103, 23);
		contentPane_s.add(btnNewButton_1s);

		 btnEnroll_s = new JButton("Enroll");
		
		btnEnroll_s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEnroll_s.setBounds(123, 11, 103, 23);
		contentPane_s.add(btnEnroll_s);

		JLabel lblNewLabel_s = new JLabel("Name");
		lblNewLabel_s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_s.setForeground(Color.WHITE);
		lblNewLabel_s.setBounds(10, 114, 46, 14);
		contentPane_s.add(lblNewLabel_s);

		 btnNewButton_2s = new JButton("All Course");
	
		btnNewButton_2s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2s.setBounds(123, 79, 103, 23);
		contentPane_s.add(btnNewButton_2s);

		name_s = new JTextField();
		name_s.setBounds(10, 135, 103, 20);
		contentPane_s.add(name_s);
		name_s.setColumns(10);

		JLabel lblCnp_s = new JLabel("CNP");
		lblCnp_s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCnp_s.setForeground(Color.WHITE);
		lblCnp_s.setBounds(10, 166, 46, 14);
		contentPane_s.add(lblCnp_s);

		cnp_s = new JTextField();
		cnp_s.setBounds(10, 191, 103, 20);
		contentPane_s.add(cnp_s);
		cnp_s.setColumns(10);

		JLabel lblIdCourse_s = new JLabel("ID Course");
		lblIdCourse_s.setForeground(Color.WHITE);
		lblIdCourse_s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdCourse_s.setBounds(123, 115, 103, 14);
		contentPane_s.add(lblIdCourse_s);

		id_course_s = new JTextField();
		id_course_s.setBounds(123, 135, 103, 20);
		contentPane_s.add(id_course_s);
		id_course_s.setColumns(10);

		panel_s.setBackground(Color.BLACK);
		panel_s.setBounds(236, 11, 238, 310);
		contentPane_s.add(panel_s);

		 btnNewButton_3s = new JButton("Delete Enr");
		
		btnNewButton_3s.setBounds(10, 80, 103, 23);
		contentPane_s.add(btnNewButton_3s);

	}
	
	public String getNameStudent() {
		return name_s.getText();
	}
	public String getCnpStudent() {
		return cnp_s.getText();
	}
	public String getIdCourse() {
		return id_course_s.getText();
	}
	public void addViewGradesListener(ActionListener al) {
		btnViewGrades_s.addActionListener(al);
	}
	public void addUpdateInfoListener(ActionListener al) {
		btnNewButton_1s.addActionListener(al);
	}
	public void addEnrollListener(ActionListener al) {
		btnEnroll_s.addActionListener(al);
	}
	public void addAllCourseListener(ActionListener al) {
		btnNewButton_2s.addActionListener(al);
	}
	public void addDeleteEnrollmentListener(ActionListener al) {
		btnNewButton_3s.addActionListener(al);
	}

}
