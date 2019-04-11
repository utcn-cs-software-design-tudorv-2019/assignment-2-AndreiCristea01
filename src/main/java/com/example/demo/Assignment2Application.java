package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import Controller.HomePageController;
import model.StudentModel;
import model.TeacherModel;
import view.ViewProject;



@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Assignment2Application.class)
		.headless(false)
		.run(args);
		

}
	
	@Bean
    public ViewProject homeFrame() {
        return new ViewProject();
    }
	
	
	@Bean
    public StudentModel createStudentModel() {
        return new StudentModel();
    }
	
	@Bean
    public TeacherModel createTeacherModel() {
        return new TeacherModel();
    }
	
	@Bean
    public HomePageController createHomePageController() {
        return new HomePageController();
    }
}
