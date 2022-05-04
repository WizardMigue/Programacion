package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		char [] n = new char[10];
		n[0] = 'a';
		n[1] = 'x';
		n[4] = '@';
		n[6] = ' ';
		n[7] = '+';
		n[8] = 'Q';
		
		for(int i = 0; i < 10; i++) {
			System.out.println(n[i]);
		}
	}

}
