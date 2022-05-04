package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double longitud; 
		double anchura;
		double superficie;
		
		System.out.print("Que longitud tiene: ");
	    longitud = s.nextDouble();
	    
	    System.out.print("Que anchura tiene: ");
	    anchura = s.nextDouble();
	    
	    superficie = longitud * anchura;
	    
	    System.out.printf("La superficie es: %.4f%s", superficie, "m2");
	}

}
