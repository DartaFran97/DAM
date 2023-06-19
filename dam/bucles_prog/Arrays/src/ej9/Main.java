package ej9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] array=new int[10];
		int tarray=array.length;
		int cpos=0;
		int cneg=0;
		int czero=0;
		int n=0;
		
		for(int i=0;i<array.length;i++) {
			System.out.println("introduzca un numero entero:");
			array[i]=sc.nextInt();
			n=array[i];
			if(n>0) {
				cpos++;
			}
			if(n<0) {
				cneg++;
			}
			if(n==0) {
				czero++;
			}
		}
		System.out.println("numeros positivos: "+cpos+" numeros negativos: "+cneg+" zeros: "+czero);
		
	
	
	
	
	}

}
