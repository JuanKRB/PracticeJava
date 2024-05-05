package main;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int marks[][] = {
				{ 23, 34 },
				{ 45,22 }, 
				{ 89, 56 }, };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Row: " + i + ", Column: " + j + ", " + marks[i][j]);
			}
		}
		
		System.out.println();

	}

}
