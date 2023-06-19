package ej8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int[] pares=new int[20];
		int tpares=pares.length;
		int n=0;
		
		for(int i=0; i<pares.length;i++) {
			n=n+2;
			pares[i]=n;
			System.out.print(pares[i]+" ");
		}
		

	}

}
