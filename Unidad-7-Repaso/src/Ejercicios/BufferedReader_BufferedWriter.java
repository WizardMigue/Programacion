package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter {

	public static void main(String[] args) {
		try {
			// es mejor crear el BufferedWriter que el BufferedReader para que no nos de un
			// error. Si lo hacemos al revés (BufferedReader que BufferedWriter)
			// deberemos crear nosotros mismos el fichero.
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros/fichero03.txt")); // ("Ficheros/fichero03.txt",
																								// true)) para mostrar
																								// el texto seguido
			// con true en el FileWriter te sale todo sequido
			BufferedReader br = new BufferedReader(new FileReader("Ficheros/fichero03.txt"));
			// escribimos en el fichero
			bw.write("Esto es una prueba con buffered");
			bw.newLine();
			bw.write("Siguiente línea");
			bw.flush();
			// leemos el fichero y lo mostramos por pantalla
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error inesperado");
		}

	}

}
