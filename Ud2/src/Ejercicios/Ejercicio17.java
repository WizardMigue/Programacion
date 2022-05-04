package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	private static final String Arrays = null;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int array[] = new int [5];
		boolean creciente = false, decreciente = false;
		
		for (int i = 0; i<5; i++) {
			System.out.println("Introduce los números: ");
			array[i] = s.nextInt();
		}
		
		for (int i = 0; i<1; i++) {
			if(array[i] < array[i+1]) {
				creciente = true;
			}
			if(array[i] > array[i+1]) {
				decreciente = true;
			}
			
			if(creciente==true && decreciente==false) {
				System.out.println("\n El array esta de forma creciente");
			}
			else if (creciente==false && decreciente==true) {
				System.out.println("\n El array esta de forma decreciente");
		}

			else if (creciente==false && decreciente==false) {
				System.out.println("\n El array esta de forma igual");
		
	}
		}
	}
}
	