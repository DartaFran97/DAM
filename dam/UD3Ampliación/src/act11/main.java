package act11;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero de 5 cifras.");
		int n=sc.nextInt();
		while(!(n>=00000 && n<=99999)) {
			System.out.println("ERROR debe de introducir 5 digitos");
			n=sc.nextInt();
		}
		int divisor1=10;
		int divisor2=100;
		int divisor3=1000;
		int divisor4=10000;
		int divisor5=100000;
		
		int n1= -1;
		int n2= -1;
		int n3= -1;
		int n4= -1;
		int n5= -1;
		boolean resultado1 = false;
		
		
		n1=(n%divisor1);
		n2=(n%divisor2)/10;
		n3=(n%divisor3)/100;
		n4=(n%divisor4)/1000;
		n5=(n/divisor5);	
		
		if (n1==n5 && n2==n4) {
			System.out.println("Su número es palíndromo");
			
		}else {
			System.out.println("Su número NO es un Palíndromo");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
