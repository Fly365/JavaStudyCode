package com.sjf.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 主办方实体类
 * @author sjf0115
 *
 */
@Aspect
public class Organizers {
	
	// 定义切点
	@Pointcut("execution(* com.sjf.bean.Singer.perform(String)) and args(song)")
	public void SingerPerform(){
		// 
	}
	// 表演之前
	@Before("SingerPerform() and args(song)")
	public void BeforeSong(String song){
		System.out.println("演唱会马上就开始了，演唱歌曲为 " + song);
	}
}
