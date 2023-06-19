package ej11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca el tamaño del array");
		int n=sc.nextInt();
	
		int[] array=new int[n];
		int[] ares=new int[array.length];
		int cont=array.length-1;
		
		for(int i=0;i<array.length;i++) {
			System.out.println("introdizca el numero del array");
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			ares[cont]=array[i];
			cont--;
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		
		for(int i=0;i<ares.length;i++) {
			System.out.print(ares[i]+ " ");
			
	    }
		
	}

}
