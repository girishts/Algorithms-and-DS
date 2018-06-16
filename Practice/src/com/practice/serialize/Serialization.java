package com.practice.serialize;


import java.io.Serializable;

public class Serialization implements Serializable{
	
	
	private static final long serialVersionUID = -191591320109603395L;
	private String name;
	private String city;
	
	
	
	public Serialization(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	



	@Override
	public String toString() {
		return "Serialization [name=" + name + ", city=" + city + "]";
	}



}
