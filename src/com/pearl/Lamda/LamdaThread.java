package com.pearl.Lamda;

public class LamdaThread {

	public LamdaThread() {
		// TODO Auto-generated constructor stub
	
		
		Runnable r = () -> System.out.println("Hello!");
		new Thread(r).start();
		new Thread(r).start();
		
	}
	
	public static void main(String args[]) {
		new LamdaThread();
	}

}
