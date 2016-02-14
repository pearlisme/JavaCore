package com.pearl.Lamda;

public class UseRunnable {

	public UseRunnable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		/*
		 * Runnable r1 = new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * System.out.println("Running Thread: 1"); } }; Runnable r2 = new
		 * Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * System.out.println("Running Thread: 2"); } };
		 */

		Runnable r1 = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1");
		};
		Runnable r2 = () -> System.out.println("Thread 2");
		new Thread(r1).start();
		new Thread(r2).start();
		
	}

}
