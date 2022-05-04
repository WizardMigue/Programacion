package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void rellenar(int [] n) {
		for(int i = 0; i<n.length; i++);
	}
	
	public static double media(int [] n) {
		double suma = 0;
		for(int i = 0; i<n.length; i++) {
			System.out.println(n[i] + "  ");
			suma = suma + n[i];
		}
		return suma /n.length;
	}
	
	public static int aprovados(int [] n) {
		int contador = 0;
		for(int i = 0; i<n.length; i++) {
			if(n[i] >=5) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int suspendidos(int [] n) {
		int contador = 0;
		for(int i = 0; i<n.length; i++) {
			if(n[i] <5) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] n = new int[10];
		for(int i = 0; i < n.length; i++) {
			System.out.println("Introduce las claificaciones en el array: ");
			n[i] = s.nextInt();
		}
		rellenar(n);
		System.out.println("\nEl numero de aprovados son: " + aprovados(n));
		System.out.println("El numero de suspendidos son: " + suspendidos(n));
		System.out.println("La media es: : " + media(n));
	}

}
