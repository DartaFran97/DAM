package ejer_fun8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca el primer numero");	
		int n1=sc.nextInt();
		System.out.println("introduzca el primer numero");	
		int n2=sc.nextInt();
		
		System.out.println("elije la operación a realizar");
		System.out.println("1. suma");
		System.out.println("2. resta");
		System.out.println("3. multiplkcación");
		System.out.println("4. división");
		int menu=sc.nextInt();
		
		switch(menu){
			case 1:
				System.out.println("el resultado es: "+suma(n1,n2));
				break;
			case 2:
				System.out.println("el resultado es: "+resta(n1,n2));
				break;
			case 3:
				System.out.println("el resultado es: "+multiplicación(n1,n2));
				break;
			case 4:
				System.out.println("el resultado es: "+división(n1,n2));
				break;
				default:
					System.out.println("error opción invalida");
					
		}
		
		
		
	}
	
public static int suma(int n1, int n2) {
	
	int resultado= n1+n2;
	return resultado;
	
}
public static int resta(int n1, int n2) {
	
	int resultado= n1-n2;
	return resultado;
}
public static int multiplicación(int n1, int n2) {
	
	int resultado= n1/n2;
	return resultado;
}
public static int división(int n1, int n2) {
	
	int resultado= n1/n2;
	return resultado;
}
}

