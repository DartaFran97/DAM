package ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] arrayoriginal=new int[5];
		int[] arraymodificado=new int[arrayoriginal.length];
		int numero=0;
		int numeromodificado=0;
		
		for(int i=0;i<arrayoriginal.length;i++) {
			System.out.println("introduzca el valor del aposición "+i);
			numero=sc.nextInt();
			arrayoriginal[i]=numero;		
		
			if(numero>=0&&numero<=9) {
				if(numero==0) {
					numeromodificado=9;
				}
				if(numero==1) {
					numeromodificado=5;
				}
				if(numero==2) {
					numeromodificado=4;
				}
				if(numero==3) {
					numeromodificado=2;
				}
				if(numero==4) {
					numeromodificado=7;
				}
				if(numero==5) {
					numeromodificado=6;
				}
				if(numero==6) {
					numeromodificado=1;
				}
				if(numero==7) {
					numeromodificado=3;
				}
				if(numero==8) {
					numeromodificado=0;
				}
				if(numero==9) {
					numeromodificado=8;
				}
				arraymodificado[i]=numeromodificado;
			}else {
			
			arraymodificado[i]=numero;
		
		}
		}
		System.out.println("el array original: ");
		for(int i=0;i<arrayoriginal.length;i++) {
			System.out.print(arrayoriginal[i]+" ");
		}

		System.out.println();
		System.out.println("el array modificado");
		for(int i=0;i<arraymodificado.length;i++) {
			System.out.print(arraymodificado[i]+" ");
		}
		
	}

}
