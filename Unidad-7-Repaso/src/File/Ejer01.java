package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer01 {
	
	public static void copia() {
		try {
			BufferedReader bf1 = new BufferedReader(new FileReader("Ficheros/fichero01.txt"));
			BufferedReader bf2 = new BufferedReader(new FileReader("Ficheros/fichero02.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros/fichero03.txt"));

			String linea1 = "";
			String linea2 = "";

			while ((linea1 != null) && (linea2 != null)) {
				linea1 = bf1.readLine();
				linea2 = bf2.readLine();

				if (linea1 != null) {
					bw.write(linea1 + "\n");
				}

				if (linea2 != null) {
					bw.write(linea2 + "\n");
				}
			}

			bf1.close();
			bf2.close();
			bw.close();

		} catch (IOException ioe) {
			System.out.println("Error inesperado");
		}
	}

	public static void main(String[] args) {
		copia();
	}
}
