package com.practice.producerconsumer;

import java.util.Vector;

public class Consumer1 implements Runnable{

	private int size;
	private Vector<Integer> sharedQueue;
	
	public Consumer1(int size, Vector<Integer> sharedQueue) {
		super();
		this.size = size;
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
			System.out.println("Consumed "+ consume());
			}
			catch(InterruptedException ex) {
				System.out.println("Exception in Consumer"+ Thread.currentThread().getName());
			}
		}
		
	}

	private int consume() throws InterruptedException{
		while(sharedQueue.isEmpty()) {
			System.out.println("Nothing is there to consume . Empty queue");
			sharedQueue.wait();
		}
		synchronized (sharedQueue) {
			 sharedQueue.notifyAll();
			 return (Integer) sharedQueue.remove(0);
		}
	}

}
