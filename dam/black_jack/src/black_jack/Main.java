package black_jack;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String carta_jugador="";
		String continuar="";
		String realizar_apuesta="";
		double saldo_jugador=0;
		double apuesta=0;
		
		
		System.out.println("bienvenido al Black Jack");
		System.out.println("introduzca el saldo para jugar");
		saldo_jugador=sc.nextInt();
		System.out.println("EMPECEMOS");
		
		
		
		System.out.println("introduzca la apuesta inicial");
		apuesta=sc.nextInt();
		do {
			System.out.println("turno jugador");
			System.out.println(mazo_cartas());
			carta_jugador=(mazo_cartas());
			
			int puntos_partida=valor_cartas(carta_jugador);
			
			System.out.println("¿desea una nueva carta?");
			continuar=sc.nextLine();
			sc.nextLine();
			if ((continuar!="si")&&(continuar!="no")){
				System.out.println("introduzca una respuesta valida");
				System.out.println("¿desea una nueva carta?");
				continuar=sc.nextLine();
				if(continuar.equals("si")) {
					System.out.println(mazo_cartas());
					carta_jugador=(mazo_cartas());
					
					puntos_partida=valor_cartas(carta_jugador);
					System.out.println("dispone de: " + puntos_partida);
				}
			}
			if ((realizar_apuesta!="si")&&(realizar_apuesta!="no")){
				System.out.println("introduzca una respuesta valida");
				System.out.println("¿desea realizar una nueva apuesta?");
				realizar_apuesta=sc.nextLine();
			}
			System.out.println("su apuesta es de: "+ apuesta + "su saldo es de: " + saldo(saldo_jugador,apuesta,realizar_apuesta));
		
			
			
		}while (continuar.equals("si"));
		
		
	}
	public static String mazo_cartas() {
		String[] mazo= {"Ap","2p","3p","4p","5p","6p","7p","8p","9p","10p","Jp","Qp","Kp","Ac","2c","3c","4c","5c","6c","7c","8c","9c","10c","Jc","Qc","Kc","At","2t","3t","4t","5t","6t","7t","8t","9t","10t","Jt","Qt","Kt","Ad","2d","3d","4d","5d","6d","7d","8d","9d","10d","Jd","Qd","Kd"};
		int numero_aleatorio=(int)(Math.random()*52+1);
		
		return mazo[numero_aleatorio];

		
		}

	public static int valor_cartas(String carta_jugador) {
		int puntos_jugador=0;
		
		if(carta_jugador.contains("A")){
			do {
			Scanner sc=new Scanner(System.in);
			System.out.println("seleccione el valor de la carta 1 o 11");
			puntos_jugador=sc.nextInt();
			}while(puntos_jugador != 1 && puntos_jugador!=11);
		
		}
		if(carta_jugador.contains("2")){
			puntos_jugador=2;
		}
		if(carta_jugador.contains("3")){
			puntos_jugador=3;
		}
		if(carta_jugador.contains("4")){
			puntos_jugador=4;
		}
		if(carta_jugador.contains("5")){
			puntos_jugador=5;
		}
		if(carta_jugador.contains("6")){
			puntos_jugador=6;
		}
		if(carta_jugador.contains("7")){
			puntos_jugador=7;
		}
		if(carta_jugador.contains("8")){
			puntos_jugador=8;
		}
		if(carta_jugador.contains("9")){
			puntos_jugador=9;
		}
		if(carta_jugador.contains("10")){
			puntos_jugador=10;
		}
		if(carta_jugador.contains("J")){
			puntos_jugador=10;
		}
		if(carta_jugador.contains("Q")){
			puntos_jugador=10;
		}
		if(carta_jugador.contains("K")){
			puntos_jugador=10;
		}
		return puntos_jugador;
	}
	public static double saldo (double saldo_jugador, double apuesta, String realizar_apuesta) {
		Scanner sc=new Scanner(System.in);
		double saldo_actual=saldo_jugador-apuesta;
		
		if(apuesta>saldo_jugador) {
			System.out.println("apuesta invalida, introduzca una cantida valida");
		}
		if(saldo_jugador<=0) {
			System.out.println("no dispone de saldo suficiente, introduzca más saldo");
			saldo_jugador=sc.nextDouble();
		}
		
		
		return saldo_actual;
	}
	public static 
}

		
		
		
	
	




	




