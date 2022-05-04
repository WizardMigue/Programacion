package ejercicios;

public class Ejercicio3Arrays {

	public static void main(String[] args) {
		int [] n = new int[12];
		n[0] = 39;
		n[1] = -2;
		n[4] = 0;
		n[6] = 14;
		n[8] = 5;
		n[9] = 120;
		
		for(int i= 0; i < 12; i++) {
			System.out.println(n[i]);
		}
		
		// Respuesta
		// Al ejecutar el programa, los valores asignados se mantienen pero
		// en los vectores que no han sido asignado los valores, los rellena con 0.
	}

}
