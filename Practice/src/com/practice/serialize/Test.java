package com.practice.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization serialObj = new Serialization("Girish","Bangalore");
		System.out.println(serialObj);
		FileOutputStream fos = new FileOutputStream("objectfile.txt");
		ObjectOutputStream oOS= new ObjectOutputStream(fos);
		oOS.writeObject(serialObj);
		
		FileInputStream fis = new FileInputStream("objectfile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Serialization deserialisedObject = (Serialization) ois.readObject();
		System.out.println(deserialisedObject);
		
	}
}
