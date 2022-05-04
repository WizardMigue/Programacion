import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio5 {

	public static void reves(String r) {
		int caract;
		String[] texto;
		String cadena = "";
		try {
			FileReader fr = new FileReader("Ficheros/fichero1");

			while ((caract = fr.read()) != -1) {
				cadena = cadena + ((char) caract);
			}
			fr.close();
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error en la entrada de datos");
		}
	}

	public static void main(String[] args) throws IOException {
		String r = "Ficheros/ejercicio5.txt";
		reves(r);
	}

}
