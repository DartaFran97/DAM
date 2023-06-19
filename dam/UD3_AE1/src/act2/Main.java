package act2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("introduzca el numero que desea conocer si es primo o no");
		int n = sc.nextInt();
		int cont=0;
		int i;
		
		for (i=1; i<=n; i++) {
			if((n%i)==0) {
				cont++;
			
			}
		}
		if (cont<=2) {
			System.out.println("es primo");
		}else {
			System.out.println("no es primo");
		}
		
	}

}
