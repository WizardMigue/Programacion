
public class PruebaLista {

	public static void main(String[] args) {
		Lista l = new Lista();
		l.insertar(new Persona(1234567, 31, "Luis", "Aldea Navarro"));
		l.insertar(new Persona(2345678, 39, "Belén", "Carrera Sausán"));
		l.insertar(new Persona(3456789, 61, "Antonino", "Lasierra Gardena"));
		l.insertar(new Persona(4567890, 42, "Alberto", "Carrera Martín"));
		l.insertar(new Persona(5678901, 38, "Ana", "Freza Ferrer"));
		/*
		 System.out.println(l.tamanyo()); 
		 System.out.println(l.vacia());
		 System.out.println(l);
		 */
		/*
		System.out.println(l.borrarPersonaPorDni(4567890));
		System.out.println(l.tamanyo());
		*/
		System.out.println(l);
		/*
		String encontrados = l.buscarPorApellido("an");
		if (encontrados.isEmpty());
		System.out.println("No existe nadie con el apellido an");
		else
			System.out.println(encontrados);
		*/
		
		// System.out.println(l.buscarPorApellido("carre"));
	}

}
