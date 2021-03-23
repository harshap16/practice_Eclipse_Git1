package com.selenium.maven1;

public class SampleJava1 {

	static int salary=5000;
	short comm = 500;
	public static void main(String[] args) {
		// @Test
		// public static void pract()
		// {
		int age = 20;
		System.out.println("Welcome Harsha Java Class");
		System.out.println("The age of the Person is " + age);
		method1();
		addNumbers();
		salary =10000;
		System.out.println(salary);
		
	}

	public static void method1()
	{
		int age=25;
		System.out.println(age);
		
	}
	public static void addNumbers()
	{
		int x=10;
		int y=20;
		int sum=(x+y);
		System.out.println("The sum of two numbers is "+sum);
		
	}
	
	public void method2()
	{
		int age=50;
		System.out.println("This is non static method");
		System.out.println(salary);
		addNumbers();
		System.out.println(comm);
		System.out.println(age);
		
	}
}
