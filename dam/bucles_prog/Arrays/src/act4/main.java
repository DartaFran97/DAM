package act4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double[] decimales = new double[10];
	int tamaño= decimales.length;
	double n=0;
	
	for(int i=0;i<10;i++) {
		decimales[i]=Math.random();
		
	
	}
	for(int i=0; i<decimales.length; i++) {
		System.out.println("numero: " + decimales [i]+" posición " + i);
	n=n+decimales[i];
	
	}
	System.out.println(n);
	}

}
