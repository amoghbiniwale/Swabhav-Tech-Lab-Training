//package com.aurionpro.model;
//
//public class SynchronizationExample1 {
//	void printTable(int n) {// method not synchronized
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(n * i);
//			try {
//				Thread.sleep(400);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//
//	}
//}
//
//class MyThread1 extends Thread {
//	SynchronizationExample t;
//
//	MyThread1(SynchronizationExample t) {
//		this.t = t;
//	}
//
//	public void run() {
//		t.printTable(5);
//	}
//
//}
//
//class MyThread2 extends Thread {
//	SynchronizationExample t;
//
//	MyThread2(SynchronizationExample t) {
//		this.t = t;
//	}
//
//	public void run() {
//		t.printTable(100);
//	}
//}
//
//class SynchronizationExample {
//	public static void main(String args[]) {
//		SynchronizationExample obj = new SynchronizationExample();// only one object
//		MyThread1 t1 = new MyThread1(obj);
//		MyThread2 t2 = new MyThread2(obj);
//		t1.start();
//		t2.start();
//	}
//}
