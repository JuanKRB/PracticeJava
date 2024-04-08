package main;

import java.awt.Point;
import java.util.Date;

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
	}

}
