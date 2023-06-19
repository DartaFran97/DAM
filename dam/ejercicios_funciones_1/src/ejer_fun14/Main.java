package ejer_fun14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca un numero para realizar las siguientes operaciones del enunciado");
		int numero=sc.nextInt();
		System.out.println("suma: " + suma(numero)+" producto: " + producto(numero)+" y el numero medio: "+ medio(numero));

	}
	public static int suma(int numero) {
		int suma=1;
		int suma_final=0;
		for (int i=1;i<numero;i++) {
			suma_final=suma+(suma+1);
			suma++;
		}
		return suma_final;
	}
	public static int producto(int numero) {
		int producto=1;
		int producto_final=1;
		for (int i=1;i<numero;i++) {
			producto_final=producto*(producto+1);
			producto++;
		}
		return producto_final;
	}
	public static double medio(int numero) {
		
		double diferencia=(numero)/2;
		return diferencia;
	}
	
}
