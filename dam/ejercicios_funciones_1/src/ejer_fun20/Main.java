package ejer_fun20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca unu numero de máximo 6 digitos");
		int n=sc.nextInt();
		int[] variable=reversible(n);
		for(int i=0; i<digitos(n);i++) {
				 System.out.println(variable[i]);
		
		}
	}
	public static int digitos(int n) {
		
		int digitos=0;
		if (n>=0 && n<=9) {
			digitos=1;
		}
		if (n>=10 && n<=99) {
			digitos=2;
		}
		if (n>=100 && n<=999) {
			digitos=3;
		}
		if (n>=1000 && n<=9999) {
			digitos=4;
		}
		if (n>=10000 && n<=99999) {
			digitos=5;
		}
		if (n>=100000 && n<=999999) {
			digitos=6;
		}
		
		return digitos;
	
	}


	public static int[] reversible(int n) {
		
		int auxiliar=n;
		int[] numeroReves=new int[digitos(n)];
		
		for (int i=0;i<numeroReves.length;i++) {
			
			if(auxiliar>10) {
				numeroReves[i]=auxiliar%10;
				auxiliar=auxiliar/10;
			} else{
				
				numeroReves[i]=auxiliar;
			
			}
			
		}
			
		return numeroReves;
		
		
		
	}

}
