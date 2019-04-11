package com.example.demo;

import javax.inject.Inject;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import Controller.HomePageController;
import Services.StudentService;
import model.StudentModel;
import model.TeacherModel;
import view.ViewProject;

public class Loader implements ApplicationListener<ContextRefreshedEvent>{
	
	
	@Inject
	StudentService studentService;
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
