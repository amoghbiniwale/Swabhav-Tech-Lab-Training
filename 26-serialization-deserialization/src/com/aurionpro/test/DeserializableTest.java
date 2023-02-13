package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.aurionpro.model.Student;

public class DeserializableTest {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
			Student student = (Student) ois.readObject();
			System.out.println("Student id: " + student.id);
			System.out.println("Student name: " + student.name);
			System.out.println("student percentage: " + student.percentage);
			ois.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
