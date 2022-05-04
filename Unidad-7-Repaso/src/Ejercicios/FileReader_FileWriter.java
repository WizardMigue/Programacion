package Ejercicios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter {

	public static void main(String[] args) throws IOException {

		try {
			FileWriter fw = new FileWriter("Ficheros/fichero02.txt");
			// escribe en el fichero02.txt y lo guarda
			fw.write("Esto es una prueba"); // texto sin más
			fw.write("\n"); // salto de linea
			fw.write(97); // A en ascii
			fw.write("\n"); // salto de linea
			fw.close();

			FileReader fr = new FileReader("Ficheros/fichero02.txt");
			// lee en el fichero02.txt y lo muestra por pantalla
			int valor = fr.read();
			while (valor != -1) {
				System.out.println((char) valor);
				valor = fr.read();
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Error inesperado");
		}
	}

}
