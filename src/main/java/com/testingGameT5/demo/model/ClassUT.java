package com.testingGameT5.demo.model;

import java.util.*;
import org.springframework.web.multipart.MultipartFile;

/* Classe ClassUT implementata in accordo con il gruppo G11 (responsabile del task T1) */
public class ClassUT {
	
	 private String name;
	 private String date;
	 private String difficulty;
	 private String code_Uri;
	 private String description;
	 private List<String> category;
	 private MultipartFile classCode;	
	 
	 public ClassUT() {
		 super(); 
	 }
	 
	 public ClassUT(final ClassUT classe) {
		 super();
		 name = classe.name;
		 date = classe.date;
		 difficulty = classe.difficulty;
		 code_Uri = classe.code_Uri;
		 description = classe.description;
		 category.addAll(classe.category); //appende tutti gli elementi di classe.category in category
	 }
	
	 public ClassUT(final String nome) {
		 super();
		 name = nome;
		 date = "";
		 difficulty = "";
		 code_Uri = "";
		 description = "";
		 category = new ArrayList<String>();
	 }
	
		
	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
		
	public String getDate() {
		return date;
	}
		
	public void setDate(String date) {
		this.date = date;
	}
		
	public String getDifficulty() {
		return difficulty;
	}
		
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
		
	public String getCode_Uri() {
		return code_Uri;
	}
		
	public void setCode_Uri(String code_Uri) {
		this.code_Uri = code_Uri;
	}
		
	public String getDescription() {
		return description;
	}
		
	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public MultipartFile getClassCode() {
		return classCode;
	}

	public void setClassCode(MultipartFile classCode) {
		this.classCode = classCode;
	}

}