package ejercicios3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduzca el numero");
		int num = teclado.nextInt();
		int cont = 1;

		while (cont <= num) {
			System.out.println(cont);
			cont++;
			
		}
	}

}
