package Ejercicios_Repaso;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner s = new Scanner(System.in); 	
	public static void introducirAlturas(double [] alturas) {
		for(int i = 0; i < alturas.length; i++) {
			System.out.println("Introduce la altura de la persona " + i);
			alturas[i] = s.nextDouble();
		}
	} // de introducir alturas
	
	public static double alturaMedia(double [] alturas) {
		double sumaAlturas = 0;
		for(int i = 0; i < alturas.length; i++) {
			sumaAlturas=sumaAlturas+alturas[i];
		}
		return sumaAlturas/alturas.length;
	} // de altura media
	
	public static int numPersonasAltas (double [] alturas, double media) {
		int contador=0;
		for(int i = 0; i < alturas.length; i++) {
			if (alturas[i]>=media) 
				contador++;
			
		}
		return contador;
	}// de numero de personas altas
	
	public static void main(String[] args) {
		int n;
		double media;
		int personasAltas;
		do {
			System.out.println("Introduce el numero de personas");
			n = s.nextInt();
		} while (n<=0);
		double [] alturas = new double[n];
		introducirAlturas(alturas);
		media = alturaMedia(alturas);
		personasAltas = numPersonasAltas(alturas, media);
		System.out.println("Númnero de personas que superan la media: "+ personasAltas);
		System.out.println("Númnero de personas inferiores la media: "+ (n-personasAltas));
	} // del main
 
} // de la clase