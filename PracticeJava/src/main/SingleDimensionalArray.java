package main;

import java.util.Iterator;

public class SingleDimensionalArray {

	public static void main(String[] args) {
	
		int marks[];
		
		marks = new int[5];
		
		int marks2[] = new int[5];
		
		int marks3[] = new int[]{2,3};
		
		int marks4[];
		
		marks4 = new int[] {2,6,8,7,8};
		
		marks2[0] = 8;
		
		System.out.println(marks2[0]);
		
	    for (int i = 0; i < marks4.length; i++) {
			System.out.println(marks2[i]);
		}
	    System.out.println("*****************");
	    for (int i : marks4) {
	    	System.out.println(i);
		}
	}

}
