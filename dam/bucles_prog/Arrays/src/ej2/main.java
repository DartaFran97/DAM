package ej2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int[] n = new int[10];
	int tamaño = n.length;
	int contimp =0;
	int contpar =0;
	int sumimp =0;
	int sumpar =0;
	
	
	for(int i=0; i<10; i++) {
		System.out.println("introduzca el numero " + i);
		n[i]=sc.nextInt();
	}
	for (int i=0; i<n.length; i++) {
		if(n[i]%2==0) {
			sumpar=sumpar+n[i];
			contpar++;
		}else {
			sumimp=sumimp+n[i];
			contimp++;
		}
	}
	int mpar = sumpar/contpar;
	int mimp = sumimp/contimp;
	
	System.out.println("la media de los numeros pares es " + mpar);
	System.out.println("la media de los numeros impares es " + mimp);
	
		
	
	}

}
