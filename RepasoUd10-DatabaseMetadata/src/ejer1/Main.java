package ejer1;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		AccesoBase abd = new AccesoBase();
		abd.conectar();
		abd.columnasMetadata("empleados", "departamentos");
		abd.desconectar();
	}
}
