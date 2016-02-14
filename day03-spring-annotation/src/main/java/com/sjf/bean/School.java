package com.sjf.bean;


/**
 * 学校实体类
 * @author sjf0115
 *
 */

public class School {
	private String name;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "name：" + name + "   location：" + location;
	}
}
