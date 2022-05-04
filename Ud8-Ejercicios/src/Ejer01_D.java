
public class Ejer01_D {

	public static void main(String[] args) {
		String cadena = "09/03/2022";
		if (cadena.matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"))
			System.out.println("La fecha es correcta");
		else
			System.out.println("La fecha es incorrecta");
	}
}
