package com.ilpbatch5.utility;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value1 = 5;
		int value2 = 8;
		int value3 = 20;
		int choice;
		System.out.println("1.Compare two numbers \n 2.Compare three numbers \n Enter your choice :");
		choice = scanner.nextInt();
		switch(choice)
		{
		case 1:	compareTwoValues(value1, value2);
		    	break;
		case 2:	compareThreeValues(value1, value2, value3);
				break;
		}

	}

	private static void compareThreeValues(int value1, int value2, int value3) {
		if (value1 > value2 && value1 > value3)
			System.out.println("The largest is" + value1);

		else if (value2 > value3)
			System.out.println("The largest is" + value2);

		else
			System.out.println("The largest is" + value3);

	}

	private static void compareTwoValues(int value1, int value2) {

		if (value1 > value2) {
			System.out.println("The largest is" + value1);
		} else {
			System.out.println("The largest is" + value2);
		}

	}

}
