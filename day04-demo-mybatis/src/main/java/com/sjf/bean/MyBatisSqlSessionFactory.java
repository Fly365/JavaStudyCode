package com.sjf.bean;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * SqlSessionFactory单例类
 * @author sjf0115
 *
 */
public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory factory;
	
	/**
	 *  获取SqlSessionFactory
	 * @return
	 * @throws IOException
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		if(factory == null){
			String resource = "mybatis-conf.xml";
			try {
				Reader reader = Resources.getResourceAsReader(resource);
				factory = new SqlSessionFactoryBuilder().build(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//if
		return factory;
	}
	/**
	 * 获取SqlSession
	 * @return
	 * @throws IOException 
	 */
	public static SqlSession getSqlSession(){
		return getSqlSessionFactory().openSession();
	}
}
