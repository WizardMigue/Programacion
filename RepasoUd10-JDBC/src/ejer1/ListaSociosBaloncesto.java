package ejer1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaSociosBaloncesto {
	static AccesoBase abd = new AccesoBase();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		try {
			abd.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("No ha sido posible conectarse a la base de datos");
			System.exit(0);
		}

		System.out.println();
		System.out.println("Introduzca una localidad:");
		String local = s.nextLine();
		sociosPorlocalidad(local);
		try {
			abd.desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void sociosPorlocalidad(String local) throws SQLException {
		int cont = 0;
		if (local.isEmpty())
			abd.consultarTodosResultSetSocios();
		else {
			System.out.println("LISTA DE SOCIOS POR LOCALIDAD");
			System.out.println("=============================");
			ArrayList<Socio> lista = abd.consultarPorLocalidadSocios(local);
			for (Socio s : lista) {
				System.out.println(s);
				cont++;
			}
			System.out.println("___________________________________________________________________________________");
			System.out.println("Total de socios: " + cont);
		}
	}

	private static void muestrasocios() {
		int cont = 0;
		System.out.println("LISTA DE SOCIOS");
		System.out.println("===============");
		ArrayList<Socio> lista = abd.consultarTodosSocios();
		for (Socio s : lista) {
			System.out.println(s);
			cont++;
		}
		
		System.out.println("___________________________________________________________________________________");
		System.out.println("Total de socios: " + cont);

	}

}
