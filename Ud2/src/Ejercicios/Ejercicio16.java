package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int x;
		int sum = 0;
		System.out.print("Introduce un número entero: ");
		x = s.nextInt();

		while (x > 0) {
			sum = sum + x % 10;
			x = x / 10;
		}
		System.out.println(sum);
	}

}
