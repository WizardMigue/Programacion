package ejercicio_collecciones2;

import java.util.ArrayList;

public class PilaPalabra2 {
	ArrayList<String> pila;

	public PilaPalabra2() {
		pila = new ArrayList<String>();
	}

	public void apilarPalabra(String palabra) {
		pila.add(palabra);
	}

	public String desapilarPalabras() {
		return pila.remove(pila.size() - 1);
	}

	public String obtenerPalabraCima() {
		return pila.get(pila.size() - 1);
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
