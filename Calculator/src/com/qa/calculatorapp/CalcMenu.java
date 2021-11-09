package com.qa.calculatorapp;

import java.util.Scanner;

public class CalcMenu {

	Scanner input = new Scanner(System.in);

	public void menu() {

		boolean mainMenu = true;
		String menuOptions = "";
		int number1;
		int number2;

		// System welcome message
		System.out.println("Welcome, may all your calculations come true!");
		System.out.println("");

		// System options
		while (mainMenu == true) {
			System.out.println("Please select your desired calculation function:");
			System.out.println("\t1. Addition");
			System.out.println("\t2. Subtraction");
			System.out.println("\t3. Multiplication");
			System.out.println("\t4. Division");
			System.out.println("\t5. Modulo");
			System.out.println("\t6. Square");
			System.out.println("\t7. Cube");
			System.out.println("If you've finished your calculations for now you may also:");
			System.out.println("\t0. Exit");

			menuOptions = this.input.nextLine();

			switch (menuOptions) {

			// Addition case
			case "1":
				System.out.println("Please enter your first number:");
				number1 = input.nextInt();
				System.out.println("Please enter your second number:");
				number2 = input.nextInt();
				input.nextLine(); // bypassing nextInt() bug!
				System.out.println("The output is: " + CalcScanner.add(number1, number2));
				System.out.println("");
				System.out.println("Would you like to try another calculation?");
				break;

			// Subtraction case
			case "2":
				System.out.println("Please enter your first number:");
				number1 = input.nextInt();
				System.out.println("Please enter your second number:");
				number2 = input.nextInt();
				input.nextLine(); // bypassing nextInt() bug!
				System.out.println("The output is: " + CalcScanner.subtract(number1, number2));
				System.out.println("");
				System.out.println("Would you like to try another calculation?");
				break;

			// Multiplication case
			case "3":
				System.out.println("Please enter your first number:");
				number1 = input.nextInt();
				System.out.println("Please enter your second number:");
				number2 = input.nextInt();
				input.nextLine(); // bypassing nextInt() bug!
				System.out.println("The output is: " + CalcScanner.multiply(number1, number2));
				System.out.println("");
				System.out.println("Would you like to try another calculation?");
				break;

			// Division case
			case "4":
				System.out.println("Please enter your first number:");
				number1 = input.nextInt();
				System.out.println("Please enter your second number:");
				number2 = input.nextInt();
				input.nextLine(); // bypassing nextInt() bug!
				System.out.println("The output is: " + CalcScanner.divide(number1, number2));
				System.out.println("");
				System.out.println("Would you like to try another calculation?");
				break;

			// Modulo case
			case "5":
				System.out.println("Please enter your first number:");
				number1 = input.nextInt();
				System.out.println("Please enter your second number:");
				number2 = input.nextInt();
				input.nextLine(); // bypassing nextInt() bug!
				System.out.println("The remainder is: " + CalcScanner.modulo(number1, number2));
				System.out.println("");
				System.out.println("Would you like to try another calculation?");
				break;

			// Square case
			case "6":
				System.out.println("Please enter the number you wish to square:");
				number1 = input.nextInt();
				input.nextLine(); // bypassing nextInt() bug!
				System.out.println("The output is: " + CalcScanner.square(number1));
				System.out.println("");
				System.out.println("Would you like to try another calculation?");
				break;

			// Cube case
			case "7":
				System.out.println("Please enter the number you wish to cube:");
				number1 = input.nextInt();
				input.nextLine(); // bypassing nextInt() bug!
				System.out.println("The output is: " + CalcScanner.cube(number1));
				System.out.println("");
				System.out.println("Would you like to try another calculation?");
				break;

			// Exit function
			case "0":
				mainMenu = false;
				System.out.println("Calculator shutting down...");
				System.out.println("Thank you for using the calculator!");
				break;

			// Default option
			default:
				System.out.println("Invalid input, please enter a number between 0 and 5.");
				System.out.println("");

			}

		}
	}
}
