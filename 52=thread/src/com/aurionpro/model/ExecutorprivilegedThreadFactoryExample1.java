package com.aurionpro.model;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class Mythrd3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Running thread concurrently");
	}
}

public class ExecutorprivilegedThreadFactoryExample1 {
	public static void main(String[] args) {
		ThreadFactory thrdfctry = Executors.defaultThreadFactory();
		Thread t = thrdfctry.newThread(new Mythrd3());
		t.start();
	}
}
