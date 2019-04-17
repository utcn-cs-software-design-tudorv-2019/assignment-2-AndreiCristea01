package com.csdepartment.validators;

import javax.inject.Inject;

import com.csdepartment.entities.Student;
import com.csdepartment.services.StudentService;



public class StudentValidator {
	
	@Inject
	StudentService studentService;
	public StudentValidator() {
	}

	public String validateStudent(Student st) {
		String message = "correct";
		
		
		return message;
		}
}