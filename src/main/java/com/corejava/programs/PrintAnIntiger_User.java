package com.corejava.programs;

import java.util.Scanner;

public class PrintAnIntiger_User {

	public static void main(String[] args) {
		// Java Program to print an Intiger(Entered by User)

		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a number:");

		int num = reader.nextInt();
		System.out.println("You entered:"+num);

	}

}
