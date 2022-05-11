package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final double distancia1 = 0.15;
		final double distancia2 = 0.20;
		final double distancia3 = 0.35;
		final double distancia4 = 0.80;
		double consumidos;
		double resto;
		double costeTotal = 0;

		System.out.println("Introduce la cantidad de metros cubicos consumidos: ");
		consumidos = s.nextDouble();

		if (consumidos <= 100) {
			costeTotal = consumidos * distancia1;
		}
		if (consumidos > 100 && consumidos <= 500) {
			resto = consumidos - 100;
			costeTotal = (100 * distancia1) + (resto * distancia2);
		}
		if (consumidos > 500 && consumidos <= 1000) {
			resto = consumidos - 500;
			costeTotal = (100 * distancia1) + (400 * distancia2) + (resto * distancia3);
		}
		if (consumidos > 1000) {
			resto = consumidos - 1000;
			costeTotal = (100 * distancia1) + (400 * distancia2) + (500 * distancia3) + (resto * distancia4);
		}
		System.out.println("El coste de agua total es " + costeTotal);

	}

}
