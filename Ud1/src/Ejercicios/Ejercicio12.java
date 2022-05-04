package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double entero1;
		double entero2;
		
		System.out.print("Introduce un número: ");
	    entero1 = s.nextDouble();
	    
	    System.out.print("Introduce un número: ");
	    entero2 = s.nextDouble();
	    
	    System.out.println(entero1 >entero2);
	    
	}

}
