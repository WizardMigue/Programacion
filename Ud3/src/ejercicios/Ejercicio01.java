package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static boolean esPar(int n) {
		boolean resultado;
		if ((n % 2 == 0)) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		boolean calculo;
		System.out.println("Introduce el número: ");
		numero = s.nextInt();
		calculo = esPar(numero);
		System.out.println(calculo);
	}

}
