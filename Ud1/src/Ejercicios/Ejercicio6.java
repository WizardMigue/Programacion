package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double equivalente = 1.17774;
		double cantidad;
		double conversion;
		
	    System.out.print("cuanto cuesta un euro: ");
	    cantidad = s.nextDouble();
	    
	    conversion = (cantidad * equivalente);

	    System.out.println("La conversion es: "+ conversion);
	}

}
