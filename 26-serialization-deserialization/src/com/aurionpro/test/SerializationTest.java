package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Student;

public class SerializationTest {

	public static void main(String[] args) {
		Student student = new Student(10, "amogh", 80);
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			fos.close();
			System.out.println("task completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
