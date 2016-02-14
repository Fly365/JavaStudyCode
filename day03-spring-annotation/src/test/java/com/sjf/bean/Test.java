package com.sjf.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;
	
	public static void main(String[] args){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Singer singer = (Singer)context.getBean("singer");
		singer.perform("你是我的眼泪");
	}
}