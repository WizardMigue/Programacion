package ejercicios;

import java.util.Scanner;

public class EjercicioArrays7 {
	
	
	public static void rotar(int [] n) {
		int aux = n[n.length-1];
		
		for(int i = n.length -1; i>0; i--) {
			n[i]= n[i-1];
		}
		n[0] = aux;
		
		for(int x = 0; x < n.length; x ++) {
			System.out.print(n[x] + " , ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] n = new int [15];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Introduce los números en el array: ");
			n[i] = s.nextInt();
		}
		rotar(n);
		
	}

}
