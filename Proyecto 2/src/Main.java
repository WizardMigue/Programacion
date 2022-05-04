import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Biblioteca> lista = new ArrayList<Biblioteca>();

		Biblioteca l1 = new libros(122, "java", 1990, false, null);
		Biblioteca l2 = new libros(223, "vida", 2000, true, null);
		// Biblioteca r1 = new revistas(253, "vida1", 2030, true, null);
		// Biblioteca r2 = new revistas(273, "vida2", 2200, true, null);
		System.out.println(l1);
		System.out.println(l2);

		System.out.println(cuentaPrestados(lista));
	}

	public static int cuentaPrestados(ArrayList<Biblioteca> lista) {
		int p = 0;
		for (Biblioteca tmp : lista) {
			if (tmp instanceof libros) {
				if (((libros) tmp).prestado()) {
					p++;
				}
			} else {
				System.out.println("No ha sido prestado");
			}
		}

		return p;
	}

	public static int publicacionesAnterioresA(ArrayList<Biblioteca> lista, int anyo) {
		int l = 0;
		for (Biblioteca tmp : lista) {
			if (tmp.getAnyoPublicacion() < anyo) {
				l++;
			}
		}
		return l;
	}

}
