package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("introduzca la duración de su llamada (min)");
		double duracion = teclado.nextDouble();
		teclado.nextLine();

		System.out.println("introduzca el día de la semana en que se realizo la llamada:");
		String dia = teclado.nextLine();

		System.out.println("¿la llamada a que hora se realizo? (24h)");
		double hora = teclado.nextDouble();
		
		double preciollamada = 0;
		double preciofinal = 0;

		if (duracion <= 0) {
			System.out.println("intoduzca un valor correcto");
		 
		} else {
		      if (duracion < 5) {
			preciollamada = 1;

		        } else {
			        if (duracion >= 5 && duracion < 8) {
				        preciollamada = 1 + 0.8;
			         } else {
				         if (duracion >= 8 && duracion < 10) {
				        	preciollamada = 1 + 0.8 + 0.7;
				           } else {
					           if (duracion >= 10) {
						preciollamada = 1 + 0.8 + 0.7 + 0.5;

					           }
						}
					}
				}
			}
		
		if (dia.equals("domingo")) {
			 preciofinal = preciollamada + (preciollamada * 0.03);
			System.out.println("el precio de la llamada es de:" + preciofinal + "€");

		 } else {
			if (hora >= 12) {
				 preciofinal = preciollamada + (preciollamada * 0.1);
				System.out.println("el precio de la llamada es de:" + preciofinal + "€");

			} else {
				preciofinal = preciollamada + (preciollamada * 0.15);
				System.out.println("el precio de la llamada es de:" + preciofinal + "€");
			}
		}
	}
	}

