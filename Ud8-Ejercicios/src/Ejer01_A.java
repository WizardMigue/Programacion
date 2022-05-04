
public class Ejer01_A {

	public static void main(String[] args) {
		String cadena = "974243447";
		if (cadena.matches("[0-9]{9}"))
			System.out.println("Número de teléfono correcto");
		else
			System.out.println("Número de teléfono incorrecto");
	}
}
