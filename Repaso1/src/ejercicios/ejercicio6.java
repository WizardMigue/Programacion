package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static double cuadrado(int c) {
		double raiz = Math.sqrt(c);
		return raiz;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		System.out.println("Introduce el numero: ");
		numero = s.nextInt();
		
		if(numero%cuadrado(numero)==0) {
			System.out.println("El numero introducido se puede expresar en cuadrado en: " + cuadrado((int)numero));
		}else {
			System.out.println("null ");
		}
}

}
