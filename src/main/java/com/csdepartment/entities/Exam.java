package com.csdepartment.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "exam")

public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idexam", nullable = false)
	private int idexam;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "grade", nullable = false)
	private int grade;

	

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "id_teacher_exam")
	private Teacher teacher;
	
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "id_student_exam")
	private Student student;

	

	public Exam() {
	}

	public Exam(String name, int credits, Teacher teacher,Student student) {
		super();
		this.name = name;
		this.grade = credits;
		
		this.teacher = teacher;
		this.student=student;
		
		
	}

	public int getCourseid() {
		return idexam;
	}

	public void setCourseid(int courseid) {
		this.idexam = courseid;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return grade;
	}

	public void setCredits(int credits) {
		this.grade = credits;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}





}
