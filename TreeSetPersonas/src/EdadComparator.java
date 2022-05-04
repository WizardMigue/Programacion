import java.util.Comparator;

public class EdadComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona arg0, Persona arg1) {
		int resta = arg0.dameEdad() - arg1.dameEdad();
		if (resta <= 0) {
			return -1;
		} else {
			return 1;
		}
		// No ponemos
		// return arg0.dameEdad() - arg1.dameEdad();
		// Porque nos quita las personas con la misma edad
	}
	
	
}
