package ejer_fun1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca un número");
		int n=sc.nextInt();
		int resultado_calculado= doble_numero(n);
		
		System.out.println(resultado_calculado);
	}
public static int doble_numero(int n){
	
	int resultado= n*2;
	
	return resultado;
	
	
}
}