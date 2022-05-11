package Ejercicios_Repaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void pedir(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println((n[i] + "  " + "la posición del vector es: " + i));
		}
	}

	public static int maximo(int[] n) {
		int maximo = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] > maximo) {
				maximo = n[i];
			}
		}
		return maximo;
	}

	public static int minimo(int[] n) {
		int minimo = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] < minimo) {
				minimo = n[i];
			}
		}
		return minimo;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce los numeros: " + i);
			n[i] = s.nextInt();
		}
		pedir(n);
		System.out.println("El numero maximo es: " + maximo(n));
		System.out.println("El numero minimo es: " + minimo(n));
	}
}
