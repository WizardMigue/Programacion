package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
	
	public static double conversor(double s, double e) {
		return s * e;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euro;
		double dolar;
		double calculo;
		System.out.println("Introduce cuanto vale un euro: ");
		euro = s.nextDouble();
		System.out.println("Introduce la cantidad de dolares a convertir: ");
		dolar = s.nextDouble();
		calculo = conversor(euro, dolar);
		System.out.println(calculo);
	}

}
