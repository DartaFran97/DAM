package ejercicio9PiedraPapelTijera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maquina m =new Maquina();
		int contmaquina=0;
		int contadorPlayer=0;
		boolean verificacion=true;
		
		System.out.println("buenas. Introduzce tu nombre");
		String nombrePlayer= sc.nextLine();
		
		 while (contmaquina < 3 && contadorPlayer < 3 && verificacion) {
			System.out.println("elija: piedra, papel, tijera");
			String jugadaPlayer=sc.nextLine();
			sc.nextLine();
			
			
			if (jugadaPlayer.equalsIgnoreCase("piedra")||jugadaPlayer.equalsIgnoreCase("papel")|| jugadaPlayer.equalsIgnoreCase("tijera")) {
				System.out.println(m.tiradaMaquina());
				
				if(jugadaPlayer.equalsIgnoreCase("piedra")) {
					if (m.tiradaMaquina().equalsIgnoreCase("papel")) {
						System.out.println("has perdido");
						contmaquina++;
					}
					if (m.tiradaMaquina().equalsIgnoreCase("tijera")) {
						System.out.println("has ganado 1 punto");
						contadorPlayer++;
					}	
					if (m.tiradaMaquina().equalsIgnoreCase("piedra")) {
						System.out.println("empate");
						
					}
				}
				if(jugadaPlayer.equalsIgnoreCase("papel")) {
					if (m.tiradaMaquina().equalsIgnoreCase("tijera")) {
						System.out.println("has perdido");
						contmaquina++;
					}
					if (m.tiradaMaquina().equalsIgnoreCase("piedra")) {
						System.out.println("has ganado 1 punto");
						contadorPlayer++;
					}
					if (m.tiradaMaquina().equalsIgnoreCase("papel")) {
						System.out.println("empate");
						
					}
					
				}
				if(jugadaPlayer.equalsIgnoreCase("tijera")) {
					if (m.tiradaMaquina().equalsIgnoreCase("piedra")) {
						System.out.println("has perdido");
						contmaquina++;
					}
					if (m.tiradaMaquina().equalsIgnoreCase("papel")) {
						System.out.println("has ganado 1 punto");
						contadorPlayer++;
					}
					if (m.tiradaMaquina().equalsIgnoreCase("tijera")) {
						System.out.println("empate");
						
					}
					
				}
				
			}else {
				System.out.println("ingrese una jugada valida porfavor");
				verificacion =false ;
			}
			System.out.println("maquina: "+contmaquina+" "+ nombrePlayer+": "+contadorPlayer);
		}
		 
	}

}
