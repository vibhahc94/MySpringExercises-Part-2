package com.vibha.springs.springcoreadvanced.springcoreadvanced.expression.language;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("instr")
public class Instructor {

	/* @Value("#{new Integer(88)}")
	 * @Value("#{T(java.lang.Integer).MIN_VALUE}")*/
	@Value("#{T(java.lang.Math).abs(-66)}")
	private int id;
	
	/*@Value("Vibha H C")*/
	@Value("#{'John'.toUpperCase()}")
	private String name;
	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;
	
	@Value("#{2+4>8?true:false}")
	private boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}

}
