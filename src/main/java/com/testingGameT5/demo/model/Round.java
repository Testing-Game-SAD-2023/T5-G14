package com.testingGameT5.demo.model;

import java.util.HashMap;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/* Classe Round implementata in conformità con quanto pubblicato dal gruppo G04 (responsabile
 * del task T4) su Github*/
public class Round {
	
	@Id
	@JsonSerialize(using= ToStringSerializer.class)
	private ObjectId roundId;
	@JsonSerialize(using= ToStringSerializer.class)
	private ObjectId gameId;
	private int roundNumber;
	private HashMap<String,String> turn;
	private String robotTest;
	private String results;
	
	public Round() {
		super();
		this.roundId = new ObjectId();
		this.turn = new HashMap<String,String>();
	}

	public ObjectId getRoundId() {
		return roundId;
	}

	public void setRoundId(ObjectId roundId) {
		this.roundId = roundId;
	}
	
	public ObjectId getGameId() {
		return gameId;
	}

	public void setGameId(ObjectId gameId) {
		this.gameId = gameId;
	}

	public int getRoundNumber() {
		return roundNumber;
	}

	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}

	public HashMap<String, String> getTurn() {
		return turn;
	}

	public void setTurn(HashMap<String, String> turn) {
		this.turn = turn;
	}

	public String getRobotTest() {
		return robotTest;
	}

	public void setRobotTest(String robotTest) {
		this.robotTest = robotTest;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

}
