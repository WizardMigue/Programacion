package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int resto;
		int n1;
		int n2;
		
		System.out.println("Introduce el primer n�mero: ");
		n1 = s.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		n2 = s.nextInt();
		resto = n1%n2;
		
		if (resto==0)
			  System.out.println(n1 + " es m�ltiplo de " + n2);
			else
			  System.out.println(n1 + " NO es m�ltiplo de " + n2);

	}

}
