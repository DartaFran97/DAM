package ejer_fun12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int posiciones_numeros=0;
		int numero_impar=1;
		
		System.out.println("introduzca cunatas posiciones de numeros impares desea mostrar");
		posiciones_numeros=sc.nextInt();
		System.out.println("el total de la suma de los "+ posiciones_numeros+" primeros numeros impares es: "+generador(numero_impar,posiciones_numeros));
			
		

	}
	public static int generador(int numero_impar, int posiciones_numeros) {
		int suma_impares=0;
		
		for (int i=0;i<posiciones_numeros;i++) {
		suma_impares+=numero_impar;
			numero_impar+=2;
		}		
		return suma_impares;
				
	}
}
