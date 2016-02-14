package com.sjf.bean;

public class Student {
	private int stuID;
	private String stuName;
	private int age;
	private String school;
	private Address address;
	
	public Student() {
	}
	public Student(int ID, String name, int age, String school) {
		stuID = ID;
		this.stuName = name;
		this.age = age;
		this.school = school;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ID：" + stuID + "   name：" + stuName + "   age：" + age + "   school：" + school + " address：" + (address!=null ? address.toString() : "null");
	}
}
