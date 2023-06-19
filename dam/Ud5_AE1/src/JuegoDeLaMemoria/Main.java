package JuegoDeLaMemoria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("seleccione el nivel de dificultad:");
		System.out.println(" 0 -> Nivel Facil");
		System.out.println(" 1 -> Nivel Dificil");
		int nivel=sc.nextInt();
		int numero1=0;
		int numero2=0;
		int vidas=10;
		int fila=0;
		int columna=0;
		int fila2=0;
		int columna2=0;
	
		// 0 -> Nivel Facil
		// 1 -> Nivel Dificil
		int[][] tablero = iniciarTablero(nivel);
	
		
		mostrarTableroInicial(tablero);		
		borrarPanel(tablero);
		
		// INICIO LÓGICA DEL PROGRAMA
		partida(vidas, fila, columna, fila2, columna2, tablero, sc, numero1, numero2);
		
		
		
		
		
		
		
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
			// TODO Auto-generated catch block
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
	public static void mostrarTablero(int[][] t, int numeroAMostrar) {
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[0].length; j++) { 
				if(t[i][j] == numeroAMostrar) {
					System.out.print(t[i][j] + "-");
				} else {
					System.out.print("XX" + "-");
				}
			}
			System.out.println("");
		}
		}
		public static void partida(int vidas,int fila, int columna, int fila2, int columna2, int[][] tablero,Scanner sc, int numero1, int numero2) {
			do {
				System.out.println("intoduce la fila");
				fila=sc.nextInt();
				System.out.println("intoduce la columna");
				columna=sc.nextInt();
				
				numero1=tablero[fila][columna];
				
				System.out.println("intoduce la fila");
				fila2=sc.nextInt();
				System.out.println("intoduce la columna");
				columna2=sc.nextInt();
				
				numero2=tablero[fila2][columna2];
				
				if (numero1==numero2) {
					mostrarTablero(tablero, numero2);
				}else {
					vidas--;
					System.out.println("solo te quedan "+vidas+" vidas");
				}
				
				
				}while (vidas>0);
				System.out.println("fin de la partida");
				
		
				
		
	}
}