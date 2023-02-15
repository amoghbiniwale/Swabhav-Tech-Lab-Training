package com.aurionpro.model;

public class VehicleTest {

	public static void main(String[] args) {
		IMovable [] movable = {new Car("aura"),
							new Bus("Tata"),
							new Bike("bajaj")
		};
		startMoving(movable);
	}

	private static void startMoving(IMovable[] movable) {
		for(IMovable x:movable ) {
			x.move();
			System.out.println();
		}
	}

}
