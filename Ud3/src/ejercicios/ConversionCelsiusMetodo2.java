package ejercicios;

import java.util.Scanner;

public class ConversionCelsiusMetodo2 {
	public static double conversorCelsius(double gFahrenheit) {
		return 5.0/9 * (gFahrenheit - 32);
	} // de ConversionCelsius

	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double gradoFahrenheit, resultadoCelsius;
	System.out.println("Introduce los grado Fahrenheid a convertir: ");
	gradoFahrenheit = s.nextDouble();
	System.out.printf("Se corresponde con: %.2f" ,  "grados Celsius", conversorCelsius(gradoFahrenheit));
	} // del método principal
 // de class ConversionCelsiusMetodo


	
		

	}


