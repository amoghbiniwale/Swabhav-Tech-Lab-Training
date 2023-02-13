package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle [] rectangle= new Rectangle[5];
		for(int i=0;i<5;i++) {
			rectangle[i]=new Rectangle(10+i,20+i);
		}
		for(Rectangle x: rectangle) {
			System.out.println(x);
			//printRectange(rectangle);
		}
	}

//	private static void printRectange(Rectangle x) {
	//	System.out.println("height is:"+x.getHeight());
	//	System.out.println("width is"+);
	//}

}
