import java.io.FileReader;
import java.io.IOException;

public class ejercicio2 {

	private static void contarVocales(String v) {
		int letra;
		int contador = 0;
		try {
			FileReader fr = new FileReader(v);
			while ((letra = fr.read()) != -1) {
				String caracteres = Character.toString((char) letra).toUpperCase();
				if (caracteres.equals("A") || caracteres.equals("E") || caracteres.equals("I") || caracteres.equals("O")
						|| caracteres.equals("U")) {
					contador++;
				}
			}

			fr.close();
			System.out.println("Total de caracteres " + contador);

		} catch (IOException ioe) {
			System.out.println("Ocurrio un error al leer el fichero : " + v);
		}
	}

	public static void main(String[] args) {
		String v = "Ficheros/fichero2.txt";
		contarVocales(v);
	}
}
