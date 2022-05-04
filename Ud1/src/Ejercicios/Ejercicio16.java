package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int euros;
		System.out.print("Introduce la cantidad: ");
		int Billete500 = 500;
		int Billete200 = 200;
		int Billete100 = 100;
		int Billete50 = 50;
		int Billete20 = 20;
		int Billete10 = 10;
		int Billete5 = 5;
		int Moneda1 = 1;

		euros = s.nextInt();
		System.out.println("Billetes de 500: " + euros/500);
		System.out.println("Billetes de 200: " + (euros%500/200));
		System.out.println("Billetes de 100: " + (euros%500%200/100));
		System.out.println("Billetes de 50: " + (euros%500%200%100/50));
		System.out.println("Billetes de 20: " + (euros%500%200%100%50/20));
		System.out.println("Billetes de 10: " + (euros%500%200%100%50%20/10));
		System.out.println("Billetes de 5: " + (euros%500%200%100%50%20%10/5));
		System.out.println("Moneda de 1: " + (euros%500%200%100%50%20%10%5/1));
	}

}
