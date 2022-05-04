package Paquetes_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		try {
			System.out.println("Introduce un numero entero");
			int x = s.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("Los caracteres introducidos no concuerdan con ningun entero");
			ime.printStackTrace();
		} catch (Exception c) {
			System.out.println("Se produjo un error inesperado");
			c.printStackTrace();
		}

	}
}
