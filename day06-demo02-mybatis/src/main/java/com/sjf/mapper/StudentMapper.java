package com.sjf.mapper;

import com.sjf.bean.Student;

/**
 * Student映射器接口
 * @author sjf0115
 *
 */
public interface StudentMapper {
	/**
	 * 根据学生ID获取学生信息（带有地址信息）
	 * @param ID
	 * @return
	 */
	Student getStudentWithAddressByID(int ID);
}
