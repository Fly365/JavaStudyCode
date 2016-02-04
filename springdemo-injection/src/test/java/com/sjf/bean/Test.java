package com.sjf.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 测试类
 * @author sjf0115
 *
 */
public class Test {

	private static ApplicationContext context;
	private static Bookstore bookstore;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2. 从IOC容器中获取Bean实例
		bookstore = (Bookstore)context.getBean("china-pub");
		// 3.调用listAllBook方法
		bookstore.listAllBook();
	}
}
