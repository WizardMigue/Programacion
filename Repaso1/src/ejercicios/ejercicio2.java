package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	
	public static boolean numero(int n1, int n2) {
		return n1%n2==0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero1, numero2;
		boolean calculo;
		System.out.println("Introduce los numeros enteros: ");
		numero1 = s.nextInt();
		numero2 = s.nextInt();
		calculo = numero(numero1, numero2);
		System.out.println(calculo);
	}

}
