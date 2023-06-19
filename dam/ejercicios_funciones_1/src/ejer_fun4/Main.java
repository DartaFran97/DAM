package ejer_fun4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca un número");
		int n=sc.nextInt();
		System.out.println("introduzca otro número");
		int n2=sc.nextInt();
		
		if(numero_mayor(n,n2)==true) {
			System.out.println(n+" es el numero mayor");
		}else {
			System.out.println(n2+" es el numero mayor");
		}
		

	}
public static boolean numero_mayor (int n, int n2) {
	
	if (n>n2) {
		return true;
	}else {
		return false;
	}
}

}
