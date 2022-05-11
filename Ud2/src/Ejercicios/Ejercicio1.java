package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int entero = s.nextInt();

		if (entero % 2 == 0) {
			System.out.print("El número introducido es par ");
		} else
			System.out.print("El número introducido es impar ");
	}

}
