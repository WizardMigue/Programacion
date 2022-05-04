package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	
	public static boolean esPar(int n) {
		return n%2==0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		boolean calculo;
		System.out.println("Introduce el numero entero: ");
		numero = s.nextInt();
		calculo = esPar(numero);
		System.out.println(calculo);
	}

}
