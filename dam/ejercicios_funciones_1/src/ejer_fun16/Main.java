package ejer_fun16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca la altura del triangulo");
		int altura=sc.nextInt();
		
		generador_triangulo(altura);
		
		
	}
	public static void generador_triangulo(int altura) {
		int cont=0;
	
		for(int i=0;i<altura;i++) {
			cont++;
			for (int j=0;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		
	}
}
