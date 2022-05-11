package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, contador = 0, suma = 0, minimo, maximo;
		System.out.print("Introduce el dato: ");
		x = s.nextInt();
		minimo = x;
		maximo = x;
		while (x > 0) {
			contador++;
			suma = suma + x;
			if (x < minimo)
				minimo = x;
			if (x > maximo)
				maximo = x;
			System.out.print("Introduce otro dato: ");
			x = s.nextInt();
		}
		if (contador != 0) {
			System.out.println("La media vale " + (double) suma / contador);
			System.out.println("El mínimo vale " + minimo);
			System.out.println("El máximo vale " + maximo);
		} else
			System.out.println("No has llegado a introducir números válidos");
	}
}
