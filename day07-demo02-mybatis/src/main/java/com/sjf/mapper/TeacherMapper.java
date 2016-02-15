package com.sjf.mapper;

import com.sjf.bean.Teacher;

/**
 * Teacher映射器接口
 * @author sjf0115
 *
 */
public interface TeacherMapper {
	/**
	 * 根据教师ID获取教师信息（带有课程信息）
	 * @param ID
	 * @return
	 */
	Teacher getTeacherWithCourseByID(int ID);
}
