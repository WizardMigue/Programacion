import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejercicio10v2 {

	public static void main(String[] args) {

		try {
			FileInputStream origen = new FileInputStream("Ficheros/fichero2.txt");
			FileOutputStream destino = new FileOutputStream("Ficheros/copia_de_fichero3.txt");
			int i = origen.read();
			while (i != -1) {
				destino.write(i);
				i = origen.read();

			}
			origen.close();
			destino.close();
			System.out.println("Se creó correctamente el fichero");
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error en la entrada de datos");
		}
	}

}
