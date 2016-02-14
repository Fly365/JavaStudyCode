package com.sjf.bean;

import java.util.List;

import com.sjf.bean.Student;
import com.sjf.service.StudentService;


public class Test {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		List<Student> stus = service.getAllStudents();
		for(Student stu : stus){
			System.out.println(stu.toString());
		}//for
	}
}
