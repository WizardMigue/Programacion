package Ejercicios01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaSociosBaloncesto {

	public static void main(String[] args) throws SQLException {
		Scanner s = new Scanner(System.in);
		BaloncestoAccesoADatos baad = new BaloncestoAccesoADatos();
		try {
			baad.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("NO SE PUDO ESTABLECER LA CONEXIÓN");
			System.exit(-1);
		}

		ArrayList<Socios> lista1 = baad.consultarTodos();
		if (lista1.size() != 0) {
			int contador = 0;
			System.out.println("Listado de todos los socios");
			for (Socios l : lista1) {
				System.out.println(l);
				contador++;
			}
			System.out.println("_____________________________________________________________________________");
			System.out.println("Hay " + contador + " socios");
		} else
			System.out.println("Lista de todos los socios vacía");
		
		System.out.println("\n");
		
		Socios l = baad.consultarId(2);
		if (l != null) {
			System.out.println("Datos del libro " + l.getSocioID());
			System.out.println(l);
		} else
			System.out.println("No se ha encontrado el socio");
		
		System.out.println("\n");
		
		ArrayList<Socios> lista2 = baad.consultarPorLocalidad("Málaga");
		if (lista2.size() != 0) {
			int contador = 0;
			System.out.println("Listado de socios que contienen Málaga en la localidad 'Málaga'");
			for (Socios l2 : lista2) {
				System.out.println(l2);
				contador++;
			}
			System.out.println("______________________________________________________________________________");
			System.out.println("Hay " + contador + " socios");
		} else
			System.out.println("Lista de socios esta vacía");

			System.out.println("______________________________________________________________________________");
			System.out.println();
			
		baad.consultarTodosResultSet2();

		try {
			baad.desconectar();
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR - NO SE LLEGÓ A ESTABLECER CONEXIÓN");
			System.exit(-1);
		}
	}

}
