package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un numero entero: ");
		int n = s.nextInt();

		int rows = n;
		for (int i = 1; i<= rows; ++i) {
			for (int j = 1; j<=i; ++j) {
				System.out.print(j + "  ");
			}
			System.out.println();	
		}

  
	}

	}
