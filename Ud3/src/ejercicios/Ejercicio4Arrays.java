package ejercicios;

public class Ejercicio4Arrays {

	public static void main(String[] args) {
		char n[] = new char[10];
		n[0] = 'a';
		n[1] = 'x';
		n[4] = '@';
		n[6] = ' ';
		n[7] = '+';
		n[8] = 'Q';

		for (int i = 0; i < 10; i++) {
			System.out.println(n[i]);
		}
		// Resouesta
		// Al ejecutar el programa, los valores asignados se mantienen pero
		// en los vectores que no han sido asignado los valores, los rellena con nada,
		// se dejara un espacio hasta
		// el sigueinte valoror asignado en el array.
	}
}
