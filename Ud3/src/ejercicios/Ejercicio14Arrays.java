package ejercicios;

import java.util.Scanner;

public class Ejercicio14Arrays {
	Scanner s = new Scanner(System.in);
		static int[][] matriz;
		 
	    public static void main(String[] args) {
	        inicializar();
	        visualizar();
	        Simetrica();
	    }
	 
	    static boolean Simetrica(){
	        for(int i=0; i < matriz.length; i++){
	            for(int j=0; j < matriz[i].length ; j++){
	                if(matriz[i][j] != matriz[j][i]){
	                	System.out.println("La matriz no es simetrica");
	                    return false;
	                }
	            }
	        }
	        System.out.println("La matriz es simetrica");
			return true;
	    }
	 
	    static void inicializar(){
	        Scanner s = new Scanner(System.in);
	        System.out.print("Introduce las dimesiones de la matriz: ");
	        int m = s.nextInt();
	        matriz = new int[m][m];
	        for(int i=0;i<matriz.length;i++){
	            for(int j=0;j<matriz[i].length;j++){
	                System.out.printf("Introduce el valor fila %d - columna %d: ", (i+1), (j+1));
	                matriz[i][j] = s.nextInt();
	            }
	        }
	    }
	 
	    static void visualizar(){
	        System.out.println("La matriz es: ");
	        for(int i=0;i<matriz.length;i++){
	            for(int j=0;j<matriz[i].length;j++){
	                System.out.print(matriz[i][j]);
	            }
	            System.out.println();
	        }
	    }
	

	}


