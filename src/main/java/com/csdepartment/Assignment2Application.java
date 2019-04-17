package com.csdepartment;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import com.csdepartment.mvc.controller.HomePageController;
import com.csdepartment.mvc.model.StudentModel;
import com.csdepartment.mvc.model.TeacherModel;
import com.csdepartment.mvc.view.ViewProject;
import com.csdepartment.validators.StudentValidator;
import com.csdepartment.validators.TeacherValidator;








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
	@Bean
    public TeacherValidator createTeacherValidator() {
        return new TeacherValidator();
    }
	
	@Bean
    public StudentValidator createStudentValidator() {
        return new StudentValidator();
    }

	
	
}
