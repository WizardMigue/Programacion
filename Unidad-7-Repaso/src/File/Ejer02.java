package File;

import java.io.*;
import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros/fichero09.txt"));

			for (int i = 1; i <= 500; i++) {
				if (esPrimo(i)) {
					bw.write(String.valueOf(i) + "\n");
				}
			}
			bw.close();

		} catch (IOException ioe) {
			System.out.println("Error inesperado");
		}
	}

	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
