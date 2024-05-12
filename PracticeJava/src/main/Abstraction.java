package main;

public abstract class Abstraction {
	
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();

	public static void main(String[] args) {
		
		Abstraction abstraction = new SonAbstraction();
		
		abstraction.method1();
		abstraction.method2();
		abstraction.method3();
	}
	
}

class SonAbstraction extends Abstraction{

	@Override
	public void method1() {
		System.out.println("method1()");
		
	}

	@Override
	public void method2() {
		System.out.println("method2()");
		
	}

	@Override
	public void method3() {
		System.out.println("method3()");
		
	}
	

	
	
}
