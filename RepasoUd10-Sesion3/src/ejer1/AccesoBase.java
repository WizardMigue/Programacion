package ejer1;

import java.sql.Connection;
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
	private Connection conecta;

	private PreparedStatement consulta;
	private String cadenaSQL;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public void desconectar() throws SQLException, ClassNotFoundException {

		conecta = null; // = conecta.close();
	}

	public Empleado busquedaPorCodigo(int numero) throws SQLException {
		Empleado e = new Empleado();
		String cadenaSQL = "select * from emp where EMPNO = ? ";
		PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
		consulta.setInt(1, numero);
		ResultSet reg = consulta.executeQuery();

		if (reg.next()) {
			e.setNumero(reg.getInt(1));
			e.setNombre(reg.getString(2));
			e.setPuesto(reg.getString(3));
			e.setJefe(reg.getInt(4));
			e.setAntiguedad(reg.getDate(5));
			e.setSalarioL(reg.getDouble(6));
			e.setComision(reg.getDouble(7));
			e.setDepartamento(reg.getInt(8));
			consulta.close();
			return e;

		} else
			return null;
	}

	public ArrayList<Empleado> busquedaPorPuesto(String puesto) {
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		try {
			cadenaSQL = "select * from emp where JOB = ? ";
			consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setString(1, puesto);
			ResultSet reg = consulta.executeQuery();

			while (reg.next()) {
				lista.add(new Empleado(reg.getInt(1), reg.getString(2), reg.getString(3), reg.getInt(4), reg.getDate(5),
						reg.getDouble(6), reg.getDouble(7), reg.getInt(8)));
			}
			consulta.close();
		} catch (SQLException e) {
			lista = null;
		}

		return lista;

	}

	public ArrayList<Empleado> consultaPorAntiguedad(java.sql.Date fecha) {
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		try {
			String cadenaSQL = "select * from emp where HIREDATE <= ?";
			PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setDate(1, fecha);
			ResultSet reg = consulta.executeQuery();
			while (reg.next()) {
				lista.add(new Empleado(reg.getInt(1), reg.getString(2), reg.getString(3), reg.getInt(4), reg.getDate(5),
						reg.getDouble(6), reg.getDouble(7), reg.getInt(8)));

			}
			consulta.close();
		} catch (SQLException e) {
			lista = null;
		}
		return lista;

	}

	public int insertarConBean(Empleado emp) {
		int resultado;
		String cadenaSQL = "insert into emp values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setInt(1, emp.getNumero());
			consulta.setString(2, emp.getNombre());
			consulta.setString(3, emp.getPuesto());
			if (emp.getJefe() > 0)
				consulta.setInt(4, emp.getJefe());
			else
				consulta.setNull(4, Types.INTEGER);
			consulta.setDate(5, emp.getAntiguedad());
			consulta.setDouble(6, emp.getSalario());
			if (emp.getComision() > 0)
				consulta.setDouble(7, emp.getComision());
			else
				consulta.setNull(7, Types.DECIMAL);
			consulta.setInt(8, emp.getDepartamento());
			resultado = consulta.executeUpdate();
			consulta.close();

			return resultado;
		} catch (SQLException e) {
			System.out.print(" ERROR: ");
			return e.getErrorCode();
		}

	}

	public int actualizarSalario(int departamento, double porcentaje) {
		String cadenaSQL = "update emp set SAL=SAL+(SAL*?) where DEPTNO=?";
		try {
			PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setDouble(1, porcentaje);
			consulta.setInt(2, departamento);
			return consulta.executeUpdate();
		} catch (SQLException e) {
			System.out.print(" No se ha actualizado el salario ");
			return e.getErrorCode();
		}
	}

	public int actualizarSalarioConTransacciones(int departamento, double porcentaje) throws SQLException {
		String cadenaSQL = "update emp set SAL=SAL+(SAL*?) where DEPTNO=?";
		try {
			conecta.setAutoCommit(false);
			PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setDouble(1, porcentaje);
			consulta.setInt(2, departamento);
			conecta.commit();
			conecta.setAutoCommit(true);
			return consulta.executeUpdate();
		} catch (SQLException e) {
			System.out.print(" No se ha actualizado el salario ");
			conecta.rollback();
			conecta.setAutoCommit(true);
			return e.getErrorCode();
		}

	}

	public int borrarEmpleado(int numero) {
		String cadenaSQL = "delete from emp where EMPNO=?";
		try {
			PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setInt(1, numero);
			return consulta.executeUpdate();
		} catch (SQLException e) {
			return -1;
		}

	}
}
