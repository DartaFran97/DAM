package bucles_Prog_For4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		do {
			System.out.println("introduzca el numero deseado");
			num = sc.nextInt();
		}while (num < 0);
		
		if (num >= 1000000 && num < 10000000) {
			System.out.println("el numero tiene 7 digitos");
		}
		if (num >=100000 && num < 1000000) {
			System.out.println("el numero tiene 6 digitos");
		}
		if (num >= 10000 && num < 100000) {
			System.out.println("el numero tiene 5 digitos");
		}
		if (num >= 1000 && num < 10000) {
			System.out.println("el numero tiene 4 digitos");
		}
		if (num >= 100 && num < 1000) {
			System.out.println("el numero tiene 3 digitos");
		}
		if (num >= 10 && num < 100) {
			System.out.println("el numero tiene 2 digitos");
		}
		if (num >= 0 && num < 10) {
			System.out.println("el numero tiene 1 digitos");
		}
		
	}

}
