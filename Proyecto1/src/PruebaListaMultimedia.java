public class PruebaListaMultimedia {

	public static void main(String[] args) throws Exception {
		ListMultimedia lista = new ListMultimedia();
		System.out.println("Discos: ");
		Multimedia m1 = new discos("thunder", "Dragons", "mp4", 4.5, "rock");
		Multimedia m2 = new discos("In the sun", "guetta", "mp3", 2.5, "rock");
		Multimedia m3 = new discos("volve", "chinu", "mp4", 3.8, "heavy");
		lista.insertar(m1);
		lista.insertar(m2);
		lista.insertar(m3);
		
		System.out.println("La duración total de las canciones de rock: " + lista.TotalDuracionCancion() + " minutos");
		System.out.println("La cantidad de canciones de rock: " + lista.ContarCanciones());

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		System.out.println();
		
		System.out.println("Peliculas: ");
		lista.insertar(new peliculas("exa", "ell", "DVD", 200.5, "rod", "rad"));
		lista.insertar(new peliculas("tita", "leo", "DVD", 180.5, "e", "null"));
		lista.insertar(new peliculas("nic", "dio", "DVD", 190.5, "r", "ble"));
		
		System.out.println(lista);
		System.out.println("La cantidad de actrices que no estan en una pelicula: " + lista.contarActriz());

	}

}
