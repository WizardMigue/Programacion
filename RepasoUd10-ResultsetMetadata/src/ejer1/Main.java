package ejer1;

import java.sql.*;

public class Main {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "empleados";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false"
			+ "&serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection conexion = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = conexion.prepareStatement("SELECT * FROM empleados WHERE dpto=?");
		ps.setInt(1, 10);
		ResultSet rs = ps.executeQuery();

		for (int x = 1; x <= rs.getMetaData().getColumnCount(); x++)
			System.out.print(rs.getMetaData().getColumnName(x) + "\t");

		System.out.println("");

		while (rs.next()) {

			for (int x = 1; x <= rs.getMetaData().getColumnCount(); x++)
				System.out.print(rs.getString(x) + "\t");

			System.out.println("");
		}
		System.out.println();
		for (int x = 1; x <= rs.getMetaData().getColumnCount(); x++) {
			System.out.println(rs.getMetaData().getColumnName(x) + "-" + rs.getMetaData().getColumnTypeName(x) + "-"
					+ rs.getMetaData().getColumnDisplaySize(x));
		}

		ps.close();
		rs.close();
		conexion.close();
	}
}
