package com.sjf.bean;

/**
 * 学生实体类
 * @author sjf0115
 *
 */
public class Student {
	
	private String name;
	private int age;
	private Hobby hobby;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("个人详细信息如下：" + "\n");
		stringBuilder.append("name：" + name + "\n");
		stringBuilder.append("age：" + age + "\n");
		stringBuilder.append("hobby：" + hobby.toString());
		return stringBuilder.toString();
	}
	
}
