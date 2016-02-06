package com.sjf.test;

import com.sjf.bean.Student;
import com.sjf.service.StudentService;


public class Test {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		Student stu = service.getStudentByID(1);
		System.out.println(stu.toString());
	}
}
