package Ejercicios01;

import java.sql.*;
import java.util.ArrayList;

public class BaloncestoAccesoADatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	// Conectar a la base de datos baloncesto
	public Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public ArrayList<Socios> consultarTodos() {
		ArrayList<Socios> lista = new ArrayList<Socios>();

		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM socio");
			while (reg.next()) {
				Socios socio = new Socios(reg.getInt(1), reg.getString(2), reg.getInt(3), reg.getInt(4),
						reg.getString(5));
				lista.add(socio);
			}
			consulta.close();
		} catch (SQLException e) {
			return null;
		}
		return lista;
	}

	public Socios consultarId(int numero) {
		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM socio WHERE socioID=" + numero);
			Socios socio = new Socios(reg.getInt(1), reg.getString(2), reg.getInt(3), reg.getInt(4), reg.getString(5));
			if (reg.next()) {

				socio.setSocioID(reg.getInt(1));
				socio.setNombre(reg.getString(2));
				socio.setEstatura(reg.getInt(3));
				socio.setEdad(reg.getInt(4));
				socio.setLocalidad(reg.getString(5));
			} else
				socio = null;
			consulta.close();
			return socio;
		} catch (SQLException e) {
			System.out.println("error en la consulta" + e.getMessage());
			return null;
		}
	}

	public ArrayList<Socios> consultarPorLocalidad(String localidad) {
		ArrayList<Socios> lista = new ArrayList<Socios>();
		try {
			int contador = 0;
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM socio WHERE localidad LIKE '%" + localidad + "%'");
			while (reg.next()) {
				Socios socio = new Socios(reg.getInt(1), reg.getString(2), reg.getInt(3), reg.getInt(4),
						reg.getString(5));
				lista.add(socio);
				contador = contador;
				contador++;
			}
			consulta.close();
			return lista;
		} catch (SQLException e) {
			System.out.println("error en la consulta" + e.getMessage());
			return null;
		}
	}

	public ResultSet consultarTodosResultSet() throws SQLException {
		Statement consulta = conecta.createStatement();
		return consulta.executeQuery("SELECT * FROM socio");
	}

	public void consultarTodosResultSet2() throws SQLException {
		Statement consulta = conecta.createStatement();
		imprimirDatos(consulta.executeQuery("SELECT * FROM socio"));
	}

	private void imprimirDatos(ResultSet r) {
		int contador = 0;
		try {
			while (r.next()) {
				System.out.println(r.getInt(1) + '-' + r.getString(2) + '-' + r.getInt(3) + '-' + r.getInt(4) + '-' 
						+ r.getString(5));
				contador++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Desconectar de la base de datos baloncesto
	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}
}
