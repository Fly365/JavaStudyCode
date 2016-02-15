package com.sjf.bean;

import java.util.List;

import com.sjf.service.TeacherService;

public class Test {

	public static void main(String[] args) {
		TeacherService service = new TeacherService();
		Teacher teacher = service.getTeacherWithCourseByID(1);
		System.out.println(teacher.toString());
		List<Course> courses = teacher.getCourses();
		for(Course course : courses){
			System.out.println("   课程：" + course.toString());
		}//for
	}
}
