package modele;

// Generated 3 juin 2015 11:48:35 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Mission generated by hbm2java
 */
public class Mission implements java.io.Serializable {

	private int nummission;
	private Jeu jeu;
	private String libmission;
	private Set objectifs = new HashSet(0);

	public Mission() {
	}

	public Mission(int nummission, Jeu jeu) {
		this.nummission = nummission;
		this.jeu = jeu;
	}

	public Mission(int nummission, Jeu jeu, String libmission, Set objectifs) {
		this.nummission = nummission;
		this.jeu = jeu;
		this.libmission = libmission;
		this.objectifs = objectifs;
	}

	public int getNummission() {
		return this.nummission;
	}

	public void setNummission(int nummission) {
		this.nummission = nummission;
	}

	public Jeu getJeu() {
		return this.jeu;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public String getLibmission() {
		return this.libmission;
	}

	public void setLibmission(String libmission) {
		this.libmission = libmission;
	}

	public Set getObjectifs() {
		return this.objectifs;
	}

	public void setObjectifs(Set objectifs) {
		this.objectifs = objectifs;
	}

}
