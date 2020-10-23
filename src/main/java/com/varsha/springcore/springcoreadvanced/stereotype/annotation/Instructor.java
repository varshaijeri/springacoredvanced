package com.varsha.springcore.springcoreadvanced.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
	@Value("#{T(java.lang.Math).abs(-99)}")
	int id;

	@Value("#{'Sita'.toUpperCase()}")
	String name;

	@Value("#{courses}")
	List<String> courses;

	@Autowired
	private Profile profile;

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
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

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", courses=" + courses + ", profile=" + profile + "]";
	}

}
