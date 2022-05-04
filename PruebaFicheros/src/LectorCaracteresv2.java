import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorCaracteresv2 {

	private static void leer(String f) {
		int caracterLeido;
		try {
			FileReader fr = new FileReader(f);

			while ((caracterLeido = fr.read()) != -1) {
				System.out.print((char) caracterLeido);
			}

			fr.close();
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error al leer el fichero: " + f);
		}
	}

	public static void main(String[] args) throws IOException {
		String f = "Ficheros/fichero2.txt";
		leer(f);

	}

}
