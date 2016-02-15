package com.sjf.service;

import org.apache.ibatis.session.SqlSession;

import com.sjf.bean.MyBatisSqlSessionFactory;
import com.sjf.bean.Teacher;
import com.sjf.mapper.TeacherMapper;

/**
 * Teacher服务类
 * @author sjf0115
 *
 */
public class TeacherService {
	
	/**
	 * 根据教师ID获取教师信息（包含课程信息）
	 * @return
	 */
	public Teacher getTeacherWithCourseByID(int ID){
		SqlSession session = MyBatisSqlSessionFactory.getSqlSession();
		try{
			TeacherMapper studentMapper = session.getMapper(TeacherMapper.class);
			Teacher teacher = studentMapper.getTeacherWithCourseByID(ID);
			return teacher;
		}
		finally{
			if(session != null){
				session.close();
			}//if
		}//finally
	}
}
