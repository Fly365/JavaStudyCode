package com.sjf.bean;

import com.sjf.bean.Student;
import com.sjf.service.StudentService;


public class Test {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		Student student = service.getStudentWithAddressByID(1);
		System.out.println(student.toString());
	}
}
