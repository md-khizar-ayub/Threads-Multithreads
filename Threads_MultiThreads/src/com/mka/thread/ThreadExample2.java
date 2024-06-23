package com.mka.thread;

public class ThreadExample2 implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("Thread 222");
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() +" - "+i );
		}
	}

}
