package com.aurionpro.model;

public class Main extends Thread {

	public static void main(String[] args) {
		Main thread = new Main();
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	// If the class extends the Thread class,
	// the thread can be run by creating an instance of the class and call its
	// start() method:

	public void run() {
		System.out.println("This code is running in a thread");
	}

}
