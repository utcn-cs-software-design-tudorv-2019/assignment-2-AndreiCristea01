package com.csdepartment.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.csdepartment.entities.Exam;
import com.csdepartment.entities.Teacher;
import com.csdepartment.repositories.ExamRepository;


@Service()
public class ExamService {
	
	@Inject
	ExamRepository examRepository;

	public List<Exam> getAllCourses() {
		return examRepository.findAll();
	}

	public Exam getByCourseid(int id) {
		return examRepository.findByIdexam(id);
	}

	public Exam getByName(String name) {
		return examRepository.findByName(name);
	}

	public Exam getByTeacher(Teacher teacher) {
		return examRepository.findByTeacher(teacher);
	}

	public Exam insert(Exam exam) {
		return examRepository.save(exam);
	}

	public void delete(Exam exam) {
		examRepository.delete(exam);
	}

	public void deleteByCourseId(int id) {
		examRepository.deleteByIdexam(id);

	}

	public void update(Exam course) {
		Exam foundExam = examRepository.findByIdexam(course.getCourseid());
		foundExam = course;
		examRepository.save(foundExam);
	}

}
