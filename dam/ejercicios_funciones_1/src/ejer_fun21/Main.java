package ejer_fun21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("introduzca unu numero de máximo 6 digitos");
			int n=sc.nextInt();
			int[] variables=numero_digito(n);
			imprimir(variables);
			
			System.out.println(suma(variables));
			
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
		public static int[] numero_digito(int n) {
			int auxiliar=n;
			int divisor=1;
			int resto=0;
			int[] cifras=new int[digitos(n)];
			for (int i=1; i<cifras.length;i++) {
			divisor=divisor*10;
			}
			for(int i=0;i<cifras.length;i++) {
				resto=auxiliar%divisor;
				cifras[i]=auxiliar/divisor;
				auxiliar=resto;
				divisor=divisor/10;
				
			}
			 return cifras;
		}
		public static void imprimir(int[]variables) {
			
			for(int i=0; i<variables.length;i++) {
				if (variables[i]%2==0) {
					System.out.print(variables[i]);
					
				}
			}
			System.out.println();
			
		}
		public static int suma(int[]variables) {
			int suma_pares=0;
			for(int i=0;i<variables.length;i++) {
				if (variables[i]%2==0) {
				suma_pares+=variables[i];
				}
			}
			return suma_pares;
		}
	}

