package ejer1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AccesoBase {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "empleados";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	private Connection conecta;
	private static DatabaseMetaData metadata;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
		metadata = conecta.getMetaData();
	}

	public void desconectar() throws SQLException, ClassNotFoundException {

		conecta = null;
	}

	public static void infoGeneralMetadata() throws SQLException {

		String mensaje = "Gestor de base de datos: " + metadata.getDatabaseProductName() + "\n" + "Versión instalada: "
				+ metadata.getDatabaseProductVersion() + "\n" + "Usuario conectado: " + metadata.getUserName() + "\n"
				+ "Tipo de driver JDBC: " + metadata.getDriverName() + "\n" + "Versiones JDBC soportadas: "
				+ metadata.getJDBCMinorVersion() + " a " + metadata.getJDBCMajorVersion() + "\n"
				+ "Versión del Driver: " + metadata.getDriverVersion();

		JOptionPane.showMessageDialog(null, mensaje, "Información del SGBD", JOptionPane.INFORMATION_MESSAGE);
	}

	public void tablasMetadata(String catalogo) throws SQLException {
		String mensaje = "";
		String[] tablaTipos = { "TABLE", "VIEW" };
		ResultSet rs = metadata.getTables(catalogo, null, null, tablaTipos);
		while (rs.next()) {
			mensaje = mensaje + "Nombre: " + rs.getString("TABLE_NAME") + " - " + "Tipo : " + rs.getString("TABLE_TYPE")
					+ "\n";
		}
		JOptionPane.showMessageDialog(null, mensaje, "Tablas de la Bda " + catalogo, JOptionPane.INFORMATION_MESSAGE);

	}

	public void tablasMetadataMejorado(String catalogo) throws SQLException {
		String mensaje = "";
		if (!existeCatalogo(catalogo)) {
			mensaje = " No existe el catálogo: " + catalogo;
			JOptionPane.showMessageDialog(null, mensaje, catalogo + " no encontrado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(-1);
		}
		String tablaTipos[] = { "TABLE", "VIEW" };
		ResultSet rs = metadata.getTables(catalogo, null, null, tablaTipos);
		while (rs.next()) {
			mensaje = mensaje + "Nombre: " + rs.getString("TABLE_NAME") + " - " + "Tipo : " + rs.getString("TABLE_TYPE")
					+ "\n";
		}
		JOptionPane.showMessageDialog(null, mensaje, "Tablas de la Bda " + catalogo, JOptionPane.INFORMATION_MESSAGE);
	}

	public boolean existeCatalogo(String catalogo) throws SQLException {
		boolean encontrado = false;
		ResultSet rs = metadata.getCatalogs();

		while (rs.next()) {
			if (rs.getString("TABLE_CAT").equalsIgnoreCase(catalogo)) {
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}

	public boolean existeTabla(String tabla, String catalogo) throws SQLException {
		boolean encontrado = false;
		ResultSet rs = metadata.getTables(catalogo, null, tabla, null);

		while (rs.next()) {
			if (rs.getString("TABLE_name").equalsIgnoreCase(tabla)) {
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}

	public void columnasMetadata(String catalogo, String tabla) throws SQLException {

		String mensaje = "";
		if (!existeCatalogo(catalogo) || !existeTabla(tabla, catalogo)) {
			mensaje = " No existe el catálogo " + catalogo + " o la tabla " + tabla;
			JOptionPane.showMessageDialog(null, mensaje, catalogo + " no encontrado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(-1);
		}
		ResultSet rs = metadata.getColumns(catalogo, null, tabla, null);
		ResultSet rs2 = metadata.getPrimaryKeys(catalogo, null, tabla);
		while (rs.next()) {
			mensaje = mensaje + "Nombre: " + rs.getString("COLUMN_NAME") + " | Tipo: " + rs.getString("TYPE_NAME")
					+ " | Tamańo: " + rs.getString("COLUMN_SiZE") + " | Admite nulos: " + rs.getString("IS_NULLABLE")
					+ "\n";
		}
		mensaje = mensaje + "______________________________________\n Clave primaria: ";
		while (rs2.next()) {
			mensaje = mensaje + rs2.getString("column_name") + " ";
		}

		JOptionPane.showMessageDialog(null, mensaje, "Tablas de la Bda " + catalogo, JOptionPane.INFORMATION_MESSAGE);
	}

}
