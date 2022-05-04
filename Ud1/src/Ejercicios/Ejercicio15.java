package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un caracter: ");
		char x1 = (char) s.nextLine().charAt(0);
		System.out.println("Codigo ASCII" + x1 + " es "+(int)(x1));
		System.out.print("Los tres caracteres son: ");
		System.out.print((char)(x1+1)+" - ");
		System.out.print((char)(x1+2)+" - ");
		System.out.print((char)(x1+3));

	}

}
