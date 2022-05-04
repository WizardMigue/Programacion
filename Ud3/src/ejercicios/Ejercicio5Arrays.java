package ejercicios;

public class Ejercicio5Arrays {

	public static void main(String[] args) {
		int numero[] = new int[20];
		int cuadrado[] = new int[20];
		int cubo[] = new int[20];

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random() * 101);

			for (i = 0; i < 20; i++) {
				cuadrado[i] = (int) numero[i] * numero[i];

				for (i = 0; i < 20; i++) {
					cubo[i] = cuadrado[i] * numero[i];

				}
				for (i = 0; i < 20; i++) {
					System.out.printf("%4d \t %4d \t %4d \t", numero[i], cuadrado[i], cubo[i]);
				}
			}
		}
	}
}
