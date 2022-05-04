package Ejercicios;

import java.io.File;
import java.io.IOException;

public class ClaseFile {

	public static void main(String[] args) throws IOException {
		// Creación de objetos File
		File fichero1 = new File("Ficheros/fichero05.txt");
		File fichero2 = new File("Ficheros/fichero06.txt");
		File fichero3 = new File("Ficheros/fichero07.txt");
		File fichero4 = new File("Ficheros/fichero08.txt");
		
		// Creación de objetos
		fichero1.createNewFile();
		fichero2.createNewFile();
		fichero3.createNewFile();
		fichero4.createNewFile();
		
		// Comprobación de la existencia de ficheros
		System.out.println("Fichero: " + fichero1.exists());
		System.out.println("Fichero: " + fichero2.exists());
		System.out.println("Fichero: " + fichero3.exists());
		System.out.println("Fichero: " + fichero4.exists());
		
		System.out.println("");
		
		// Indicar si son directorios o ficheros
		System.out.println("Fichero: " + fichero1.isDirectory());
		System.out.println("Fichero: " + fichero1.isFile());
		
		System.out.println("");
		
		// Indica la ruta absoluta del fichero o directorio
		System.out.println("Fichero: " + fichero1.getAbsolutePath());
		System.out.println("Fichero: " + fichero2.getAbsolutePath());
		System.out.println("Fichero: " + fichero3.getAbsolutePath());
		System.out.println("Fichero: " + fichero4.getAbsolutePath());
		
		System.out.println("");
		
		// Indica si se puede ejecutar
		System.out.println("Fichero: " + fichero1.canExecute());
		System.out.println("Fichero: " + fichero2.canExecute());
		System.out.println("Fichero: " + fichero3.canExecute());
		System.out.println("Fichero: " + fichero4.canExecute());
		
		System.out.println("");
		
		// Indica si se puede leer
		System.out.println("Fichero: " + fichero1.canRead());
		System.out.println("Fichero: " + fichero2.canRead());
		System.out.println("Fichero: " + fichero3.canRead());
		System.out.println("Fichero: " + fichero4.canRead());
		
		System.out.println("");

		// Indica si se puede escribir
		System.out.println("Fichero: " + fichero1.canWrite());
		System.out.println("Fichero: " + fichero2.canWrite());
		System.out.println("Fichero: " + fichero3.canWrite());
		System.out.println("Fichero: " + fichero4.canWrite());
		
		System.out.println("");
		
		// Indica el nombre del fichero o directorio
		System.out.println("Fichero: " + fichero1.getName());
		System.out.println("Fichero: " + fichero2.getName());
		System.out.println("Fichero: " + fichero3.getName());
		System.out.println("Fichero: " + fichero4.getName());
		
		System.out.println("");
		
		// Indica el nombre del directorio padre
		System.out.println("Fichero: " + fichero1.getParent());
		System.out.println("Fichero: " + fichero2.getParent());
		System.out.println("Fichero: " + fichero3.getParent());
		System.out.println("Fichero: " + fichero4.getParent());
	}

}
