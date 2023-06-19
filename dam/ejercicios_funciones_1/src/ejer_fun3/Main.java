package ejer_fun3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("introduzca su nombre");
		String nombre=sc.nextLine();
		
		System.out.println(saludo(nombre));
		

	}
public static String saludo(String nombre) {
	
	String saludar=("hola " + nombre);
	
	return saludar;
}
}
