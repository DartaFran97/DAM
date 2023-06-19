package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double precio = 0;
		double descuento1 = 0.12;
		double descuento2 = 0.18;
		double descuento3 = 0.25;
		double preciof = 0;
		String dia ;
		
		System.out.println("introduzca el precio del vehiculo:");
		precio = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("introduzca el día que desea realizar la compra:");
		dia = teclado.nextLine();
		
		switch (dia) {
		
		case "lunes":
			
		System.out.println("no hay descuentos disponibles para este día");
		System.out.println(precio);
		break;
		
		case "martes":
			preciof = (precio - (precio * descuento1));
			System.out.println("el descuento de hoy es del 12%");
			System.out.println("el valor final es de: " + preciof);
			break;
		
		case "miercoles":
			
			System.out.println("no hay descuentos disponibles para este día");
			System.out.println(precio);
			break;
		
		case "jueves":
			preciof = (precio - (precio * descuento2));
			System.out.println("no hay descuentos disponibles para este día");
			System.out.println("el valor final es de: " + preciof);
			break;
		case "viernes":
			
			System.out.println("no hay descuentos disponibles para este día");
			System.out.println(precio);
			break;
		case "sabado":
			preciof = (precio - (precio * descuento3));
			System.out.println("no hay descuentos disponibles para este día");
			System.out.println("el valor final es de: " + preciof);
			break;	
        
		case "domingo":
			
			System.out.println("no hay descuentos disponibles para este día");
			System.out.println(precio);
			break;	
			
			default:
		}

	}

}
