package ejercicio_collecciones2;

import java.util.LinkedList;

public class PilaPalabra1 {
	LinkedList<String> pila;

	public PilaPalabra1() {
		pila = new LinkedList<String>();
	}

	public void apilarPalabra(String palabra) {
		// pila.add(palabra);
		pila.addLast(palabra);
	}

	public String desapilarPalabras() {
		// return pila.remove(pila.size() - 1);
		return pila.removeLast();
	}

	public String obtenerPalabraCima() {
		// return pila.get(pila.size() - 1);
		return pila.getLast();
	}

	public boolean pilaPalabraVacia() {
		return pila.isEmpty();
	}

	public String imprimir() {
		String cadena = "";
		for (int i = 0; i < pila.size(); i++) {
			cadena = cadena + pila.get(i) + "\n";
		}
		return cadena;
	}

}
