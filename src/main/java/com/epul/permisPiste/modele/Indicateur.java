package com.epul.permisPiste.modele;

// Generated 3 juin 2015 11:48:35 by Hibernate Tools 4.3.1

/**
 * Indicateur generated by hbm2java
 */
public class Indicateur implements java.io.Serializable {

	private int numindic;
	private Action action;
	private String libindic;
	private Integer poids;

	public Indicateur() {
	}

	public Indicateur(int numindic, Action action) {
		this.numindic = numindic;
		this.action = action;
	}

	public Indicateur(int numindic, Action action, String libindic, Integer poids) {
		this.numindic = numindic;
		this.action = action;
		this.libindic = libindic;
		this.poids = poids;
	}

	public int getNumindic() {
		return this.numindic;
	}

	public void setNumindic(int numindic) {
		this.numindic = numindic;
	}

	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public String getLibindic() {
		return this.libindic;
	}

	public void setLibindic(String libindic) {
		this.libindic = libindic;
	}

	public Integer getPoids() {
		return this.poids;
	}

	public void setPoids(Integer poids) {
		this.poids = poids;
	}

}