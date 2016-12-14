package com.yxz.entity;

import java.util.HashSet;
import java.util.Set;

public class HeroInfo {
	private int id;
	private String heroName;
	private String skillQ;
	private String skillW;
	private String skillE;
	private String skillR;
	private String backgroundInfo;
	private java.util.Date createDate;
	//英雄定位
	private Set<Position> positions = new HashSet<Position>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getSkillQ() {
		return skillQ;
	}
	public void setSkillQ(String skillQ) {
		this.skillQ = skillQ;
	}
	public String getSkillW() {
		return skillW;
	}
	public void setSkillW(String skillW) {
		this.skillW = skillW;
	}
	public String getSkillE() {
		return skillE;
	}
	public void setSkillE(String skillE) {
		this.skillE = skillE;
	}
	public String getSkillR() {
		return skillR;
	}
	public void setSkillR(String skillR) {
		this.skillR = skillR;
	}
	public String getBackgroundInfo() {
		return backgroundInfo;
	}
	public void setBackgroundInfo(String backgroundInfo) {
		this.backgroundInfo = backgroundInfo;
	}
	public java.util.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	public Set<Position> getPositions() {
		return positions;
	}
	public void setPositions(Set<Position> positions) {
		this.positions = positions;
	}
	
	
}
