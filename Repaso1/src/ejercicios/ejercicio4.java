package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
	
	public static double area (int radio, double pi) {
		return radio * pi / 2;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int radio;
		double pi;
		double calculo;
		System.out.println("Introduce el radio del circulo: ");
		radio = s.nextInt();
		System.out.println("Introduce el pi del circulo: ");
		pi = s.nextInt();
		calculo = area(radio,pi);
		System.out.println(calculo);
	}

}
