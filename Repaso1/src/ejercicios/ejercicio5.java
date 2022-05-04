package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
	
	public static double potencia(double a, double b) {
		return a*b;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base;
		int exponente;
		double calculo;
		System.out.println("Intorduce la base de la potencia: ");
		base = s.nextInt();
		System.out.println("Intorduce el exponente de la potencia: ");
		exponente = s.nextInt();
		calculo = potencia(base, exponente);
		System.out.println(calculo);
	}

}
