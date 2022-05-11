package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		char caracter;

		System.out.println("Introduce un caracter: ");
		char x1 = (char) s.nextLine().charAt(0);
		System.out.println("El caracter introducido es: " + x1 + " es alfanumerico");

		if (Character.isDigit(x1))
			System.out.println("El caracter es un dígito");
		else
			System.out.println("El caracter NO es un dígito");

		if (Character.isLetter(x1))
			System.out.println("El caracter es una letra");
		else
			System.out.println("El caracter NO es una letra");

		if (Character.isUpperCase(x1))
			System.out.println("El caracter es una Mayuscula");
		else
			System.out.println("El caracter NO es una Mayuscula");
	}
}
