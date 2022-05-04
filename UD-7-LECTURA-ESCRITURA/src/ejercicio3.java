import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio3 {

	public static void main(String[] args) throws IOException {
		int caracterizado;
		String[] trozos;
		String cadena = "";
		FileReader fr = new FileReader("Ficheros/fichero2.txt");
		while ((caracterizado = fr.read()) != -1) {
			cadena = cadena + ((char) caracterizado);
		}
		fr.close();

		trozos = cadena.split("[ , \n]");
		System.out.println(trozos.length);
		for (String trozo : trozos) {
			System.out.println(trozo);
		}
	}

}
