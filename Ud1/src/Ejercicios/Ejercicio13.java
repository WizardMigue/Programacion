package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int entero1;
		int entero2;
		int entero3;
		
		System.out.print("Introduce un n�mero: ");
	    entero1 = s.nextInt();
	    
	    System.out.print("Introduce un n�mero: ");
	    entero2 = s.nextInt();
	    
	    System.out.print("Introduce un n�mero: ");
	    entero3 = s.nextInt();
	    
	    System.out.println(entero1<=entero2 && entero2<=entero3);

	}

}
