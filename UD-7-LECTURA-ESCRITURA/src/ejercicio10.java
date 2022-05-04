import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio10 {

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

	private static void fichero1(String f) {
		try {
			FileWriter fw = new FileWriter(f);
			fw.write('1');
			fw.write('\n');
			fw.write(65);
			fw.write('\n');
			fw.close();
			System.out.println("Se creó correctamente el fichero");
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error en la entrada de datos");
		}
	}

	private static void fichero2(String f) {
		try {
			FileWriter fw = new FileWriter(f);
			fw.write('1');
			fw.write('\n');
			fw.write(65);
			fw.write('\n');
			fw.close();
			System.out.println("Se creó correctamente el fichero");
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error en la entrada de datos");
		}
	}

	public static void main(String[] args) {
		String b1 = "Ficheros/fichero3.txt";
		String b2 = "Ficheros/copia_de_fichero3.txt";
		System.out.println(ficherosIguales(b1, b2));
		fichero1(b1);
		fichero2(b2);
	}

}
