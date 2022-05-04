package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int i;
        int y;
        int x;
        
        System.out.print("Introduce una variable: ");
        i = s.nextInt();
        
        System.out.print("Introduce una variable: ");
        x = s.nextInt();
        
        System.out.println("Valores iniciales: i = " + i + "   x = " + x);                                        
        
        y = i;
        i = x;
        x = y;      
        System.out.println("Valores intercambiados: i = " + i + "   x = " + x);

	}

}
