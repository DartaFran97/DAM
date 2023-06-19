package ejer_fun5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca su edad");
		int edad=sc.nextInt();
		if(es_mayor_edad(edad)==true) {
			System.out.println("es mayor de edad");
		}else {
			System.out.println("no es mayor de edad");
		}
	}
	public static boolean es_mayor_edad (int edad) {
		
		if (edad>=18) {
			return true;
		}else {
			return false;
		}
}
}
