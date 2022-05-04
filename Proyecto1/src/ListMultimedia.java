import java.util.ArrayList;
import java.util.Iterator;

public class ListMultimedia {

	private ArrayList<Multimedia> lista;

	public ListMultimedia() {
		lista = new ArrayList<Multimedia>();
	}

	public ListMultimedia(ArrayList<Multimedia> lista) {
		super();
		this.lista = lista;
	}

	public boolean insertar(Multimedia p) {
		return lista.add(p);
	}

	public int ContarCanciones() {
		int d = 0;

		for (Multimedia tmp : lista) {
			if (tmp instanceof discos) {
				if (((discos) tmp).getGenero().equals("rock")) {
					d++;
				}
			} else {
				System.out.println("No es una canción");
			}
		}

		return d;
	}

	public double TotalDuracionCancion() {
		double duracionTotal = 0;
		Iterator<Multimedia> it = lista.iterator();
		while (it.hasNext()) {
			duracionTotal = duracionTotal + it.next().getDuracion();
		}
		return duracionTotal;
	}

	public int contarActriz() {
		int d = 0;

		for (Multimedia tmp : lista) {
			if (tmp instanceof peliculas) {
				if (((peliculas) tmp).getActrizPrincipal().equals("null")) {
					d++;
				}
		}
	}
		return d;

	}

	@Override
	public String toString() {
		return "ListMultimedia" + lista;
	}

}
