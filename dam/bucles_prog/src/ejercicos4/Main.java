package ejercicos4;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			double n1;
			boolean neg = false;
			int cont = 1; 
			
			while (cont <= 10) {
				System.out.println("introduzca el numero");
				n1 = teclado.nextDouble();
				
				if (n1 < 0) {
				    neg = true;
				}
				cont++;
				
			}
			if (neg == true ) {
				System.out.println("se han detectado numero negativos");
			}else {
				System.out.println("no se han detectado numeros negativos ");
				
				
			}
			
			
	}

}
