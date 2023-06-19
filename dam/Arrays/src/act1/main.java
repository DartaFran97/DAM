package act1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] numeros= new int[10];
		int tamaño=numeros.length;
		
		
		for(int i=0; i<10; i++) {
			System.out.println("introduzca un numero " + i);
			numeros[i]=sc.nextInt();
		}
		for(int i=0; i<numeros.length;i++) {
			System.out.println("numero [" + numeros[i] +"]" + " posición " + i + " ");
		}

	}

}
