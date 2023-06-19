package ejer_fun18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca el precio del producto sin descuento");
		double precioSinDescuento=sc.nextDouble();
		System.out.println("introduzca el precio del producto con descuento");
		double precioConDescuento=sc.nextDouble();
		
		System.out.println("El descuento del producto es: "+calculadoraDescuento(precioSinDescuento, precioConDescuento));
		

	}
	public static double calculadoraDescuento(double precioSinDescuento, double precioConDescuento) {
		double descuento=0;
		descuento=((precioSinDescuento-precioConDescuento)*100)/precioSinDescuento;
		return descuento;
	}
}
