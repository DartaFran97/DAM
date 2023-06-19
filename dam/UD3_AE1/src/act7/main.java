package act7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1=0;
		int n2=0;
		int par=0;
		int inpar=0;
		System.out.println("dime un numero");
		n1=sc.nextInt();
		System.out.println("dime un numero mayor al anterior");
		n2=sc.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			System.out.print(" " + i);
			if (i%2==0) {
				par++;
			}else {
				inpar++;
			}
		}
		System.out.println(" ");
		System.out.println("numero pares: " + par);
		System.out.println("numero impares: " + inpar);
	}

}
