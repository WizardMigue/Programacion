package Ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		int meses = 12;
		int mes = 8;
		
		double longitud = (double)mes / (double)meses * 100;
		
		System.out.println("Mes " +  mes  + " de " + meses );
		System.out.printf("Porcentaje trascurrido: %.4f%s", longitud, "%");	
		
	}

}
