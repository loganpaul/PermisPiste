package modele;

// Generated 3 juin 2015 11:48:35 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Jeu generated by hbm2java
 */
public class Jeu implements java.io.Serializable {

	private int numjeu;
	private String libellejeu;
	private Set missions = new HashSet(0);
	private Set actions = new HashSet(0);

	public Jeu() {
	}

	public Jeu(int numjeu) {
		this.numjeu = numjeu;
	}

	public Jeu(int numjeu, String libellejeu, Set missions, Set actions) {
		this.numjeu = numjeu;
		this.libellejeu = libellejeu;
		this.missions = missions;
		this.actions = actions;
	}

	public int getNumjeu() {
		return this.numjeu;
	}

	public void setNumjeu(int numjeu) {
		this.numjeu = numjeu;
	}

	public String getLibellejeu() {
		return this.libellejeu;
	}

	public void setLibellejeu(String libellejeu) {
		this.libellejeu = libellejeu;
	}

	public Set getMissions() {
		return this.missions;
	}

	public void setMissions(Set missions) {
		this.missions = missions;
	}

	public Set getActions() {
		return this.actions;
	}

	public void setActions(Set actions) {
		this.actions = actions;
	}

}
