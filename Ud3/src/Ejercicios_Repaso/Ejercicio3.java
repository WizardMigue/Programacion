package Ejercicios_Repaso;

import java.util.Scanner;

public class Ejercicio3 {
		
	public static int positivos(int [] n) {
		int contador = 0;
		for (int i = 0; i < n.length; i++) {
				if (n[i]>0) {
					contador++;
				}
				}
		return contador;
}
	public static int negativos(int [] n) {
		int contador = 0;
		for(int i = 0; i < n.length; i++) {
			if(n[i]<0) {
			contador++;
			}
		}
		return contador;
	}
	
	public static int ceros(int [] n) {
		int contador = 0;
		for(int i = 0; i < n.length; i++) {
			if(n[i] == 0) {
				contador++;
			}
			}
		return contador;
		}
	

		public static double mediaP(int [] n) {
			int suma = 0;
			for (int i = 0; i < n.length; i++) {
				suma = suma + n[i];
		}
			double media = suma / positivos(n);
			return media;
		}	
	
	public static double mediaN(int [] n) {
		double suma = 0;
		for(int i = 0; i < n.length; i++) {
			suma = suma + n[i];
	}
		return suma / negativos(n);
	}	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int [] n = new int [10];
		for(int i = 0; i < n.length; i++) {
			System.out.println("Introduce los numeros: ");
			n[i] = s.nextInt();
		}
		
		System.out.println("Los numeros positivos son: " + positivos(n));
		System.out.println("Los numeros negativos son: " + negativos(n));
		System.out.println("Los numeros ceros son: " + ceros(n));
		System.out.println("La media de positivos es: : " + mediaP(n));
		System.out.println("La media de negativos es: : " + mediaN(n));
			}
	}
