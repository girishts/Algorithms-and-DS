
package com.practice.singletons;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingleTonCheck {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SingleTon singleTon = SingleTon.getInstance();
		singleTon.setName("girish");
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Hello.txt"));
		out.writeObject(singleTon);
		out.close();
		
		ObjectInput in =new ObjectInputStream(new FileInputStream("Hello.txt"));
		
		SingleTon s2 =(SingleTon) in.readObject();
		
		System.out.println(singleTon.hashCode() + "======" +s2.hashCode());
	}
}
