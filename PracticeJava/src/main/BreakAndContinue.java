package main;

public class BreakAndContinue {

	public static void main(String[] args) {
	
		for (int i = 0; i < 10; i++) {
		    if (i == 6) {
		        break; // Termina el bucle cuando i es igual a 5
		    }
		    System.out.println(i);
		}
		
		System.out.println("//////////////");
		
		for (int i = 0; i < 5; i++) {
		    if (i == 2) {
		        continue; // Salta la iteración cuando i es igual a 2
		    }
		    System.out.println("Se lo salta");
		    
		    System.out.println(i);
		    
		    System.out.println("hola");
		}

	}

}
