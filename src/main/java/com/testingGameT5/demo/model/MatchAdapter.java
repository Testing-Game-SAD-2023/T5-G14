package com.testingGameT5.demo.model;

/* Classe MatchAdapter implementata per fornire i parametri della partita opportuni e concordati con
 * il gruppo G08 (responsabile del task T6) */
public class MatchAdapter {

	private String IdPartita;
	private String IdGiocatore;
	private String IdClasse;
	private String CodiceClasse;
	private String IdRobot;
	private int NumeroRound;

	public MatchAdapter() {
		super();
		IdPartita = "";
		IdGiocatore = "";
		IdClasse = "";
		CodiceClasse = "";
		IdRobot = "";
		NumeroRound = 1;
	}

	public String getIdPartita() {
		return IdPartita;
	}

	public void setIdPartita(String idPartita) {
		IdPartita = idPartita;
	}
	
	public String getIdGiocatore() {
		return IdGiocatore;
	}

	public void setIdGiocatore(String idGiocatore) {
		IdGiocatore = idGiocatore;
	}
	
	public String getIdClasse() {
		return IdClasse;
	}

	public void setIdClasse(String idClasse) {
		IdClasse = idClasse;
	}
	

	public String getCodiceClasse() {
		return CodiceClasse;
	}

	public void setCodiceClasse(String codiceClasse) {
		CodiceClasse = codiceClasse;
	}

	public String getIdRobot() {
		return IdRobot;
	}

	public void setIdRobot(String idRobot) {
		IdRobot = idRobot;
	}

	public int getNumeroRound() {
		return NumeroRound;
	}

	public void setNumeroRound(int numeroRound) {
		NumeroRound = numeroRound;
	}
	
}