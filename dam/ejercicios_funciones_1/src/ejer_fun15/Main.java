package ejer_fun15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca la base dela figura del rectangulo");
		int base=sc.nextInt();
		System.out.println("introduzcal la altura del rectangulo");
		int altura=sc.nextInt();
		generador_rectangulo(base,altura);
		
		
	}
	public static char[][] generador_rectangulo(int base, int altura) {
		char[][] rectangulo=new char[altura][base];
		
		for(int i=0;i<rectangulo.length;i++) {
			
			for(int j=0;j<rectangulo[i].length; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		return rectangulo;
	}

}
