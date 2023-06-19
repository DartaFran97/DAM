package ejer_fun22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("introduzca un numero paara conocer su tabla de multiplicar");
		int n=sc.nextInt();
		tablas(n);
		
	}
	public static void tablas(int n) {
		int[] resultado=new int[10];
		 for (int i=0;i<10;i++) {
			 resultado[i]=n*(i+1);
			 System.out.println(n+" x "+(i+1)+" = " + resultado[i]);
		 }
		 
		 
	}
}
