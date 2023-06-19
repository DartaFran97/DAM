package ej6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int p=0;
		int q=0;
		
		System.out.println("introduzca el valor inferior");
		p=sc.nextInt();
		System.out.println("introduzca el valor superior");
		q=sc.nextInt();
		
		int[] arraid=new int[(q + 1)-p];
		int tamaño=arraid.length;
		
		for(int i=0;i<arraid.length;i++) {
			arraid[i]=p++;
			
			System.out.print(arraid[i]);
		}
			
		
		
		
		
		}

	}



