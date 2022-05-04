package ejercicios;

import java.util.Scanner;

public class ejercicio15 {
	
	public static int positivos(int [] n) {
		int contador = 0;
		for(int i = 0; i < n.length; i++) {
			if(n[i] > 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int negativos(int [] n) {
		int contador=0;
		for(int i = 0; i< n.length;i++) {
			if(n[i] < 0) {
				contador++;
			}
		}
		return contador;
	}

	public static int ceros(int [] n) {
		int contador=0;
		for(int i = 0; i< n.length;i++) {
			if(n[i] == 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public static double media(int [] n) {
		double suma = 0;
		for(int i = 0; i<n.length;i++) {
			System.out.println(n[i] + "  ");
			suma = suma + n[i];
		}
		return suma /n.length;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[30];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce las calificaciones: ");
			n[i] = s.nextInt();
		}
		

	}

}
