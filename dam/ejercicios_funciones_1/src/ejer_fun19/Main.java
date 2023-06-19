package ejer_fun19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca un número entre el 0 y el 100000");
		int n=sc.nextInt();
		
		System.out.println(" el numero contiene "+digitos(n)+" digitos");
		

	}
	public static int digitos(int n) {
		int digitos=0;
		
		if (n>=0 && n<=9) {
			digitos=1;
		}
		if (n>=10 && n<=99) {
			digitos=2;
		}
		if (n>=100 && n<=999) {
			digitos=3;
		}
		if (n>=1000 && n<=9999) {
			digitos=4;
		}
		if (n>=10000 && n<=99999) {
			digitos=5;
		}
		if (n>=100000 && n<=999999) {
			digitos=6;
		}
		
		return digitos;
	
	}
}

