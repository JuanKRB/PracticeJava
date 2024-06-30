package main;

interface MyInterface{
	
	int CONSTANT = 2;
	
	default void welcome() {
		System.out.println("Welcome and Hello");
	}
	
	void method();
	void method2();
	
}

interface MyInterface2{
	
	void method3();
	
}

class Father{
	int id;
	String Firstname;
}

public class InterfacePractice extends Father implements MyInterface, MyInterface2 {
	
	@Override
	public void method3() {
		System.out.println("method3() in InterfacePractice ");
		
	}

	public void method() {
		System.out.println("method() in InterfacePractice");
		
	}

	public void method2() {
		System.out.println("method2() in InterfacePractice");
		
	}

	public static void main(String[] args) {
		
		System.out.println(MyInterface.CONSTANT);
		
		InterfacePractice interfacePractice = new InterfacePractice();
		interfacePractice.method();
		interfacePractice.method2();
		interfacePractice.welcome();
		interfacePractice.method3();
		
		interfacePractice.Firstname = "Juan";
		interfacePractice.id = 2;
		
		System.out.println("*************");			
								
		System.out.println(interfacePractice.Firstname);
		System.out.println(interfacePractice.id);
	}

}
