package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int cuentaPrimos = 0, numero=1;
		while (cuentaPrimos < 100) {
			int contador = 0, resto;

			for (int i = 2; i <= numero / 2; i++) {
				resto = numero % i;
				if (resto == 0)
					contador++;
			}
			if (contador == 0) {
				System.out.print(numero + " - ");
				cuentaPrimos++;
			}
			numero++;
		}
	}       
	
}




