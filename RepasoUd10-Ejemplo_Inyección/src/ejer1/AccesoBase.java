package ejer1;

import java.sql.*;
import java.util.ArrayList;

public class AccesoBase {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "sample";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	static ResultSet reg;

// NUNCA CONECTARSE CON USUARIO ROOT!!!!!!!!!!!!!!!!!!!
// SOLO PARA PRUEBAS!!!!!!!

	public Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public ArrayList<Usuario> consultarTodos() {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		try {
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM usuario");
			ResultSet reg = consulta.executeQuery();
			while (reg.next()) {
				Usuario user = new Usuario(reg.getString(1), reg.getInt(2), reg.getString(3));
				lista.add(user);
			}
			consulta.close();
		} catch (SQLException e) {
			return null;
		}
		return lista;
	}

	public String compruebaContrase?a(String usu, String pass) throws SQLException {
		PreparedStatement consulta = conecta.prepareStatement("select * from usuario where username =? AND password=?");
		consulta.setString(1, usu);
		consulta.setString(2, pass);
		reg = consulta.executeQuery();
		if (reg.next())
			return reg.getNString(3);
		else
			return "El usuario/contrase�a es incorrecto.";

	}

	//

	//
	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}
}
