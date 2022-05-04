package ejercicios;

import java.util.Scanner;

public class Ejercicio1Arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] n = new int[10];
		System.out.println("Introduce los elementos: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce el " + i +": ");
			n[i]=s.nextInt();
		}
		
		for(int i = 9; i >=0; i--){
			System.out.println("Los números introducidos al reves son: " + n[i]);
		}
		/*
		for (int x = 0; x < 10; x--) {
			System.out.print("Introduce el " + x +": ");
			n[x]=s.nextInt();
		*/
		
	}
	}
	

