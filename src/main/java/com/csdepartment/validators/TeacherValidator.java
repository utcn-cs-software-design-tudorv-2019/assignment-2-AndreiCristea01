package com.csdepartment.validators;

import javax.inject.Inject;

import com.csdepartment.entities.Teacher;
import com.csdepartment.services.TeacherService;



public class TeacherValidator {
	
	
	@Inject
	TeacherService teacherService;
	
	public TeacherValidator() {
		
	}
	
	public String validateTeacher(Teacher tc) {
		String message = "correct";

		if (tc.getName().equals(""))
			return message = "Wrong name field format";

		return message;
	}

}