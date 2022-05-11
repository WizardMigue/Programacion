package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static double area(int n, double p) {
		return p * n / 2;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		double pi;
		double calculo;
		System.out.println("Intorduce el radio del area: ");
		numero = s.nextInt();
		System.out.println("Introduce el PI: ");
		pi = s.nextDouble();
		calculo = area(numero, pi);
		System.out.println(calculo);
	}

}
