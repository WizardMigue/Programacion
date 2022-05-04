package _03colecciones2;

import java.util.Comparator;

public class TituloComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		int resta = o1.dameTitulo().compareToIgnoreCase(o2.dameTitulo());
		if (resta <= 0)
			return -1;
		else
			return 1;
	}
}
