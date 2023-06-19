package ejer_fun6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca las millas a convertir");
		double millas=sc.nextDouble();
		System.out.println(millas+" son un total de: "+km_millas(millas)+" km");
		
		

	}
public static double km_millas(double millas) {
	double km= millas*1.60934;
	return km;
}
}
