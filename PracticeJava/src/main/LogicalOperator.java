package main;

public class LogicalOperator {

	public static void main(String[] args) {
		
		boolean x = true;
		boolean y = false;
		
		int number1 = 10;
		int number2 = 2;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		
		System.out.println(!(number1 > number2));
		
	}

}
