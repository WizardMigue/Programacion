package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejericicio01 {
	
	public static void calcular(String fichero) {
		FileReader fr;
		BufferedReader br;
		String linea;
		int contador = 0;
		double suma = 0;
		try {
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);
			linea = br.readLine();
			while(linea != null) {
				contador++;
				suma = suma + Double.parseDouble(linea);
				linea = br.readLine();
			}
		br.close();
		fr.close();
		System.out.println("La suma de todos los numeros es: " + suma);
		System.out.println("La media de todos los numeros es: " + suma/contador);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error inesperado");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String nombreArchivo = "Ficheros/fichero01.txt";
		calcular(nombreArchivo);

	}

}
