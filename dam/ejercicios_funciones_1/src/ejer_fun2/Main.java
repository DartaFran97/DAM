package ejer_fun2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca un número");
		int n=sc.nextInt();
		System.out.println("introduzca otro número");
		int n2=sc.nextInt();
	
		System.out.println(producto(n,n2));
		
	}
public static int producto(int n, int n2) {
	
	int resultado= n*n2;
	
	return resultado;
}
}
