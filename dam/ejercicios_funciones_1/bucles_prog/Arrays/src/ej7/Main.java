package ej7;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random(11);
		
		int[] array=new int[100];
		int tamaño=array.length;
		
		for(int i=0;i<array.length;i++) {
			array[i]=r.nextInt(11);
			
		}
		System.out.println("que numero desea buscar dentro de la array");
		int n=sc.nextInt();
		
		for(int i=0;i<array.length;i++) {
			if(n==array[i]){
				System.out.print(i+" ");
			}
			
		}
	}

}
