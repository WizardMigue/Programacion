
public class Ejer01_C {

	public static void main(String[] args) {
		String cadena = "28080";
		if (cadena.matches("[0-9]{5}"))
			System.out.println("C�digo postal correcto");
		else
			System.out.println("C�digo postal incorrecto");
	}
}
