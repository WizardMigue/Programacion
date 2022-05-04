package resueltos;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String numeroString = JOptionPane.showInputDialog("Introduzca una cantidad entera", "Entrada");
		while (!isEntero(numeroString)) {
			numeroString = JOptionPane.showInputDialog(null, "N�mero entero no v�lido. Int�ntelo otra vez", "Entrada");
		}

		Integer numero = Integer.parseInt(numeroString);
		JOptionPane.showMessageDialog(null, "La ra�z cuadrada de " + numero + " vale " + Math.sqrt(numero), "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}// del main

	private static boolean isEntero(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
} // de la clase
