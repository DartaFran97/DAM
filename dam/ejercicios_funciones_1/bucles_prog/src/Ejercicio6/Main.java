package Ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int a;
		int b;
		int res = 1;
		int cont = 0;
		
		System.out.println("introduce el valor de A");
		a = sc.nextInt();
		System.out.println("introduce el valor de B");
		b = sc.nextInt();
		
		if (b == 0) {
		System.out.println("el resultado es 1");
		}else {
			
			do {
				res = a * res;
				cont++;
				
			}while (cont < b);
			System.out.println("el resultado es : " + res);
			
		}
	}

}
