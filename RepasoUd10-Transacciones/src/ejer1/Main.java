package ejer1;

public class Main {

	public static void main(String[] args) {
		AccesoBase.conectar_TRANSACCION();

		Empleado e1 = new Empleado(1, "CARRERA", "PROFESOR", 7788, dateToSqlDate.fechaSQL("2002-06-21"), 700, 0, 20);

		System.out.println(AccesoBase.insertarConBean_TRANSACCION(e1));
		System.out.println(AccesoBase.insertarConBean_TRANSACCION(e1));
		System.out.println("Subir un 20% el salario de los empleados del Departamento 30");
		System.out.println(AccesoBase.actualizarSalario_TRANSACCION(30, 0.2));
		System.out.println(AccesoBase.actualizarSalario_TRANSACCION(44, 0.15));
		System.out.println(AccesoBase.borrarEmpleado_TRANSACCION(1));
		System.out.println(AccesoBase.borrarEmpleado_TRANSACCION(99));
		System.out.println(AccesoBase.borrarEmpleado_TRANSACCION(7839));
		
		AccesoBase.desconectar_TRANSACCION();

	}
}
