package modele;

// Generated 3 juin 2015 11:48:35 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Action generated by hbm2java
 */
public class Action implements java.io.Serializable {

	private int numaction;
	private Action action;
	private String libaction;
	private Integer scoremin;
	private Set indicateurs = new HashSet(0);
	private Set jeus = new HashSet(0);
	private Set actions = new HashSet(0);
	private Set objectifs = new HashSet(0);
	private Set obtients = new HashSet(0);
	private Set regles = new HashSet(0);

	public Action() {
	}

	public Action(int numaction) {
		this.numaction = numaction;
	}

	public Action(int numaction, Action action, String libaction, Integer scoremin, Set indicateurs, Set jeus, Set actions, Set objectifs, Set obtients, Set regles) {
		this.numaction = numaction;
		this.action = action;
		this.libaction = libaction;
		this.scoremin = scoremin;
		this.indicateurs = indicateurs;
		this.jeus = jeus;
		this.actions = actions;
		this.objectifs = objectifs;
		this.obtients = obtients;
		this.regles = regles;
	}

	public int getNumaction() {
		return this.numaction;
	}

	public void setNumaction(int numaction) {
		this.numaction = numaction;
	}

	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public String getLibaction() {
		return this.libaction;
	}

	public void setLibaction(String libaction) {
		this.libaction = libaction;
	}

	public Integer getScoremin() {
		return this.scoremin;
	}

	public void setScoremin(Integer scoremin) {
		this.scoremin = scoremin;
	}

	public Set getIndicateurs() {
		return this.indicateurs;
	}

	public void setIndicateurs(Set indicateurs) {
		this.indicateurs = indicateurs;
	}

	public Set getJeus() {
		return this.jeus;
	}

	public void setJeus(Set jeus) {
		this.jeus = jeus;
	}

	public Set getActions() {
		return this.actions;
	}

	public void setActions(Set actions) {
		this.actions = actions;
	}

	public Set getObjectifs() {
		return this.objectifs;
	}

	public void setObjectifs(Set objectifs) {
		this.objectifs = objectifs;
	}

	public Set getObtients() {
		return this.obtients;
	}

	public void setObtients(Set obtients) {
		this.obtients = obtients;
	}

	public Set getRegles() {
		return this.regles;
	}

	public void setRegles(Set regles) {
		this.regles = regles;
	}

}
