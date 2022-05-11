package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0;
		int factorial = 1;
		System.out.print("Introduce un numero entero positivo: ");
		x = s.nextInt();
		if (x < 0)
			System.out.print("El numero introducido no es posible");

		else {
			while (x != 0) {
				factorial = factorial * x;
				x--;

			}
			System.out.print("El factorial de es " + factorial);
		}

	}
}
