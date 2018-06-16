package com.practice.singletons;

import java.io.Serializable;

public final class SingleTon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4913961234359232231L;
	private String name;
	private static SingleTon instance=null;
	private SingleTon() {

	}
	
	public static SingleTon getInstance() {
		synchronized(SingleTon.class) {
			if(null == instance) {
				instance = new SingleTon();
				return instance;
			}else {
				return instance;
			}
		}
	}
	
	// Here is the magical part of the program
	
	protected Object readResolve() {
		  return instance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
