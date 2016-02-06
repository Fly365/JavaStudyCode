package com.sjf.bean;

import java.util.Properties;

/**
 * Bookstore实体类
 * @author Administrator
 *
 */
public class Bookstore {
	private String name;
	private Properties books;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBooks(Properties books) {
		this.books = books;
	}
	
	public void listAllBook(){
		System.out.println("[" + name + "]共存储一下书籍：");
		for(Object key : books.keySet()){
			System.out.println(key + "->" + books.get(key).toString());
		}//for
	}
}
