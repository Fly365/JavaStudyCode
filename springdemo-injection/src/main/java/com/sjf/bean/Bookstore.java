package com.sjf.bean;

import java.util.Map;
/**
 * Bookstore实体类
 * @author Administrator
 *
 */
public class Bookstore {
	private String name;
	private Map<String,Book> books;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBooks(Map<String,Book> books) {
		this.books = books;
	}
	
	public void listAllBook(){
		System.out.println("[" + name + "]共存储一下书籍：");
		for(String key : books.keySet()){
			System.out.println(key + "->" + books.get(key).toString());
		}//for
	}
}
