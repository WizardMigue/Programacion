package Ejercicios_Repaso;

import java.util.Scanner;

public class Ejercicio2 {

	public static int positivos(int[] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > 0) {
				contador++;
			}
		}
		return contador;
	}

	public static int negativos(int[] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] < 0) {
				contador++;
			}
		}
		return contador;
	}

	public static int ceros(int[] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 0) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce los numeros: ");
			n[i] = s.nextInt();
		}
		System.out.println("Los numeros positivos son: " + positivos(n));
		System.out.println("Los numeros negativos son: " + negativos(n));
		System.out.println("Los numeros ceros son: " + ceros(n));
	}
}
