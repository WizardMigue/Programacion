package ejercicios;

import java.util.Scanner;

public class EjercicioArrys9 {
	public static void rellenar(int[] n) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + "  ");
		}
	}

	public static double media(int[] n) {
		double suma = 0;
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + "  ");
			suma = suma + n[i];
		}
		return suma / n.length;
	}

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
			System.out.println("Introduce las calificaciones: ");
			n[i] = s.nextInt();
		}
		rellenar(n);
		System.out.println("\nEl numero de positivo son: " + positivos(n));
		System.out.println("El numero de negativos son: " + negativos(n));
		System.out.println("La media es: : " + media(n));
		System.out.println("La nota cero es: " + ceros(n));
	}

}
