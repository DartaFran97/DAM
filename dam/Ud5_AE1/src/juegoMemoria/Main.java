package juegoMemoria;

import java.util.Scanner;

public class Main {

			public static void main(String[] args) {

				// 0 -> Nivel Facil
				// 1 -> Nivel Dificil
				
				
				Scanner teclado = new Scanner(System.in);
				
				
				
				System.out.println("elija el nivel de dificultad");
				System.out.println("0. Facil");
				System.out.println("1. Dificil");
				int nivel=teclado.nextInt();
				int[][] tablero = iniciarTablero(nivel);
				int fila=0;
				int columna=0;
				int vida=10;
				int numeroInicial=tablero[fila][columna];
				int numeroSegundo=tablero[fila][columna];
				mostrarTableroInicial(tablero);		
				borrarPanel(tablero);
				
				// INICIO LÓGICA DEL PROGRAMA
				
					
				
				
				
				
				// FIN LÓGICA DEL PROGRAMA
			}
			
			public static void mostrarTableroInicial(int[][] tablero) {
			System.out.println("Bienvenido al juego de Memoria");
				for(int i = 0; i < tablero.length; i++) {
					for(int j = 0; j < tablero[0].length; j++) { 
						System.out.print(tablero[i][j] + "-");
					}
					System.out.println("");
				}
			}
			
			public static int[][] iniciarTablero(int nivel) {
						
				int[][] tableroDificil = new int[][] {
						{47, 50, 22, 45, 45, 87},
						{27, 34, 50, 20, 14, 65},
						{65, 93, 24, 20, 87, 37},
						{34, 86, 47, 57, 14, 91},
						{91, 24, 86, 81, 57, 26},
						{37, 27, 81, 26, 22, 93}
						};
				
				int[][] tableroFacil = new int[][] {
						{37, 22, 14, 71},
						{10, 10, 86, 71},
						{86, 37, 16, 99},
						{99, 22, 14, 16},
						};
						
				if(nivel == 0)
					return tableroFacil;
				else
					return tableroDificil;
				
			}
			
			public static void borrarPanel(int[][] tablero) {
				try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				for(int i = 0; i < 10; i++)
					System.out.println("");
				
				for(int i = 0; i < tablero.length; i++) {
					for(int j = 0; j < tablero[0].length; j++) { 
						System.out.print("XX" + "-");
					}
					System.out.println("");
				}
			}
			
			/*
			 * Esta función recibe dos parámetros. El tablero y el número que se quiere destapar.
			 * */
			public static void mostrarTablero(int[][] tablero, int numeroMostrar ,int fila, int columna, int nivel) {
				for (int i=0;i<tablero.length;i++) {
					for(int j=0;j<tablero[i].length;j++) {
						if (i==fila&&j==columna) {
						System.out.println(tablero[i][j]+"-");
						numeroMostrar=tablero[i][j];
						}else {
							System.out.print("XX" + "-");
						}
					
					}
					System.out.println("");
				}
		

			}
			public static int tirada(int fila, int columna,int[][]tablero, int numeroInicial, int numeroSegundo, Scanner teclado) {
				System.out.println("el primer numero");
				System.out.println("seleccione la fila");
				fila=teclado.nextInt();
				System.out.println("seleccione la columna");
				columna=teclado.nextInt();
				
				numeroInicial=tablero[fila][columna];
				return numeroInicial;
			}
			public static int tirada2(int fila, int columna,int[][]tablero, int numeroInicial, int numeroSegundo, Scanner teclado) {
				
				
				System.out.println("el segundo numero");
				System.out.println("seleccione la fila");
				fila=teclado.nextInt();
				System.out.println("seleccione la columna");
				columna=teclado.nextInt();
				
				numeroSegundo=tablero[fila][columna];
				return numeroSegundo;
			}
			public static boolean comprobarTirada(int numeroInicial, int numeroSegundo) {
				boolean comprobar =false;
				
				if (numeroInicial==numeroSegundo) {
					comprobar=true;
				}else {
					comprobar=false;
				}
				return comprobar;
			}
			public static int finDePartida(int vida, int numeroInicial, int numeroSegundo) {
				
				if (comprobarTirada(numeroInicial,numeroSegundo)==false) {
					vida--;
					System.out.println("tienes "+vida+" vidas");
					
				}
				if(vida==0) {
					System.out.println("fin de la partida, te has quedado sin vidas");
				}
				
				return  vida;
				
			}

}
