package ejerciciosT3_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("introduzca el primer valor");
		int a = teclado.nextInt();
	
		System.out.println("introduce el segundo valor ");
		int b = teclado.nextInt();
		
		int res = a ;
		int cont = 0; 	
		
		do {
		res = a * res;
		
		}while(cont == b);
		System.out.println(res);
	}
	
}
