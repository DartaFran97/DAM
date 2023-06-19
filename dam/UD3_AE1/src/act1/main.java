package act1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿cuantos multiplos de 3 desea caluclar? (introduzca un numero)");
		int mult = sc.nextInt();
		int n = 0;
		
		for (int i = 0; i < mult; i++) {
			 n += 3;
			 System.out.println(n);
		}
		
		
		

	}

}
