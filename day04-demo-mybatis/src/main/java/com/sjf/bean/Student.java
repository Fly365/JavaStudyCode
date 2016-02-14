package com.sjf.bean;

public class Student {
	private int ID;
	private String name;
	private int age;
	private String school;
	
	public Student() {
	}
	public Student(int iD, String name, int age, String school) {
		ID = iD;
		this.name = name;
		this.age = age;
		this.school = school;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "ID：" + ID + "   name：" + name + "   age：" + age + "   school：" + school;
	}
}
