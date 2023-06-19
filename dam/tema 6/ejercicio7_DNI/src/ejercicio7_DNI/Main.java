package ejercicio7_DNI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DNI a=new DNI();
		System.out.println("inserte el numero del DNI");
		int numero=sc.nextInt();
		
		System.out.println(numero+"-"+a.leer(numero));

	}

}
