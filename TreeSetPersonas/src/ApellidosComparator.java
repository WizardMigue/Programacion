import java.util.Comparator;

public class ApellidosComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// Apellidos iguales devuelve y lo descarta
		// return o1.dameApellidos().compareToIgnoreCase(o2.dameApellidos());
		int resta = o1.dameApellidos().compareToIgnoreCase(o2.dameApellidos());
		if (resta <= 0)
			return -1;
		else
			return 1;
	}

}
