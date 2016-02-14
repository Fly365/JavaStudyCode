package com.sjf.bean;

import org.springframework.stereotype.Component;

/**
 * 学生实体类
 * @author sjf0115
 *
 */
@Component
public class Student {
	
	private String name;
	private int age;
	private School school;
	
	public Student(School school) {
		this.school = school;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name：" + name + "   age：" + age  );
		if(school != null){
			sb.append("   school：" + school.getName() + "[" + school.getLocation() + "]");
		}//if
		return sb.toString();
	}
}
