package ejercicios;

public class Ejercicio2Arrays {

	public static void main(String[] args) {
		int[] n = new int[20];
		for (int i = 0; i < 20; i++) {
			n[i] = (int) (Math.random() * 100);
			System.out.println(n[i]);
		}
	}

}
