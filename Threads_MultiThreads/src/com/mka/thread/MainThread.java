package com.mka.thread;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("Starts");
		ThreadExample1 threadExample1 = new ThreadExample1();
		threadExample1.start();
		
		
		ThreadExample2 threadExample2 = new ThreadExample2();
		Thread thread = new Thread(threadExample2);
		thread.start();
		
		
		System.out.println("Ends");
	}
}
