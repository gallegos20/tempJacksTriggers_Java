package com.codiscope.jaks.triggers.java.struts;

import org.apache.struts.action.ActionForm;
public class ExampleForm extends ActionForm {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}