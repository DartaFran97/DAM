package act5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[101];
		int tamaño= n.length;
		int m=0;
		int s=0;
		
		for(int i=1;i<101;i++) {
			n[i]= i;
			
		
		}
		for(int i=0; i<n.length; i++) {
			s=s+n[i];
		}
		System.out.println("la suma de los primero 100 numero naturales " + s);
		m=s/100;
		System.out.println("la media de la suma de los primero 100 numero naturales " + m);
		
		}

	}


	


