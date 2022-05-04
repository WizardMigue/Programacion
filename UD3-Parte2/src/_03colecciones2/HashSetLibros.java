package _03colecciones2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLibros {
	private HashSet<Libro> lista;

	public HashSetLibros() {
		lista = new HashSet<Libro>();
	}

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int length() {
		return lista.size();
	}

	public boolean insertar(Libro p) {
		return lista.add(p);
	}

	public boolean eliminar(Libro p) {
		return lista.remove(p);
	}

	public Libro buscarLibro(String titulo) {
		for (Libro p : lista) {
			if (p.dameTitulo().toUpperCase().contains(titulo.toUpperCase()))
				return p;
		}
		return null;
	}

	public boolean contiene(Libro l) {
		return lista.contains(l);
	}

	/*
	 * public String toString() { String cad = lista.size() +
	 * " Elementos de la lista:\n\n"; for (int i = 0; i < lista.size(); i++) cad +=
	 * lista.get(i) + "\n-----------------------------------------------\n"; return
	 * cad; }
	 * 
	 * 
	 * public String toString() { String cad = lista.size() +
	 * " Elementos de la lista:\n\n"; for (Libro l: lista) cad += l +
	 * "\n-----------------------------------------------\n"; return cad; }
	 */

	public String toString() {
		String cad = lista.size() + " Elementos de la lista:\n\n";
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			cad += it.next() + "\n-----------------------------------------------\n";
		}
		return cad;
	}

}