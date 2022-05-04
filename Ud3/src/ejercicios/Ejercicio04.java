package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
	
	public static double area(int n1, double p1) {
		return p1 * n1 / 2;	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		double pi;
		double calculo;
		System.out.println("Intorduce el radio del area: ");
		numero = s.nextInt();
		System.out.println("Intorduce el PI: ");
		pi = s.nextDouble();
		calculo = area(numero, pi);
		System.out.println(calculo);
	}

	}


