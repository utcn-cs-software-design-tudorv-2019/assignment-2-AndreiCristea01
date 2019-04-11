package Controller;

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

import Services.ExamService;
import Services.StudentService;
import Services.TeacherService;
import model.StudentModel;
import model.TeacherModel;
import view.RegistrationStudent;
import view.RegistrationTeacher;
import view.ViewAdmin;
import view.ViewProject;
import view.ViewStudent;

public class HomePageController {
	
	@Inject
	TeacherService teacherService;
	@Inject
	StudentService studentService;
	@Inject
	ExamService courseService;
	
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
		
	}

}
