import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorBytes {

	private static void escribe(String f) {
		try {
			FileOutputStream fw = new FileOutputStream(f);
			fw.write('1');
			fw.write('\n');
			fw.write(65);
			fw.write('\n');
			fw.close();
			System.out.println("Se cre? correctamente el fichero");
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error en la entrada de datos");
		}
	}

	public static void main(String[] args) {
		String f = "Ficheros/fichero2.dat";
		escribe(f);
	}

}
