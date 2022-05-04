package _03colecciones2;

import java.util.Comparator;

public class PaginasComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		int resta = o1.getPaginas() - o2.getPaginas();
		if (resta <= 0) {
			return -1;
		} else {
			return 1;
		}
	}

}
