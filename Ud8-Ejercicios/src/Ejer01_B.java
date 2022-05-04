
public class Ejer01_B {

	public static void main(String[] args) {
		String cadena = "(+34)974243447";
		if (cadena.matches("\\(\\+[0-9]{2,3}\\)[0-9]{9}"))
			System.out.println("Número de teléfono correcto");
		else
			System.out.println("Número de teléfono incorrecto");
	}
}
