package com.aurionpro.model;

public class BMI {
	private Person person;
	private double bmi;

	public BMI(Person person) {
		super();
		this.person = person;
		this.bmi = calculateBMI();
	}

	public double calculateBMI() {
		return person.getweight() / (person.getHeight() * person.getHeight());
	}

	public String getBodyType() {
		if (bmi < 18.5)
			return "underweight";

		else if (bmi > 18.5 && bmi < 24.9)
			return "Healthy Weight";
		else if (bmi > 25 && bmi < 29.9)
			return "Overweight";

		else
			return "obese";

	}

}
