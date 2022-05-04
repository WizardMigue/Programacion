package _8errores;

public class PruebaErrores {

	public static void main(String[] args) {
		int[] tabla = new int[10];
		int v;
		Integer x = null;
		try {
			v = 90 / 1;
			v = 90 / x;
			tabla[9] = 45;
			System.out.println("Estoy en la linea 10");
			v = Integer.parseInt("2");
			System.out.println("Estoy en la linea 12");

		} catch (ArrayIndexOutOfBoundsException aioo) {
			System.out.println("La casilla a la que intentas acceder no existe");
			aioo.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.out.println("No se puede convertir a entero");
			nfe.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("No se puede dividir por cero");
			ae.printStackTrace();
		} catch (NullPointerException npe) {
			System.out.println("No puedo trabajar con numeros nulos");
			npe.printStackTrace();
		} catch (Exception c) {
			System.out.println("Se produjo un error inesperado");
			c.printStackTrace();
		}

		System.out.println("Estoy en la linea 34");

	}

}
