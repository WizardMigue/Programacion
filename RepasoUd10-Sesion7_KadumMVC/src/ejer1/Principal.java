package ejer1;

public class Principal {
	public static void main(String[] args) {
		new AccesoBdatos("baloncesto");
		Vista vista = new Vista();
		AccesoBdatos controlador = new AccesoBdatos(vista);
		vista.conectaControlador(controlador);
	}
}