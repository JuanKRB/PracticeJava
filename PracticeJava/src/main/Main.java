package main;

import java.awt.Point;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		byte a = 22;
		int u = 80052;
		long b = 20000993;
		float c = 34.5f;
		double d = 363636373.3773;
		boolean isTrue = false;
		
		System.out.println(a);
		System.out.println(u);
		System.out.println(c);
		
		
		//**********************
		
		String hi = "hello";
		System.out.println(hi);
		
		Date now = new Date();
		System.out.println(now);
		
		Point point1 = new Point(10, 20);
		Point point2 = new Point(15, 45);
		
		System.out.println("x: " + point1.x + ", y: " + point1.y);
		System.out.println("x: " + point2.x + ", y: " + point2.y);
		
		point2.y = 48;
		
		System.out.println("x: " + point1.x + ", y: " + point1.y);
		System.out.println("x: " + point2.x + ", y: " + point2.y);
		
		//**********************
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Enter your gender: ");
		char gender = scanner.next().charAt(0);
		System.out.println("Enter your contact number:");
		double number = scanner.nextDouble();
		
		System.out.println("User details: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);	
		System.out.println("Gender: "+ gender);
		System.out.println("Contact number: "+ number);
		
		
		
	}

}
