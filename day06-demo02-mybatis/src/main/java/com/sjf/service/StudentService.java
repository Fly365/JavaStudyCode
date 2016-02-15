package com.sjf.service;

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
	 * 根据ID获取学生信息（包含地址信息）
	 * @return
	 */
	public Student getStudentWithAddressByID(int ID){
		SqlSession session = MyBatisSqlSessionFactory.getSqlSession();
		try{
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			Student stu = studentMapper.getStudentWithAddressByID(ID);
			return stu;
		}
		finally{
			if(session != null){
				session.close();
			}//if
		}//finally
	}
}
