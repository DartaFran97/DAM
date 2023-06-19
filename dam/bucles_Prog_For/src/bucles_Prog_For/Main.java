package bucles_Prog_For;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduzca el que desesa alcanzar");
		int a = teclado.nextInt();;
		
		for (int cont = 5  ;cont <= a  ; cont++ ) {
			System.out.println(cont);
			}
		if (a < 5) {
			System.out.println("ERROR");
	}
		

	}
}


