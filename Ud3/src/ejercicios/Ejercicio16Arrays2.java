
package ejercicios;

import java.util.Scanner;

public class Ejercicio16Arrays2 {
	
	public static void introduce(int[][]m) {
		int matriz[][] = { {4,9,2}, {3,5,7},{8,1,6}};
		boolean magica = true;
		for(int i = 1; i <= matriz.length*matriz.length;i++) {
			if(existeNumnero(matriz, i)==false) {
				magica=false;
			}
		}
	}
	
	public static boolean existeNumnero(int[][] m, int numero) {
		for (int i = 0; i < m[i].length; i++) {
		for (int j = 0; j < m[i].length; j++) {
			if (numero == m[i][j]) {
				return true;
			}
		}
		}
	
	return false;
}
}


