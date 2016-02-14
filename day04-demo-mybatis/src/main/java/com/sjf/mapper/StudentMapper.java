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
	 * 创建一个学生信息
	 * @param student
	 */
	int insertStudent(Student student);
	/**
	 * 根据学生ID修改学生信息
	 * @param student
	 * @return
	 */
	int updateStudentByID(Student student);
	/**
	 * 根据学生ID删除学生信息
	 * @param ID
	 * @return
	 */
	int deleteStudentByID(int ID);
	/**
	 * 获取全部学生信息
	 * @return
	 */
	List<Student> getAllStudents();
}
