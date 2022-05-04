package pp;

import java.util.HashSet;

public class Banco {

	private HashSet<Cuenta> listaCuenta;

	public Banco() {
		listaCuenta = new HashSet<Cuenta>();
	}

	public void crearCuenta(Cuenta c) {
		listaCuenta.add(c);
	}

	public int tamanyo() {
		return listaCuenta.size();
	}

	public void mostrarCuentas() {
		for (int i = 0; i < tamanyo(); i++) {
			System.out.println(listaCuenta);
		}
	}

	public boolean buscarCuentaPorNumero(long n) {
		for (int i = 0; i < tamanyo(); i++) {
			if (n <= 0)
				return false;
			else
				return true;
		}
		return false;
	}

	public boolean annadirCuenta(Cuenta b) {
		return listaCuenta.add(b);
	}

}
