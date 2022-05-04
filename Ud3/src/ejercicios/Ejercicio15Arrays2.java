package ejercicios;

import java.util.Scanner;

public class Ejercicio15Arrays2 {
	

	public static void main(String[] args) {
		int filas = 3, columnas = 3;
		int[][] matriz = new int[filas][columnas];
		
		introduce(matriz);
		visualziar(matriz);
		trasponer(matriz);
		visualziar(matriz);
	}

	public static void visualziar(int[][] m) {
		System.out.println("La matriz contiene los siguientes elementos:");
		for (int i = 0; i < m.length ; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void trasponer(int[][] m) {
		Scanner s = new Scanner(System.in);
		int aux[][] = new int[m.length][m[0].length];
		System.out.println("La matriz despues de transponerse: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				aux[i][j] = m[j][i];
			}	//System.out.println(matriz[i][j] + "\t ");
		}		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j <  m[0].length; j++) {
				 m[i][j]=aux[i][j];
			}	//System.out.println(matriz[i][j] + "\t ");
		}			
				
		
	} // de trasponer

	public static void introduce(int[][] m) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introducción de elementos en la matriz: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("Introduce Fila " + i + " Columna " + j + ": ");
				m[i][j] = s.nextInt();
			}
		}
	}
}