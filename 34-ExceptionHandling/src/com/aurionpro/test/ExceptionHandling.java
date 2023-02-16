package com.aurionpro.test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("input taken");
			System.out.println(c);
			

		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("program is finally executed");
		}
		System.out.println("end of program");
	}

}
