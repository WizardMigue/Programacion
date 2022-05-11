package ejercicios;

import java.util.Scanner;

public class Ejercicio12Arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce una cadena de caracteres: ");
		String cadena = s.nextLine();

		int[] numeroVocales = new int[5];
		for (int j = 0; j < cadena.length(); j++) {
			if (cadena.charAt(j) == 'a' || cadena.charAt(j) == 'A')
				numeroVocales[0] = numeroVocales[0] + 1;
			if (cadena.charAt(j) == 'e' || cadena.charAt(j) == 'E')
				numeroVocales[1] = numeroVocales[1] + 1;
			if (cadena.charAt(j) == 'i' || cadena.charAt(j) == 'I')
				numeroVocales[2] = numeroVocales[2] + 1;
			if (cadena.charAt(j) == 'o' || cadena.charAt(j) == 'O')
				numeroVocales[3] = numeroVocales[3] + 1;
			if (cadena.charAt(j) == 'u' || cadena.charAt(j) == 'U')
				numeroVocales[4] = numeroVocales[4] + 1;
		}

		System.out.println("Vocales A: " + numeroVocales[0]);
		System.out.println("Vocales E: " + numeroVocales[1]);
		System.out.println("Vocales I: " + numeroVocales[2]);
		System.out.println("Vocales O: " + numeroVocales[3]);
		System.out.println("Vocales U: " + numeroVocales[4]);
	}
}
