package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	double equivalente = 0.85;
	double cantidad;
	double conversion;
	
	System.out.print("cuanto cuesta un dolar: ");
	cantidad = s.nextDouble();
    
    conversion = (cantidad * equivalente);

    System.out.println("La conversion es: "+ conversion);

	}

}
