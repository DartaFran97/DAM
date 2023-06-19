package ejercicio5_Cafetera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	
		System.out.println("introduzca la capacidad maxima de la cafetera");
		int maxima=sc.nextInt();
		System.out.println("introduzca la capacidad actual de la cafetera");
		int actual=sc.nextInt();
		Cafetera a=new Cafetera(maxima,actual);
		
		a.llenarTaza(actual);
		System.out.println(a.getActual());
		
		a.vaciarCafetera(actual);
		System.out.println(a.getActual());
		
		a.llenarCafetera(maxima, actual);
		System.out.println(a.getActual());
		
		System.out.println("que cantidad de cafe desea agregar?");
		int cantidad=sc.nextInt();
		a.agregarCafe(actual,cantidad);
		System.out.println(a.getActual());
		
		
	}
	
	
}