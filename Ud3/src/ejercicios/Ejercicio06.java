package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static double cuadrado(int c) {
		double raiz = Math.sqrt(c);
		return raiz;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int num = s.nextInt();
		if (num % cuadrado(num) == 0) {
			System.out.println("El numero introducido se puede expresar en cuadrado en: " + cuadrado((int) num));
		} else {
			System.out.println("null ");
		}
	}
}
