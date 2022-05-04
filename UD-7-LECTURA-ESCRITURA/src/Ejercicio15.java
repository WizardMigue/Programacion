import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Ejercicio15 {

	public static void main(String arg[]) {
		String directorio;
		int contador = 0;
		if (arg.length > 0)
			directorio = arg[0];
		else
			directorio = ".";
		File actual = new File(directorio);
		System.out.println("El directorio es: ");
		try {
			System.out.println(actual.getCanonicalPath());
		} catch (IOException e) {
		}
		System.out.println();
		System.out.println("Su contenido es: ");
		File[] archivos = actual.listFiles();
		for (File archivo : archivos) {
			if (archivo.isFile()) {
				System.out.println("Nombre ARCHIVO: " + archivo.getName());
				System.out.println("Longitud en caracteres " + archivo.length());
				System.out.println("Ruta: " + archivo.getPath());

			}
			if (archivo.isDirectory()) {
				System.out.println("Nombre DIRECTORIO: " + archivo.getName());
				System.out.println("Longitud en caracteres " + archivo.length());
				System.out.println("Ruta: " + archivo.getPath());

			}

			System.out.println();
		}
		System.out.println("Cantidad de directorios: " + archivos.length);
	}

}
