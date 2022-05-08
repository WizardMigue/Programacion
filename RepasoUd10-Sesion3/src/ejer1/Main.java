package ejer1;

import java.sql.SQLException;

public class Main {
	static AccesoBase abd= new AccesoBase();
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		abd.conectar();
		System.out.println(abd.consultaPorAntiguedad(dateToSqlDate.fechaSQL("1981/02/22")));
		Empleado e2 = new Empleado(10, "CARRERA", "PROFESOR", 7788, dateToSqlDate.fechaSQL("2020/03/18"), 700, 0, 35);
		System.out.println(abd.insertarConBean(e2));
		e2.setNumero(16);
		e2.setNombre("CARRERA");
		e2.setPuesto("PROFESOR");
		e2.setAntiguedad(dateToSqlDate.fechaSQL("2020/03/18"));
		e2.setDepartamento(20);
		System.out.println(abd.insertarConBean(e2));
		abd.desconectar();
	}

}
