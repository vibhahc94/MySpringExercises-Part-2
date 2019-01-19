package com.vibha.springs.springcoreadvanced.springcoreadvanced.expression.language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Software Engineer")
	private String title;
	
	@Value("#{new java.lang.String('Microsoft')}")
	private String company;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}

}
