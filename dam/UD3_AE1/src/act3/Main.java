package act3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= 1;
		int ultimonumero = 0;
		int fail = 0;
		int ok = 0;
		int total=0;
		
		while (n != 0) {
			System.out.println("intoduzce un numero");
			n=sc.nextInt();
			
		
			if ( n >= ultimonumero) {
				ok++;	
			}else {
				System.out.println("error es  menor");
				fail++;
				if (n==0) {
					fail--;
				}
			}
			ultimonumero = n;
			total= fail+ok;
		}
		
		System.out.println("errores " + fail);
		System.out.println("aciertos " + ok);
		System.out.println("total de numeros " + total);
		
		
		
	}

}
