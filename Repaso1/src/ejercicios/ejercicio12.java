package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	static int maximo, minimo;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce los numeros en el array");
			n[i] = s.nextInt();
		}
		
		maximo = maximo(n);
		maximo = minimo(n);
		imprimir(n);

	}// del main

	public static int maximo(int[] n) {
		int maximo = n[0];
		for (int j = 1; j < n.length; j++) {
			if (n[j] > maximo) {
				maximo = n[j];
			}
		}
		return maximo;
	}

	public static int minimo(int[] n) {
		int minimo = n[0];
		for (int x = 1; x < n.length; x++) {
			if (n[x] < minimo) {
				minimo = n[x];
			}
		}
		return minimo;
	}

	public static void imprimir(int [] n) {
		for(int i = 0; i<n.length;i++) {
		System.out.print(n[i]);
		
		if(n[i]==maximo) {
			System.out.print( " maximo");
		}
		if(n[i]==minimo) {
			System.out.print( " minimo");
		}
		System.out.println();
	}
}
}