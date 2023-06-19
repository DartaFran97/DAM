package ejercicos6;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			int n1;
			int sum = 0;
			int mult = 1;
			int cont = 1; 
			
			do {
				System.out.println("introduzca el numero");
				 n1 = teclado.nextInt();
				 sum = (n1 + sum);
				 mult = (mult * n1);
				 
				 cont++;
				 
			}while (cont <= 10);
			
			
			
			
			if (cont >= 10) {
				System.out.println("la suma es " + sum + " y el producto es " + mult );
			}
	

	}

}
