package com.practice.producerconsumer;

import java.util.Vector;

public class ProducerConsumerSolution {
	
	public static void main(String[] args) {
		Vector<Integer> sharedQueue =new Vector<Integer>();
		int size =3;
		
		Producer pr =new Producer(sharedQueue, size);
		Consumer1 con =new Consumer1(size, sharedQueue);
		
		Thread prodThread = new Thread(pr,"Producer");
		Thread consThread =new Thread(con,"Consumer");
		
		
		prodThread.start();
		consThread.start();
	}

}
