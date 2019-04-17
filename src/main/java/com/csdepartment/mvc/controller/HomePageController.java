package com.csdepartment.mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import com.csdepartment.entities.Exam;
import com.csdepartment.entities.Student;
import com.csdepartment.entities.Teacher;
import com.csdepartment.mvc.model.StudentModel;
import com.csdepartment.mvc.model.TeacherModel;
import com.csdepartment.mvc.view.RegistrationStudent;
import com.csdepartment.mvc.view.RegistrationTeacher;
import com.csdepartment.mvc.view.ViewAdmin;
import com.csdepartment.mvc.view.ViewProject;
import com.csdepartment.mvc.view.ViewStudent;
import com.csdepartment.services.ExamService;
import com.csdepartment.services.StudentService;
import com.csdepartment.services.TeacherService;
import com.csdepartment.validators.StudentValidator;
import com.csdepartment.validators.TeacherValidator;




public class HomePageController {
	
	@Inject
	TeacherService teacherService;
	@Inject
	StudentService studentService;
	@Inject
	ExamService courseService;
	@Inject
	TeacherValidator teacherValidator;
	@Inject
	StudentValidator studentValidator;
	
	private StudentModel studentModel;
	private TeacherModel teacherModel;
	
	private RegistrationStudent registrationStudent;
	private RegistrationTeacher registrationTeacher;
	private ViewAdmin viewAdmin;
	private ViewStudent viewStudent;
	private ViewProject viewProject;
	
	public void init(ViewProject ViewProject, StudentModel studentModel, TeacherModel teacherModel) {
		
		this.viewProject = ViewProject;
		this.studentModel = studentModel;
		this.teacherModel = teacherModel;
		
		this.registrationStudent=new RegistrationStudent();
		this.registrationTeacher=new RegistrationTeacher();
		this.studentModel=new StudentModel();
		this.teacherModel=new TeacherModel();
		this.viewAdmin=new ViewAdmin();
		this.viewStudent=new ViewStudent();
		
		viewProject.addRegisterStudentListener(new RegisterStudentListener());
		viewProject.addRegisterTeacherListener(new RegisterTeacherListener());
		viewProject.addLoginStudentListener(new LoginStudentListener());
		viewProject.addLoginTeacherListener(new LoginTeacherListener());
		
		registrationStudent.addStudentRegistrationListener(new RstudentListener());
		registrationTeacher.addTeacherRegistrationListener(new TteacherListener());
		
		viewStudent.addInfoListener(new InfoListener());
		viewStudent.addUpdateInfoListener(new UpdateListener());
		viewStudent.addEnrollListener(new EnrollListener());
		viewStudent.addViewGradesListener(new GradesListener());
		viewStudent.addDeleteEnrollmentListener(new DeleteEnrollListener());
		viewStudent.addAllCourseListener(new AllExamsListener());
		
		viewAdmin.addAddCourseListener(new AddCourseListener());
		viewAdmin.addMyCourseListener(new MyCourseListener());
		viewAdmin.addStudentsListener(new StudentsListener());
		viewAdmin.addUpdateDateListener(new UpdateGradeListener());
		
	}
class UpdateGradeListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		
			List<Exam> exams=courseService.getAllCourses();
			
			for(Exam exam:exams) {
				
				if(exam.getCourseid()==Integer.parseInt(viewAdmin.getIdCourse()) && 
						    exam.getStudent().getStudentid()==Integer.parseInt(viewAdmin.getIdStudent())
						    ) {
					exam.setCredits(Integer.parseInt(viewAdmin.getGrade()));
					courseService.update(exam);
					
				}
			}
			
			
		}
		
		
	}
class AddCourseListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		
			courseService.insert(new Exam(viewAdmin.getCourseName(),4,teacherModel.getTeacher(),null));
			
			
		}
		
		
	}
class MyCourseListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
	
	
	List<Exam> exams=courseService.getAllCourses();
		String[][] data = new String[100][100];
		String[] Column = { "Name" ,"ID"};

		data[0][0] = "Course";
		data[0][1]="ID";
		
		int i=1;
	for(Exam exam:exams) {
		if(exam.getTeacher().getTeacherid()==teacherModel.getTeacher().getTeacherid())
		{
			data[i][0]=exam.getName();
			data[i][1]=Integer.toString(exam.getCourseid());
			i++;
		}
		
	}
	viewAdmin.addTable(new JTable(data,Column));
		
		
	}
	}
	

class StudentsListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		
	
		List<Exam> exams=courseService.getAllCourses();
		String[][] data = new String[100][100];
		String[] Column = { "Name" ,"ID"};

		data[0][0] = "Name";
		data[0][1]="ID";
		
		int i=1;
		
		for(Exam exam: exams) {
			if(exam.getCourseid()==Integer.parseInt(viewAdmin.getIdCourse()))
					{
				
						data[i][0]=exam.getStudent().getName();
						data[i][1]=Integer.toString(exam.getStudent().getStudentid());
						i++;
					}
		
			
		}
		viewAdmin.addTable(new JTable(data,Column));
		
	}
	
	
}
	
	
class AllExamsListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			List<Exam> exams=courseService.getAllCourses();
			String[][] data = new String[100][100];
			String[] Column = { "Name", "grade" };

			data[0][0] = "Course";
			data[0][1] = "ID";
			int i=1;
		for(Exam exam:exams) {
			
				data[i][0]=exam.getName();
				data[i][1]=Integer.toString(exam.getCourseid());
			
			i++;
		}
		viewStudent.addTable(new JTable(data,Column));
			
	}
		
		
	}
class UpdateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			Student student=studentModel.getStudent();
			student.setCnp(viewStudent.getCnpStudent());
			student.setName(viewStudent.getNameStudent());
			student.setStudentid(studentModel.getStudent().getStudentid());
			studentService.update(student);
	}
		
		
	}
class InfoListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			Student student=studentModel.getStudent();
			viewStudent.setName(student.getName());
			viewStudent.setCNP(student.getCnp());
			
	}
		
		
	}
	class RegisterStudentListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		
			registrationStudent.setVisible(true);
			
			
		}
		
		
	}
class GradesListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		
			List<Exam> exams=courseService.getAllCourses();
			String[][] data = new String[100][100];
			String[] Column = { "Name", "grade" };

			data[0][0] = "Course";
			data[0][1] = "Grade";
			int i=1;
		for(Exam exam:exams) {
			if(exam.getStudent().getStudentid()==studentModel.getStudent().getStudentid())
			{
				data[i][0]=exam.getName();
				data[i][1]=Integer.toString(exam.getCredits());
			}
			i++;
		}
		viewStudent.addTable(new JTable(data,Column));
			
			
		}
		
		
	}
class DeleteEnrollListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		
	
	Exam exam=courseService.getByCourseid(Integer.parseInt(viewStudent.getIdCourse()));

		courseService.delete(exam);
		
	}
	
	
}
class EnrollListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		
		Exam exam=courseService.getByCourseid(Integer.parseInt(viewStudent.getIdCourse()));
		exam.setStudent(studentModel.getStudent());
			courseService.update(exam);
			
		}
		
		
	}
class RegisterTeacherListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
			
			registrationTeacher.setVisible(true);
		}
		
		
	}
class LoginStudentListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		
		Student student=studentService.getStudentById(1);
		studentModel.setStudent(student);
		viewStudent.setStudentModel(studentModel);
		viewStudent.setVisible(true);
		
	}
	
	
}
class LoginTeacherListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Teacher teacher=teacherService.getTeacherByName("teacher");
		teacherModel.setTeacher(teacher);
		viewAdmin.setTeacherModel(teacherModel);
		
		
		viewAdmin.setVisible(true);
		
		
		
	}
	
	
}
class RstudentListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Student student=new Student(registrationStudent.getName(),registrationStudent.getCNP(),registrationStudent.getUsername(),registrationStudent.getPassword());
		studentService.insert(student);
		
		
		
	}
	
	
}
class TteacherListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Teacher teacher=new Teacher(registrationTeacher.getName(),registrationTeacher.getUsername(),registrationTeacher.getPassword());
		
		teacherService.insert(teacher);
	}
	
	
}


}
