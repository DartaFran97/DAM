package ejer_fun11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("introduzca un numero");
		int n=sc.nextInt();
		
		if (primo(n)==true) {
			System.out.println(n+" es un numero primo");
		}else {
			System.out.println(n+" no es un numero primo");
		}
		

	}
public static boolean primo(int n) {
	int contador =0;
	int resultado=0;
	for(int i =0;i<=n;i++) {
		resultado=n%(i+1);
		if (resultado ==0) {
			contador++;
		}
	}
	boolean n_primo;
	if (contador>2) {
		n_primo=false;
	}else {
		n_primo=true;
	}
	return n_primo;
}
}
