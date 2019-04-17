package com.csdepartment;

import javax.inject.Inject;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.csdepartment.mvc.controller.HomePageController;
import com.csdepartment.mvc.model.StudentModel;
import com.csdepartment.mvc.model.TeacherModel;
import com.csdepartment.mvc.view.ViewProject;
import com.csdepartment.services.StudentService;
import com.csdepartment.services.TeacherService;





@Component
public class Loader implements ApplicationListener<ContextRefreshedEvent>{
	
	
	@Inject
	StudentService studentService;
	@Inject
	TeacherService teacherService;
	@Inject
	ViewProject homePage;
	@Inject
	StudentModel studentModel;
	@Inject
	TeacherModel teacherModel;
	@Inject
	HomePageController homePageController;
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		homePageController.init(homePage, studentModel, teacherModel);

	}

}
