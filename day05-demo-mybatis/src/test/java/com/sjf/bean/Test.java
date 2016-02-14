package com.sjf.bean;

import java.util.List;

import com.sjf.bean.Student;
import com.sjf.service.StudentService;


public class Test {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		Student student = service.getStudentByID(1);
		System.out.println(student.toString());
		
		System.out.println("所有学生信息如下：");
		List<Student> students = service.getAllStudents();
		for(Student stu : students){
			System.out.println(stu.toString());
		}//for
	}
}
