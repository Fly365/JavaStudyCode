package com.sjf.mapper;

import java.util.List;

import com.sjf.bean.Student;

/**
 * Student映射器接口
 * @author sjf0115
 *
 */
public interface StudentMapper {
	/**
	 * 根据学生ID获取学生信息
	 * @param ID
	 * @return
	 */
	Student getStudentByID(int ID);
	/**
	 * 获取全部学生信息
	 * @return
	 */
	List<Student> getAllStudents();
}
