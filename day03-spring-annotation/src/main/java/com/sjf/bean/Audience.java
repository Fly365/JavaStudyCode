package com.sjf.bean;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 观众实体类（注解为切面）
 * @author sjf0115
 *
 */
public class Audience {
	// 表演之前
	public void takeSeats(){
		System.out.println("the audience is taking their seats...");
	}
	// 表演成功之后
	public void applaud(){
		System.out.println("very good, clap clap clap...");
	}
	// 表演失败之后
	public void demandRefund(){
		System.out.println("very bad, We want our money back...");
	}
	public void PerformTime(ProceedingJoinPoint joinPoint){
		// 演出之前
		System.out.println("the audience is taking their seats...");
		try {
			long start = System.currentTimeMillis();
			// 执行演出操作
			joinPoint.proceed();
			long end = System.currentTimeMillis();
			// 演出成功
			System.out.println("very good, clap clap clap...");
			System.out.println("该演出共需要 "+(end - start) + " milliseconds");
		} catch (Throwable e) {
			// 演出失败
			System.out.println("very bad, We want our money back...");
			e.printStackTrace();
		}
	}
}
