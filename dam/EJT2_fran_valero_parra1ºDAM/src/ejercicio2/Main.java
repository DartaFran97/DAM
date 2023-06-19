package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("introduzca el numero de alumnos que van a realizar el viaje: ");
		int numalu = teclado.nextInt();
		int precioagencia = 0;
		int precioalum = 0;
		
		if (numalu >= 100) {
			 precioagencia = numalu * 65;
			System.out.println ("el precipo por alumno es de 65€ y la agencia recibira " + precioagencia + "€");
		} else {
			if (numalu >= 50 && numalu <= 99) {
				 precioagencia = numalu * 70;
				System.out.println ("el precipo por alumno es de 70€ y la agencia recibira " + precioagencia + "€");
			} else {
				if (numalu >= 30 && numalu <= 49) {
					precioagencia = numalu * 95;
					System.out.println ("el precipo por alumno es de 95€ y la agencia recibira " + precioagencia + "€");
				} else {
					
				if (numalu < 30) {
					 precioagencia = 4000;
					 precioalum = precioagencia / numalu; 
					System.out.println ("el precipo por alumno es de " + precioalum + " y la agencia recibira " + precioagencia + "€");
				}
					
				}
				
			}
			
		}

	}

}
