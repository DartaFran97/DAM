package ej6;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		char[][] tablero= new char[3][3];
		int[] contadorocupado=new int[9];
		
		System.out.println("Bienvenido al 3 en raya seleccione un modo de juego:");
		System.out.println("1. 2 jugadores");
		System.out.println("2.vs la maquina");
		int modojuego=sc.nextInt();
		int cont=0;
		String borrarpantalla= "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"; 
		switch (modojuego) {
		case 1:
		System.out.println("ha escogido usted el modo de juego de dos jugadores");
		for(int i=0;i<tablero.length;i++ ) {
			System.out.println();
			for(int j=0;j<tablero[i].length;j++) {
				System.out.print(tablero[i][j]);;
			}
		}
		System.out.println();
		System.out.println("comienza el juego");
		System.out.println("Jugador A escoja su icono: X,O,$,%,&");
		char A=sc.next().charAt(0);
		System.out.println("Jugador B escoja su icono: X,O,$,%,&");
		char B=sc.next().charAt(0);
		for(int a=0;a<5;a++) {
			System.out.println();
			System.out.println("Jugador A es su turno");
			System.out.println("Jugador A: seccione la columna donde colocar su ficha");
			int columna=sc.nextInt();
			System.out.println("Jugador A: seccione la columna donde colocar su ficha");
			int fila=sc.nextInt();
			tablero[(fila-1)][(columna-1)]=A;
			System.out.print(borrarpantalla);
			for(int i=0;i<tablero.length;i++ ) {
				System.out.println();
				for(int j=0;j<tablero[i].length;j++) {
					System.out.print(tablero[i][j]);
				}
				
			}
			
			System.out.println();
			System.out.println("Jugador B es su turno");
			System.out.println("Jugador B: seccione la columna donde colocar su ficha");
			int columna2=sc.nextInt();
			System.out.println("Jugador B: seccione la columna donde colocar su ficha");
			int fila2=sc.nextInt();
			tablero[(fila2-1)][(columna2-1)]=B;
			System.out.print(borrarpantalla);
			for(int i=0;i<tablero.length;i++ ) {
				System.out.println();
				for(int j=0;j<tablero[i].length;j++) {
					System.out.print(tablero[i][j]);
				}
				
			}
			
		}
		
		break;
		case 2:
			char jugador2='O';
			System.out.println("Jugador  escoja su icono: X ó O");
			char jugador1=sc.next().charAt(0);
			if (jugador1=='X') {
				 jugador2='O';
			}
			if (jugador1=='O') {
				 jugador2='X';
			}
			Random r=new Random();
			boolean ocupada=false;
			for(int a=0;a<5;a++) {
				System.out.println();
				System.out.println("Jugador A es su turno");
				System.out.println("Jugador A: seccione la columna donde colocar su ficha");
				int columna=sc.nextInt();
				System.out.println("Jugador A: seccione la columna donde colocar su ficha");
				int fila=sc.nextInt();
				
				if (tablero[fila][columna]==jugador2 ||tablero[fila][columna]==jugador1 ) {
					ocupada=true;
				}
				if (ocupada= false) {
				tablero[(fila-1)][(columna-1)]=jugador1;
				System.out.print(borrarpantalla);
				for(int i=0;i<tablero.length;i++ ) {
					System.out.println();
					for(int j=0;j<tablero[i].length;j++) {
						System.out.print(tablero[i][j]);
					}
					
				}
				if (tablero[])
				}
				
				System.out.println();
				System.out.println("Jugador B es su turno");
				System.out.println("Jugador B: seccione la columna donde colocar su ficha");
				int columna2=r.nextInt(3);
				System.out.println("Jugador B: seccione la columna donde colocar su ficha");
				int fila2=r.nextInt(3);
				tablero[(fila2-1)][(columna2-1)]='O';
				System.out.print(borrarpantalla);
				for(int i=0;i<tablero.length;i++ ) {
					System.out.println();
					for(int j=0;j<tablero[i].length;j++) {
						System.out.print(tablero[i][j]);
					}
					
				}
				
			}
			//detectores de columna fila y diagonal 
			break;
	}
}
}