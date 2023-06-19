package ejerciciosT3_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n;
		boolean teen = false;
		
		
		do {
		 System.out.println("introduzca las notas (0 a 10)");
		 n = teclado.nextInt();
		 
		  if (n == 10) {
		  teen = true;
		  }
		
		}while(n != -1);
		
		if (teen == true) {
			System.out.println("se han detecteado notas con valor 10");
				
			}else {
				System.out.println("No se han detecteado notas con valor 10");
			}
		

	
	}

}
