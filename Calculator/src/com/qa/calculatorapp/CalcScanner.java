package com.qa.calculatorapp;

public class CalcScanner {

	// defining output variable
	public static double output;

	// Addition
	public static double add(double number1, double number2) {
		output = number1 + number2;
		return output;
	}

	// Subtraction
	public static double subtract(double number1, double number2) {
		output = number1 - number2;
		return output;
	}

	// Multiplication
	public static double multiply(double number1, double number2) {
		output = number1 * number2;
		return output;
	}

	// Division
	public static double divide(double number1, double number2) {
		output = number1 / number2;
		return output;
	}

	// Modulo
	public static double modulo(double number1, double number2) {
		output = number1 % number2;
		return output;
	}

	// Square
	public static double square(double number1) {
		output = number1 * number1;
		return output;
	}

	// Cube
	public static double cube(double number1) {
		output = number1 * number1 * number1;
		return output;
	}

}
