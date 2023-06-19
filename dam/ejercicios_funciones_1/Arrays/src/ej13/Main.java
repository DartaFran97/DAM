package ej13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int[] arrayprimero=new int[100];
		int[] arraycopiado=new int[arrayprimero.length];
		int cont=arrayprimero.length-1;
		
		for(int i=0;i<arrayprimero.length;i++) {
			arrayprimero[i]=(i+1);
		}
		for(int i=0;i<arrayprimero.length;i++) {
			arraycopiado[cont]=arrayprimero[i];
			cont--;
			
		}
		for(int i=0;i<arrayprimero.length;i++) {
			System.out.print(arrayprimero[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arraycopiado.length;i++) {
			System.out.print(arraycopiado[i]+ " ");
			
	    }
		
	}

	}


