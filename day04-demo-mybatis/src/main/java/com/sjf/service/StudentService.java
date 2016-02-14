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
	 * 创建学生信息
	 * @param student
	 */
	public void insertStudent(Student student){
		SqlSession session = MyBatisSqlSessionFactory.getSqlSession();
		try{
			String statement = "com.sjf.mapper.StudentMapper.insertStudent";
			session.insert(statement, student);
			session.commit();
		}
		finally{
			if(session != null){
				session.close();
			}//if
		}//finally
	}
	/**
	 * 根据学生ID修改学生信息
	 * @param student
	 */
	public void updateStudentByID(Student student){
		SqlSession session = MyBatisSqlSessionFactory.getSqlSession();
		try{
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			studentMapper.updateStudentByID(student);
			session.commit();
		}
		finally{
			if(session != null){
				session.close();
			}//if
		}//finally
	}
	/**
	 * 根据学生ID删除学生信息
	 * @param student
	 */
	public void deleteStudentByID(int ID){
		SqlSession session = MyBatisSqlSessionFactory.getSqlSession();
		try{
			String statement = "com.sjf.mapper.StudentMapper.deleteStudentByID";
			session.delete(statement,ID);
			session.commit();
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
