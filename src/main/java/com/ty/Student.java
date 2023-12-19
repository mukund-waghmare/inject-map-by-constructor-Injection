package com.ty;

import java.util.Map;

public class Student {
	
	private String studentNAme;
	
	private Map<Integer, String> subject;

	public String getStudentNAme() {
		return studentNAme;
	}

	public void setStudentNAme(String studentNAme) {
		this.studentNAme = studentNAme;
	}

	public Map<Integer, String> getSubject() {
		return subject;
	}

	public void setSubject(Map<Integer, String> subject) {
		this.subject = subject;
	}

	public Student(String studentNAme, Map<Integer, String> subject) {
		super();
		this.studentNAme = studentNAme;
		this.subject = subject;
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

}
