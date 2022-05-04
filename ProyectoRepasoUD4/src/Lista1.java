import java.util.ArrayList;

public class Lista1<B> {
	ArrayList<B> lista;

	public Lista1() {
		lista = new ArrayList<B>();
	}

	public void insertar(B b) {
		lista.add(b);
	}

	public void recorrer() {
		for (B b : lista) {
			lista.size();
		}
	}

	public int cuentaZ() {
		int cuenta = 0;
		for (B b : lista) {
			if (b instanceof Z)
				cuenta++;
		}
		return cuenta;
	}
}
