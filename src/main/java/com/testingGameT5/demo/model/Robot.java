package com.testingGameT5.demo.model;

/* Classe Robot implementata in conformità con quanto pubblicato dal gruppo G04 (responsabile
 * del task T4) su Github*/

public class Robot {
	
	private String robotId;
	private String difficulty;
	
	public Robot() {
		super();
	}
	
	public String getRobotId() {
		return robotId;
	}
	
	public void setRobotId(String robotId) {
		this.robotId = robotId;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

}
