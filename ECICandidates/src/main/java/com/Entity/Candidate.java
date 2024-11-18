package com.Entity;

public class Candidate {

	private int cid;
	private String name;
	private String partyname;
	private String state;
	private String assemly;
	private String gender;
	private int age;

	public Candidate() {
		super();
	}

	public Candidate(int cid, String name, String partyname, String state, String assemly, String gender, int age) {
		super();
		this.cid = cid;
		this.name = name;
		this.partyname = partyname;
		this.state = state;
		this.assemly = assemly;
		this.gender = gender;
		this.age = age;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAssemly() {
		return assemly;
	}

	public void setAssemly(String assemly) {
		this.assemly = assemly;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", name=" + name + ", partyname=" + partyname + ", state=" + state
				+ ", assemly=" + assemly + ", gender=" + gender + ", age=" + age + "]";
	}
}
