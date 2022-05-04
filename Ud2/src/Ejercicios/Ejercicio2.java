package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n1;
	        int n2; 
	        int n3;
	        System.out.print("Introduzca primer número: ");
	        n1 = s.nextInt();
	        System.out.print("Introduzca segundo número: ");
	        n2 = s.nextInt();
	        System.out.print("Introduzca tercer número: ");
	        n3 = s.nextInt();
	        if (n1 > n2) {
	            if (n1 > n3) {
	                System.out.println("El mayor es: " + n1);                                             
	            } else {
	                System.out.println("el mayor es: " + n3);     
	            }
	        } else if (n2 > n3) {
	            System.out.println("el mayor es: " + n2);
	        } else {
	            System.out.println("el mayor es: " + n3);
	        }
	}
	{
		}
	}
	
