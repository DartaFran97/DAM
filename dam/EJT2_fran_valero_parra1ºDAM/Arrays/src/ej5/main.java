package ej5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=0;
	int m=0;
	
	System.out.println("introduzca el valor del tamaño del arraid");
	n=sc.nextInt();
	System.out.println("introduzca el valor para las posiciones del aarid");
	m=sc.nextInt();
	
	int[] arraid=new int[n];
	int tamaño=arraid.length;
	
	for(int i=0;i<arraid.length;i++) {
		arraid[i]=m;
		System.out.print(arraid[i]);
	}
		
	
	
	
	
	}

}
