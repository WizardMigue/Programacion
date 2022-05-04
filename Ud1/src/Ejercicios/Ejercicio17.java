package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double cantidadPrestada, interesFijo, interesVariable, cuota, cantidadTotal;
		int anyosPrestamo, numeroPagos;
		
		
		System.out.print("Introduce la cantidad del prestamo, el interés anual "
				+ "y duración del prestamo en años, separado por espacios: ");
		cantidadPrestada = s.nextDouble();
		interesFijo = s.nextDouble();
		anyosPrestamo = s.nextInt();
		
		interesVariable = interesFijo / 100 / 12;
		numeroPagos = anyosPrestamo * 12;
		
		
		cuota = (cantidadPrestada * interesVariable) / (1-(1/((Math.pow(1+interesVariable,numeroPagos)))));
		cantidadTotal = cuota * numeroPagos;
		
		System.out.println("Introduccion de datos para el calculo");		
		System.out.println("Cantidad prestada: " + cantidadPrestada);		
		System.out.println("Interes anual (%): " + interesFijo);		
		System.out.println("Duracion en anyos del prestamo: " + anyosPrestamo);
		System.out.println("\n");			
		System.out.println("========================================");
		System.out.println("Resultado de la operacion:");
		System.out.println("Cantidad prestada:" + cantidadPrestada);
		System.out.println("Interes anual:" + interesFijo + ("%"));
		System.out.println("Duracion en anyos del prestamo: " + anyosPrestamo);
		System.out.println("Numero de pagos: " + (anyosPrestamo * 12));
		System.out.printf("Pago mensual: %1.2f", cuota );
		System.out.printf("\nCantidad total a pagar: %1.2f euros", cantidadTotal);
	}

}
