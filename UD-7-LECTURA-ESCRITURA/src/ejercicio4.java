import java.io.FileReader;
import java.io.IOException;

public class ejercicio4 {

	private static void espaciosBlanco(String b) {
		int letra;
		try {
			FileReader fr = new FileReader(b);
			while ((letra = fr.read()) != -1) {
				String caracteres = Character.toString((char) letra).replaceAll(" ", "");
				System.out.print(caracteres);
			}
			fr.close();
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error al leer el fichero : " + b);
		}
	}

	public static void main(String[] args) {
		String b = "Ficheros/fichero2.txt";
		espaciosBlanco(b);
	}

}
