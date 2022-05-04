package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static double conversion(double euro, double dolar) {
		return euro * dolar;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euro, dolar;
		double calculo;
		System.out.println("Introduce la cantidad de euros a conversar: ");
		euro = s.nextDouble();
		System.out.println("Introduce la cantidad de dolares a conversar: ");
		dolar = s.nextDouble();
		calculo = conversion(euro, dolar);
		System.out.println(calculo);
	}

}
