package com.sjf.service;

import org.apache.ibatis.session.SqlSession;

import com.sjf.bean.MyBatisSqlSessionFactory;
import com.sjf.bean.Student;

/**
 * Student服务类
 * @author sjf0115
 *
 */
public class StudentService {
	
	/**
	 * 根据ID获取学生信息
	 * @return
	 */
	public Student getStudentByID(int ID){
		SqlSession session = MyBatisSqlSessionFactory.getSqlSession();
		String statement = "com.sjf.bean.studentMapper.getStudent";
		Student stu = session.selectOne(statement, ID);
		if(session != null){
			session.close();
		}//if
		return stu;
	}
}
