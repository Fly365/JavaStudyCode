package com.sjf.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sjf.bean.MyBatisSqlSessionFactory;
import com.sjf.bean.Student;
import com.sjf.mapper.StudentMapper;

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
		try{
			String statement = "com.sjf.mapper.StudentMapper.getStudentByID";
			Student stu = session.selectOne(statement,ID);
			return stu;
		}
		finally{
			if(session != null){
				session.close();
			}//if
		}//finally
	}
	/**
	 * 获取全部学生信息
	 * @return
	 */
	public List<Student> getAllStudents(){
		SqlSession session = MyBatisSqlSessionFactory.getSqlSession();
		try{
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			List<Student> students = studentMapper.getAllStudents();
			session.commit();
			return students;
		}
		finally{
			if(session != null){
				session.close();
			}//if
		}//finally
	}
}
