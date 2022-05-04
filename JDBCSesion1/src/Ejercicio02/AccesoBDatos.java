package Ejercicio02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Ejercicios01.Socios;

public class AccesoBDatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "sample";
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

	public boolean consultarPorNombre(String usuario) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM usuario where usuario" + usuario);
			while (reg.next()) {
				if(usuario.equals(reg.getString(1))) {
					consulta.close();
					return true;
				}else
					consulta.close();
					return false;
			}
			consulta.close();
			return false;
		} catch (SQLException e) {
			System.out.println("error en la consulta" + e.getMessage());
			return false;
		}
	}

	public boolean consultarPorContraseña(String password) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM usuario where password" + password);
			while (reg.next()) {
				if (password.equals(reg.getString(2))) {
					consulta.close();
					return true;
				} else
					consulta.close();
				return false;
			}
			consulta.close();
			return false;
		} catch (SQLException e) {
			System.out.println("error en la consulta" + e.getMessage());
			return false;
		}
	}

	// Desconectar de la base de datos baloncesto
	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

}
