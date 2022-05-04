package ejercicios;

import java.util.Scanner;

public class Ejercicio13Arrys {

	static Scanner s = new Scanner(System.in);

	public static void NotaAlumno(double[][] m) {
		double max, min, suma;
		for (int i = 0; i < m.length; i++) {
			max = m[i][0];
			min = m[i][0];
			suma = 0;

			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > max) {
					max = m[i][j];
				}
				if (m[i][j] < min) {
					min = m[i][j];
				}
			suma = suma + m[i][j];
			}
			
			System.out.printf("La nota maxima del alumno %d es: %.2f \n", i + 1, max);
			System.out.printf("La nota minimo del alumno %d es: %.2f \n", i + 1, min);
			System.out.printf("La nota media del alumno %d es: %.2f \n", i + 1, suma / m[i].length);
		}// for de las filas
	}
	
	public static void NotaAsignatura(double[][] m) {
		double max, min, suma;
		for (int j = 0; j < m.length; j++) {
			max = m[j][0];
			min = m[j][0];
			suma = 0;

			for (int i = 0; i < m.length; i++) {
				if (m[i][j] > max) {
					max = m[i][j];
				}
				if (m[i][j] < min) {
					min = m[i][j];
				}
			suma = suma + m[i][j];
			}
			
			System.out.printf("\nLa nota maxima de la asignatura %d es: %.2f \n", j + 1, max);
			System.out.printf("La nota minima de la asignatura %d es: %.2f \n", j + 1, min);
			System.out.printf("La nota media de la asignatura %d es: %.2f \n", j + 1, suma / m[j].length);
			System.out.println();
		}// for de las filas
	}

	public static void NotaCurso(double[][] m) {
			double	max = m[0][0];
			double min = m[0][0];
			double suma = 0;
			double contador = 0;
			
				for (int i = 0; i < m.length; i++) {
					for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > max) {
					max = m[i][j];
				}
				contador++;
				if (m[i][j] < min) {
					min = m[i][j];
				}
				contador++;
			suma = suma + m[i][j];
			}
			}
			
			System.out.printf("La nota maxima del curso es: %.2f \n", max);
			System.out.printf("La nota minima del curso es: %.2f \n", min);
			System.out.printf("La nota media del curso es: %.2f \n", suma / (m.length*3));
		}// for de las filas
	
	private static void buscar(double[][] notas) {
		double nota;
		System.out.println("\nIntroduce la nota del alumno:");
		nota = s.nextDouble();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if(nota==notas[i][j]) {
					System.out.println("Alumno " + (i+1)+ " Asignatura " + (j+1));
				}
			}
	}
}
	public static void main(String[] args) {
		double notas[][] = { { 5.6, 9.4, 6.8, 7 }, { 6.9, 5.2, 5.7, 6.3 }, { 9.8, 8, 7.6, 8.5 } };
		NotaAlumno(notas);
		NotaAsignatura(notas);
		NotaCurso(notas);
		buscar(notas);
	}
}

	