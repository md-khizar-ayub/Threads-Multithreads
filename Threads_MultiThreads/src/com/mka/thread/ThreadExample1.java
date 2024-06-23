package com.mka.thread;

public class ThreadExample1 extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("Thread 111");
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() +" - "+i );
		}
	}
}
