package ejercicios;

import java.util.Scanner;

public class ConversionCelsiusMetodo {
	public static double conversorCelsius(double gFahrenheit) {
		double resultado = 5.0/9 * (gFahrenheit - 32);
		return resultado;
	} // de ConversionCelsius

	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double gradoFahrenheit, resultadoCelsius;
	System.out.println("Introduce los grado Fahrenheid a convertir: ");
	gradoFahrenheit = s.nextDouble();
	resultadoCelsius = conversorCelsius(gradoFahrenheit);
	System.out.printf("Se corresponde con: %.2f" + " grados celsius", resultadoCelsius );
	} // del método principal
} // de class ConversionCelsiusMetodo

