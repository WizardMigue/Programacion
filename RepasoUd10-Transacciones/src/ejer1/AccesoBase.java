package ejer1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

public class AccesoBase {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "demodb";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	private static Connection conecta;
	private static ArrayList<Empleado> lista = new ArrayList<Empleado>();
	private static Empleado emp = new Empleado();

	public static void conectar_TRANSACCION() {
		try {
			Class.forName(driver);
			conecta = DriverManager.getConnection(url, username, password);
			conecta.setAutoCommit(false);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void desconectar_TRANSACCION() {
		try {
			conecta.setAutoCommit(true);
			conecta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int insertarConBean_TRANSACCION(Empleado e1) {
		int resultado = 0;
		try {
			String cadenaSQL = "Insert into emp values(?,?,?,?,?,?,?,?)";
			PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setInt(1, e1.getEMPNO());
			consulta.setString(2, e1.getENAME());
			consulta.setString(3, e1.getJOB());
			if (String.valueOf(e1.getMGR()).isEmpty())
				consulta.setNull(4, Types.INTEGER);
			else
				consulta.setInt(4, e1.getMGR());
			consulta.setDate(5, e1.getHIREDATE());
			consulta.setDouble(6, e1.getSAL());
			if (String.valueOf(e1.getCOMM()).isEmpty())
				consulta.setNull(7, Types.DECIMAL);
			else
				consulta.setDouble(7, e1.getCOMM());
			consulta.setInt(8, e1.getDEPNO());
			resultado = consulta.executeUpdate();
			conecta.commit();
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			System.out.println(e.getErrorCode() + ", ya existe un registro con esa clave!!");
		}
		return resultado;
	}

	public static int actualizarSalario_TRANSACCION(int departamento, double porcentaje) {
		int resultado = 0;
		try {
			String cadenaSQL = "update emp set SAL=SAL+(SAL*?) where DEPTNO=?";
			PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setDouble(1, porcentaje);
			consulta.setInt(2, departamento);
			resultado = consulta.executeUpdate();
			conecta.commit();
			return resultado;
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("No existe el departamento");
			return e.getErrorCode();
		}
	}

	public static int borrarEmpleado_TRANSACCION(int numero) {
		int resultado = 0;
		String cadenaSQL = "delete from emp where EMPNO=?";
		try {
			PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setInt(1, numero);
			resultado = consulta.executeUpdate();
			conecta.commit();
			return resultado;

		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return e.getErrorCode();
		}
	}

}
