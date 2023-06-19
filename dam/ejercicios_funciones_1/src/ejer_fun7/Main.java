package ejer_fun7;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for (int i=0; i<5;i++) {
			System.out.println("introduzca el precio de " + (i+1));
			double precio=sc.nextDouble();
			System.out.println(precio_iva(precio));
			
			
		}
	
	}
	public static double precio_iva(double precio) {
		double precio_final=(precio*0.21)+precio;
		
		return precio_final;
	}
}

