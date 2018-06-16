package com.practice.producerconsumer;
import java.util.Vector;

public class Producer implements Runnable{
	private final Vector<Integer> sharedQueue;
	private final int size;
	
	
	public Producer(Vector<Integer> sharedQueue,int size) {
		super();
		this.sharedQueue = sharedQueue;
		this.size =size;
	}



	@Override
	public void run() {
		for(int i=0; i<7; i++) {
			try {
				produce(i);
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}



	private void produce(int i) throws InterruptedException {
		while(size == sharedQueue.size()) {
			synchronized (sharedQueue) {
				System.out.println("Queue is full "+ Thread.currentThread().getName() +" waiting");
				sharedQueue.wait();
			}
		}
		
		synchronized (sharedQueue) {
			sharedQueue.add(i);System.out.println("Produced " +i);
			sharedQueue.notifyAll();
		}
	}

}
