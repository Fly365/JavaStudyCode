package com.sjf.bean;

/**
 * 学校实体类
 * @author sjf0115
 *
 */
public class School {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
