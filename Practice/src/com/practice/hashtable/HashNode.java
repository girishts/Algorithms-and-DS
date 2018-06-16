/**
 * 
 */
package com.practice.hashtable;

public class HashNode<k, v> {

	 k key;
	 v value;

	 HashNode<k, v> next;

	public HashNode(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "HashNode [key=" + key + ", value=" + value + "]";
	}
	

}
