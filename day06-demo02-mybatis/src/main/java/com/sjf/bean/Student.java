package com.sjf.bean;
/**
 * Student实体类
 * @author sjf0115
 *
 */
public class Student {
	private int ID;
	private String name;
	private int age;
	private String school;
	private Address address;
	
	public Student() {
	}
	public Student(int id, String name, int age, String school) {
		ID = id;
		this.name = name;
		this.age = age;
		this.school = school;
	}
	public int getID() {
		return ID;
	}
	public void setID(int stuID) {
		this.ID = stuID;
	}
	public String getName() {
		return name;
	}
	public void setName(String stuName) {
		this.name = stuName;
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
		return "ID：" + ID + "   name：" + name + "   age：" + age + "   school：" + school + " address：" + (address!=null ? address.toString() : "null");
	}
}
