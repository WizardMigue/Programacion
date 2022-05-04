package ejercicio_collecciones2;

import java.util.LinkedList;

public class LinkedListProducto {

	LinkedList<Producto> lista;

	public LinkedListProducto() {
		lista = new LinkedList<Producto>();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean agregarProducto(Producto p) {
		return lista.add(p);
	}

	public Producto buscarProducto(int posicion) {
		if (posicion < 1 || posicion > lista.size())
			return null;
		else
			return lista.get(posicion - 1);
	}

	public Producto buscarProductoCodigo(int codigo) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == codigo)
				return lista.get(i);
		}
		return null;
	}

	public Producto borrarProductoCodigo(int codigo) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == codigo)
				return lista.remove(i);
		}
		return null;
	}

	public boolean cambiarPrecio(int codigo, double nuevoPrecio) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == codigo) {
				lista.get(i).setPrecio(nuevoPrecio);
				return true;
			}

		}
		return false;
	}

}// de la clase
