package ej4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	double[] n=new double[10];
	int v=n.length;
	
	double max=0;
	double min=0;
	int posmayor=0;
	int posmenor=0;
	
	for(int i=0;i<n.length;i++) {
		System.out.println("introduzca el numero del la posición " + i);
		n[i]=sc.nextDouble();
		
		
	}
	for(int i=0;i<n.length;i++) {
		if (i==0) {
			max=n[i];
			min=n[i];
		}else {
			if(n[i]>max) {
				max=n[i];
				posmayor=i;
			}
			if(n[i]<min) {
				min=n[i];
				posmenor=i;
			}
		}
		
		
	}
	System.out.println("el numero máximo introducido es " + max + " en la posición 1" + posmayor +  " y el minimo es " + min + " en la posición " + posmenor );
	}

}
