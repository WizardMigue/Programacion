import java.io.*;

public class ejercicio1 {

	public static void calculos(String fichero) {
		FileReader fr;
		BufferedReader filtro;
		String linea;
		int contador = 0;
		double suma = 0;
		try {
			fr = new FileReader(fichero);
			filtro = new BufferedReader(fr);
			linea = filtro.readLine();
			while (linea != null) {
				contador++;
				suma = suma + Double.parseDouble(linea);
				// System.out.println(linea);
				// System.out.println();
				linea = filtro.readLine();
			}
			filtro.close();
			fr.close();
			System.out.println("La suma vale: " + suma);
			System.out.println("La media vale: " + suma / contador);
		} catch (IOException e) {
			System.out.println("No se puede abrir el archivo para lectura");
		}
	}

	public static void main(String[] args) {
		String nombreArchivo = "Ficheros/fichero2.txt";
		calculos(nombreArchivo);
	}
}
