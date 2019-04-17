package com.csdepartment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csdepartment.entities.Exam;
import com.csdepartment.entities.Teacher;



public interface ExamRepository extends JpaRepository<Exam, Integer>{
	
	public List<Exam> findAll();

	public Exam findByIdexam(int id);

	public Exam findByName(String name);

	public Exam findByTeacher(Teacher teacher);

	public Exam save(Exam course);

	public void delete(Exam course);

	public void deleteByIdexam(int id);

}
