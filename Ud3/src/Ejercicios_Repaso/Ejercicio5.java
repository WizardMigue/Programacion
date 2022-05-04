package Ejercicios_Repaso;

import java.util.Scanner;

public class Ejercicio5 {

	public static void empleados(String[] nombres, int[] sueldos) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce persona " + i);
			nombres[i] = s.next();
			System.out.println("Introduce su sueldo ");
			sueldos[i] = s.nextInt();
		}
	} // de rellenar

	public static void visualizar(String[] nombres, int[] sueldos) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " --->" + sueldos[i]);
		}
	} // del visualizar

	public static int maximo(int[] sueldos) {
		int max = sueldos[0];
		for (int i = 1; i < sueldos.length; i++) {
			if (sueldos[i] > max) {
				max = sueldos[i];

			}

		}
		return max;
	} // del maximo

	public static void personasConMasSueldo(String[] nombres, int[] sueldos, int max) {
		System.out.println("Personas con más sueldo -->" + max);
		for (int i = 0; i < sueldos.length; i++) {
			if (sueldos[i] == max) {
				System.out.println(nombres[i]);
			}
		}
	} // personas con mas sueldo

	public static void main(String[] args) {
		int numero = 10;
		String[] n = new String[numero];
		int[] s = new int[numero];
		empleados(n, s);
		visualizar(n, s);
		int max = maximo(s);
		personasConMasSueldo(n, s, max);
	}

}
