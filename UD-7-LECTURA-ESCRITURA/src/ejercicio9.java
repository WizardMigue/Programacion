import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio9 {

	private static boolean ficherosIguales(String b1, String b2) {
		String f1 = "";
		String f2 = "";
		int letra;
		try {
			FileReader fr1 = new FileReader(b1);
			FileReader fr2 = new FileReader(b2);

			while ((letra = fr1.read()) != -1) {
				f1 = Character.toString((char) letra);

				while ((letra = fr2.read()) != -1) {
					f2 = Character.toString((char) letra);
				}

				if (f1.equals(f2)) {
					return true;

				}
			}
			fr1.close();
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error al leer el fichero : " + b1 + b2);
		}
		return false;
	}

	public static void main(String[] args) {
		String b1 = "Ficheros/fichero2.txt";
		String b2 = "Ficheros/fichero3.txt";
		System.out.println(ficherosIguales(b1, b2));
	}

}
