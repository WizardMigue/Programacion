package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
	public static boolean num(int n1, int n2) {
		return n1%n2==0;
	}

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int numero1, numero2;
			boolean resto;
			System.out.println("Introduce dos números enteros: ");
			numero1 = s.nextInt();
			numero2 = s.nextInt();
			resto = num(numero1, numero2);
			System.out.println(resto);
			
		}

	}



