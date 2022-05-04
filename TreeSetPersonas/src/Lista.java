import java.util.TreeSet;

public class Lista {
	private TreeSet<Persona> lista;

	public Lista() {
		// lista = new TreeSet<Persona>(new ApellidosComparator());
		// lista = new TreeSet<Persona>(new EdadComparator());
		lista = new TreeSet<Persona>(); // Ordenacion natural
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean vacia() {
		return lista.isEmpty();
	}

	public String toString() {
		String cadena = "";
		for (Persona p : lista) {
			cadena = cadena + p + "\n";
		}
		return cadena;
	}

	public boolean insertar(Persona p) {
		return lista.add(p);
	}

	public Persona buscarPorDni(long num) {
		for (Persona p : lista) {
			if (p.dameNif().dameDni() == num)
				return p;
		}
		return null;
	}

	public boolean borrarPersonaPorDni(long num) {
		for (Persona p : lista) {
			if (p.dameNif().dameDni() == num) {
				return lista.remove(p);
			}
		}
		return false;
	}

	public TreeSet<Persona> buscarPorApellido(String apellido) {
		TreeSet encontrados = new TreeSet<Persona>();
		for (Persona p : lista) {
			if (p.dameApellidos().toUpperCase().contains(apellido.toUpperCase())) {
				encontrados.add(p);
			}
		}
		return encontrados;
	}

}