package ejercicios;

import java.sql.SQLException;

public class Main3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		abd.columnasMetadata("empleados", "departamentos");
		abd.columnasMetadata("pedidos", "detalles_pedido");
		abd.columnasMetadata("trabajadores", "departamentos");
		abd.desconectar();
	}
}
