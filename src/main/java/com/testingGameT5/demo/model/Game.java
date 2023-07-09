package com.testingGameT5.demo.model;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.bson.types.ObjectId;

/* Classe Game implementata in conformità con quanto pubblicato dal gruppo G04 (responsabile
 * del task T4) su Github*/
public class Game {
	
	@Id
	@JsonSerialize(using= ToStringSerializer.class)
	private ObjectId _id;
	@CreatedDate
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime startDate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime endDate;
	private Host host;
	private List<Guest> guest; 
	private Robot robot;
	@Min(value = 1)
	@Max(value = 3)
	private int scenario;
	@Min(value = 1)
	private int totalRoundNumber;
	private ClassUT classUt;
	private String winner;
	
	public Game() {
		super();
		this.host = new Host();
		this.robot = new Robot();
		this.classUt = new ClassUT();
	}

	public ObjectId getId() {
		return _id;
	}
	public void setId(ObjectId id) {
		this._id = id;
	}
	
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	public Host getStudente() {
		return host;
	}
	public void setStudente(Host host) {
		this.host = host;
	}
	public int getScenario() {
		return scenario;
	}
	public void setScenario(int scenario) {
		this.scenario = scenario;
	}
	public ClassUT getClassUt() {
		return classUt;
	}
	public void setClassUt(ClassUT classUt) {
		this.classUt = classUt;
	}
	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
		
	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	public List<Guest> getGuest() {
		return guest;
	}

	public void setGuest(List<Guest> guest) {
		this.guest = guest;
	}

	public int getTotalRoundNumber() {
		return totalRoundNumber;
	}

	public void setTotalRoundNumber(int totalRoundNumber) {
		this.totalRoundNumber = totalRoundNumber;
	}
	
}