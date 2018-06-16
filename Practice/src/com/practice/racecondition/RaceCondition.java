package com.practice.racecondition;

import java.util.ArrayList;
import java.util.List;

public class RaceCondition {
	
	public static void main(String[] args) throws InterruptedException {
		Data data=new Data();
		List<Thread> threadlist= new ArrayList<Thread>();
		for (int i = 0; i < 999999999; i++) {
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					
					int value =data.getValue();
					data.setValue(value+1);
					//System.out.println(Thread.currentThread().getName()+" changed the value to "+data.getValue());
					
				}
			
			
			});
					thread.start();threadlist.add(thread);
		}
		for(final Thread thread :threadlist) {
			thread.join();
			
		}
		System.out.println(data.getValue());
	}

}
