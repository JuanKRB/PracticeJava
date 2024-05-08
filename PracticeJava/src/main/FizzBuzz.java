package main;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.print("Enter the number: ");
			number = Integer.parseInt(scanner.nextLine());
			
			if(number % 3 == 0 && number % 5 == 0) {
				System.out.println("FizzBuzz");
		    }
			else if(number % 3 == 0) {
				System.out.println("Fizz");
		    }
			else if(number % 5 == 0 ) {
				System.out.println("Buzz");
		    }
			else {
				System.out.print("Enter another number: ");
				number = Integer.parseInt(scanner.nextLine());
			}
	
		} while (number != 0);
		
		
		
	}
}
