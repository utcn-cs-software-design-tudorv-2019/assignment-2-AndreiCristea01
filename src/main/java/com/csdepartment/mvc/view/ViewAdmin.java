package com.csdepartment.mvc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.csdepartment.mvc.model.StudentModel;
import com.csdepartment.mvc.model.TeacherModel;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class ViewAdmin extends JFrame{
	
	private JPanel contentPane_t;
	private JTable table;

	private JTextField id_course_t;
	private JTextField id_student_t;
	private JTextField grade_t;
	private JTextField course_name_t;
	private JTextField date_t;
	

	JButton btnNewButton_t=null;
	JButton btnNewButton_1t=null;
	JButton btnNewButton_2t=null;
	JButton add_course_t=null;
	TeacherModel teacherModel=null;
	JPanel panel_t =null;
	public ViewAdmin() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setBounds(100, 100, 500, 400);
		contentPane_t = new JPanel();
		contentPane_t.setForeground(Color.WHITE);
		contentPane_t.setBackground(Color.BLACK);
		contentPane_t.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_t);
		contentPane_t.setLayout(null);

		 panel_t = new JPanel();
		panel_t.setBackground(Color.BLACK);
		panel_t.setBounds(226, 11, 248, 284);
		contentPane_t.add(panel_t);

		table = new JTable();

		 btnNewButton_t = new JButton("My Courses");
		btnNewButton_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
	
		btnNewButton_t.setBounds(10, 11, 110, 23);
		contentPane_t.add(btnNewButton_t);

		 btnNewButton_1t = new JButton("Students");
	
		btnNewButton_1t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1t.setBounds(10, 45, 110, 23);
		contentPane_t.add(btnNewButton_1t);

		id_course_t = new JTextField();
		id_course_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		id_course_t.setBounds(130, 30, 86, 22);
		contentPane_t.add(id_course_t);
		id_course_t.setColumns(10);

	 btnNewButton_2t = new JButton("Update Grade");
	
		btnNewButton_2t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2t.setBounds(10, 79, 110, 23);
		contentPane_t.add(btnNewButton_2t);

		JLabel lblIdCourse_t = new JLabel("ID Course");
		lblIdCourse_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdCourse_t.setForeground(Color.WHITE);
		lblIdCourse_t.setBounds(130, 11, 86, 19);
		contentPane_t.add(lblIdCourse_t);

		JLabel lblNewLabel_t = new JLabel("ID Student");
		lblNewLabel_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_t.setForeground(Color.WHITE);
		lblNewLabel_t.setBounds(130, 50, 86, 18);
		contentPane_t.add(lblNewLabel_t);

		id_student_t = new JTextField();
		id_student_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		id_student_t.setBounds(130, 69, 86, 22);
		contentPane_t.add(id_student_t);
		id_student_t.setColumns(10);

		JLabel Grade_t = new JLabel("Grade");
		Grade_t.setForeground(Color.WHITE);
		Grade_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Grade_t.setBounds(130, 91, 86, 21);
		contentPane_t.add(Grade_t);

		grade_t = new JTextField();
		grade_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		grade_t.setBounds(130, 111, 86, 21);
		contentPane_t.add(grade_t);
		grade_t.setColumns(10);
		
		JLabel lblNewLabel_2t = new JLabel("Date Course");
		lblNewLabel_2t.setForeground(Color.WHITE);
		lblNewLabel_2t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2t.setBounds(130, 176, 86, 14);
		contentPane_t.add(lblNewLabel_2t);

		 add_course_t = new JButton("Add Course");
		
		add_course_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add_course_t.setBounds(10, 113, 110, 23);
		contentPane_t.add(add_course_t);

		JLabel lblNewLabel_1_t = new JLabel("Course Name");
		lblNewLabel_1_t.setForeground(Color.WHITE);
		lblNewLabel_1_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_t.setBounds(130, 132, 86, 23);
		contentPane_t.add(lblNewLabel_1_t);

		course_name_t = new JTextField();
		course_name_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		course_name_t.setBounds(130, 154, 86, 20);
		contentPane_t.add(course_name_t);
		course_name_t.setColumns(10);

		

		date_t = new JTextField();
		date_t.setFont(new Font("Tahoma", Font.PLAIN, 12));
		date_t.setBounds(130, 194, 86, 20);
		contentPane_t.add(date_t);
		date_t.setColumns(10);

	

	
	}


	public String getIdCourse() {
		
		return id_course_t.getText();
	}
public String getIdStudent() {
		
		return id_student_t.getText();
	}
public String getGrade() {
	
	return grade_t.getText();
}
public String getCourseName() {
	
	return course_name_t.getText();
}
public String getDate() {
	
	return date_t.getText();
}
public void addMyCourseListener(ActionListener al) {
	btnNewButton_t.addActionListener(al);
}
public void addStudentsListener(ActionListener al) {
	btnNewButton_1t.addActionListener(al);
}
public void addUpdateDateListener(ActionListener al) {
	btnNewButton_2t.addActionListener(al);
}
public void addAddCourseListener(ActionListener al) {
	add_course_t.addActionListener(al);
}
public TeacherModel getTeacherModel() {
	return teacherModel;
}

public void setTeacherModel(TeacherModel teacherModel) {
	this.teacherModel = teacherModel;
}
	public void addTable(JTable table) {
		
		panel_t.removeAll();
		panel_t.add(table);
		panel_t.updateUI();
	}

}
