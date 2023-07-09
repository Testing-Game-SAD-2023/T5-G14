package com.testingGameT5.demo.model;

import jakarta.validation.constraints.NotNull;

/* Classe Student implementata in conformità con quanto pubblicato dal gruppo G04 (responsabile
 * del task T4) su Github*/
public class Student {
	
	@NotNull
	private String studentId;

	public Student() {
		super();
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
