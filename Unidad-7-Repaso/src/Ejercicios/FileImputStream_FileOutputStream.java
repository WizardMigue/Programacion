package Ejercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileImputStream_FileOutputStream {

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("Ficheros/fichero04.txt");
			FileOutputStream fos = new FileOutputStream("Ficheros/fichero04.txt");
			String texto1 = "Esto es una prueba para ficheros binarios1 \n ";
			String texto2 = "Esto es una prueba para ficheros binarios2 \n ";
			String texto3 = "Esto es una prueba para ficheros binarios3 \n ";
			byte codigos1[] = texto1.getBytes();
			byte[] codigos2 = texto2.getBytes();
			byte codigos3[] = texto3.getBytes();
			fos.write(codigos1);
			fos.write(codigos2);
			fos.write(codigos3);
		} catch (FileNotFoundException e) {
			System.out.println("No esta bien establecida la ruta de salida del fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error inesperado");
		}

	}

}
