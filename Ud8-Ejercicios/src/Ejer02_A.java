import java.io.*;

public class Ejer02_A {

	public static void main(String[] args) {
		String fichero = "Documentos/departamento.dat";

		Departamento d1 = new Departamento(1, "Nominas", "Huesca");
		Departamento d2 = new Departamento(2, "Marketing", "Madrid");
		Departamento d3 = new Departamento(3, "Comercio", "Zaragoza");
		Departamento d4 = new Departamento(4, "Pedidos", "Toledo");

		ObjectOutputStream entrada;
		try {
			entrada = new ObjectOutputStream(new FileOutputStream(fichero));
			entrada.writeObject(d1);
			entrada.writeObject(d2);
			entrada.writeObject(d3);
			entrada.writeObject(d4);
		} catch (FileNotFoundException e) {
			System.out.println("No has escrito el nombre del fichero correctamente");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error inesperado");
			e.printStackTrace();
		}
	}
}
