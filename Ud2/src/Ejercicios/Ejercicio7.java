package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un numero entero: ");
		int n = s.nextInt();
		int suma = 0;
		if (n <= 0) {
			System.out.println("El número introducido tiene que ser mayor que 0");
			System.exit(-1);
		} else {
			for (int i = 1; i <= n; i++) {
				suma = suma + i;
			}
			System.out.println("La suma de todos los numeros es: " + suma);
		}
	}
}
