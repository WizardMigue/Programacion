public class Ejercicio6 {

	public static boolean esPrimo(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}// de esPrimo

	public static void rellenar(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
	} // de rellenar

	public static int rellenarPrimos(int[] n, int[] primos) {
		int apuntador = 0;
		for (int i = 0; i < n.length; i++) {
			if (esPrimo(n[i])) {
				primos[apuntador] = n[i];
				apuntador++;
			}
		}
		return apuntador;
	}// de rellenarPrimos

	public static void visualizar(int[] n, int[] primos, int apuntador) {
		System.out.println("Números del vector");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " - ");
		}
		System.out.println("\nNúmeros PRIMOS del vector");
		for (int i = 0; i < apuntador; i++) {
			System.out.print(primos[i] + " - ");
		}
	}

	public static void main(String[] args) {
		int tamanyo= 10,tamanyoPrimos;
		int[]n = new int[tamanyo];
		int[]primos=new int[tamanyo];
		rellenar(n);
		tamanyoPrimos= rellenarPrimos(n, primos);
		visualizar(n, primos, tamanyoPrimos);
	}

}