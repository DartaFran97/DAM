package ej15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int valorinicial=0;
		int incremento=0;
		int numerovalores=0;
		
		System.out.println("introduzca el numero de valores que desea calcular");
		numerovalores=sc.nextInt();	
		System.out.println("introduzca el valor inicial");
		valorinicial=sc.nextInt();
		System.out.println("introduzca el incremento a aplicar");
		incremento=sc.nextInt();
		
		int[] array=new int[numerovalores];
		
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				array[i]=valorinicial;
			}else{
			array[i]=array[i-1]+incremento;
			}
			System.out.print(array[i]+" ");
		}
	}

}
