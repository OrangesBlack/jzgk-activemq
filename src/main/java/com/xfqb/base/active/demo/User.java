package com.xfqb.base.active.demo;

import java.io.Serializable;

/**
 * 
 * @ClassName:  User   
 * @Description:测试实体类   
 * @author: LouYue 
 * @date:   2018年12月13日 下午3:44:30   
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1247354362107646609L;
	
	private String id;
	private String name;
	private Integer age;

	public User() {

	}

	public User(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
