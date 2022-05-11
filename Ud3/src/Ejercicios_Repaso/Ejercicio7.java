package Ejercicios_Repaso;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cadena;
		System.out.println("Introduce la cadena");
		cadena = s.nextLine();
		boolean capicua = true;
		for (int i = 0; i < cadena.length() / 2; i++) {
			if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
				capicua = false;
				break;
			}
		} // del for
		if (capicua) {
			System.out.println("La cadena " + cadena + " es capicua");
		} else
			System.out.println("La cadena " + cadena + " No es capicua");
	}

}
