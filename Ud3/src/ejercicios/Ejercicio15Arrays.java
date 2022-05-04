package ejercicios;

import java.util.Scanner;

public class Ejercicio15Arrays {
	static int filas = 3, columnas = 3;
	static int[][] matriz = new int[filas][columnas];

	public static void main(String[] args) {
		int filas = 3;
		introduce(matriz);
		visualziar(matriz);
		trasponer(matriz);
		visualziar(matriz);
	}

	public static void visualziar(int[][] m) {
		System.out.println("La matriz contiene los siguientes elementos:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void trasponer(int[][] m) {
		Scanner s = new Scanner(System.in);
		int aux[][] = new int[filas][columnas];
		System.out.println("La matriz despues de transponerse: ");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				aux[i][j] = matriz[j][i];
			}	//System.out.println(matriz[i][j] + "\t ");
		}		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				 matriz[i][j]=aux[i][j];
			}	//System.out.println(matriz[i][j] + "\t ");
		}			
				
		
	} // de trasponer

	public static void introduce(int[][] m) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introducción de elementos en la matriz: ");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("Introduce Fila " + i + " Columna " + j + ": ");
				matriz[i][j] = s.nextInt();
			}
		}
	}
}