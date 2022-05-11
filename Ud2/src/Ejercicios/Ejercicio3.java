package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double n1;
		System.out.println("Introduce un número entero: ");
		n1 = s.nextDouble();
		double cuadrado;

		cuadrado = (double) Math.sqrt(n1);

		if (n1 % cuadrado == 0) {
			System.out.printf("La raíz cuadrada de " + n1 + " es " + cuadrado);
		} else {
			System.out.println("");
		}

	}

}
