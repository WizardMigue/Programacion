package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		int [] numero = new int [20];
		int [] cuadrado = new int [20];
		int [] cubo = new int [20];
		
		
		System.out.println("El array del numero; ");
		for(int i = 0; i <numero.length; i++ ) {
			numero[i] = (int) (Math.random() * 100);
				System.out.println(numero[i]);
			}
		System.out.println();
		
		System.out.println("El array del cuadrado; ");
		for(int i = 0; i <cuadrado.length; i++ ) {
			cuadrado[i] = numero[i] * numero[i];
				System.out.println(cuadrado[i]);
			}
		System.out.println();
		
		System.out.println("El array del cubo; ");
		for(int i = 0; i <cubo.length; i++ ) {
			cubo[i] = numero[i] * numero[i] * numero[i];
				System.out.println(cubo[i]);
			}
		System.out.println();
		}
		
		
	}
	

