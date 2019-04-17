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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idstudent", nullable = false)
	private int studentid;

	@Column(name = "name", nullable = false)
	private String name;


	@Column(name = "cnp", nullable = false, length = 10)
	private String cnp;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Exam> exams;

	public Student() {
	}

	public Student(String name, String cnp, String username,
			String password) {
		super();
		
		this.name = name;
		
		this.cnp = cnp;
		
		this.username = username;
		this.password = password;
		this.exams = new ArrayList<Exam>();
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Exam> getEnrollments() {
		return exams;
	}

	public void setEnrollments(List<Exam> enrollments) {
		this.exams = enrollments;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", cnp=" + cnp + ", username=" + username
				+ ", password=" + password + ", exams=" + exams + "]";
	}

}

