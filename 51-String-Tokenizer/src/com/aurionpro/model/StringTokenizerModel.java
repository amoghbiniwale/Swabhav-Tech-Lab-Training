package com.aurionpro.model;

import java.util.StringTokenizer;

public class StringTokenizerModel {
	StringTokenizer str = new StringTokenizer("Hello i am Amogh");
	public void displayTokens(){
		while(str.hasMoreTokens()){
			System.out.println(str.nextToken());
		}
	}
	
	public static void main(String[] args) {
		//creating TestStringTokenizer object.
		StringTokenizerModel obj = new StringTokenizerModel();
		 
				//method call
				obj.displayTokens();
	}

}
