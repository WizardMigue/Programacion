package ejercicio_collecciones2;

public class MainPilaPalabras {

	public static void main(String[] args) {
		PilaPalabra2 p = new PilaPalabra2();
		p.apilarPalabra("Buenos dias");
		p.apilarPalabra("Buenos tardes");
		p.apilarPalabra("Buenos noches");
		System.out.println(p.desapilarPalabras());
		System.out.println(p.imprimir());

	}

}
