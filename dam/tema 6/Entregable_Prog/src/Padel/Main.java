package Padel;

import java.util.Scanner;

public class Main {
/* el programa crea objetios pala de padel para diversos jgadores de una marca
 * estos jugadores tienen una determinada pala y el proposito de la marca es saber
 * que jugadores utilizan esta pala con el fin de poder identificar que modelos utiliza cada jugador.
 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("introduzca el modelo de su pala");
		String modelo=sc.nextLine();
		System.out.println("introduzca el marca de su pala");
		String marca=sc.nextLine();
		System.out.println("introduzca la forma de su pala");
		String forma=sc.nextLine();
		System.out.println("Su pala es de carbono? (true or false)");
		boolean carbono=sc.nextBoolean();
		System.out.println("introduzca el peso de su pala en gramos(solo enteros");
		int peso=sc.nextInt();
		Jugador player=new Jugador();
		Jugador[] patrocinados=new Jugador[3];
		String nombre=" ";
		String lado=" ";
		boolean rematador=false;
		
		for (int i=0;i<patrocinados.length;i++) {
			System.out.println("introduzca el nombre del jugador");
			nombre=sc.nextLine();
			System.out.println("introduzca el nombre del jugador");
			lado=sc.nextLine();
			System.out.println("introduzca el nombre del jugador");
			rematador=sc.nextBoolean();
			player=new Jugador(nombre,lado,rematador);
			patrocinados[i]=player;
		}
		
		
		Pala a= new Pala(modelo,marca,forma,carbono,peso,patrocinados);
		a.totalJugadoreDerecha(patrocinados,"derecha",player);
		a.totalrematador(patrocinados, rematador, player);
	}
	
		
		
		
		
	
}
