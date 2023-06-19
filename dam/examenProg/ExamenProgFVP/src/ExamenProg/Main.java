package ExamenProg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		Youtube y =new Youtube();
		Youtuber p=new Youtuber();
		HashMap <String,Youtuber> YoutubersUSA = y.getEEUU();
		HashMap <String,Youtuber> YoutubersJPN = y.getJapon();
		HashMap <String,Youtuber> YoutubersESP = y.getEspanya();
		
		
		
		
		System.out.println("selecione una opción:");
		System.out.println("1.Listar youtubers por pais");
		System.out.println("2.incrementar puntos a un youtuber");
		System.out.println("3.restar punutos a un youtuber");
		System.out.println("4. Salir");
		
		int Seleccion=sc.nextInt();
		
		switch (Seleccion) {
		
		case 1: 
			
			System.out.println("Seleccione el pais: ");
			System.out.println("1.EEUU");
			System.out.println("2.Japon");
			System.out.println("3.España");
			
			int pais= sc.nextInt();
			
			if (pais == 1) {
				
				for (Entry<String,Youtuber> ListaUsa : YoutubersUSA.entrySet()) {
				    System.out.println(ListaUsa.getValue());
				}
					
			}
			if (pais == 2) {
				for (Entry<String,Youtuber> ListaJPN : YoutubersJPN.entrySet()) {
				    System.out.println(ListaJPN.getValue());
				}
							
			}			
						
			if (pais == 3) {
				for (Entry<String,Youtuber> ListaEsp : YoutubersESP.entrySet()) {
				    System.out.println(ListaEsp.getValue());
				}
				
				
			}
			
		break;
		
		case 2: 
			System.out.println("seleccione el pasis");
			System.out.println("1.EEUU");
			System.out.println("2.Japon");
			System.out.println("3.España");
			pais= sc.nextInt();
			
			System.out.println("seleccione el nickname");
			String Nick=sc.nextLine();
			
			if (pais == 1) {
				
				if(YoutubersUSA.containsKey(Nick)== true) {
					Youtuber Usa=YoutubersUSA.get(Nick);
				System.out.println("cuantos puntos quiere sumarle");
				int puntos= sc.nextInt();
				
				if(Usa.sumarPuntos(puntos)== true) {
					System.out.println("Operación realizada el youtuber "+Nick+" tiene " + p.getPuntos()+ " puntos");
				}else {
					System.out.println("operación fallida");
				}
					
				}
					
			}
			if (pais == 2) {
				if(YoutubersJPN.containsKey(Nick)== true) {
					Youtuber jpn =YoutubersJPN.get(Nick);
					System.out.println("cuantos puntos quiere sumarle");
					int puntos= sc.nextInt();
					
					if(jpn.sumarPuntos(puntos)== true) {
						System.out.println("Operación realizada el youtuber "+Nick+" tiene " + p.getPuntos()+ " puntos");
					}else {
						System.out.println("operación fallida");
					}
						
					}
							
			}			
						
			if (pais == 3) {
				if(YoutubersESP.containsKey(Nick)== true) {
					Youtuber esp= YoutubersESP.get(Nick);
					System.out.println("cuantos puntos quiere sumarle");
					int puntos= sc.nextInt();
					
					
					
					if(esp.sumarPuntos(puntos)== true) {
						System.out.println("Operación realizada el youtuber "+Nick+" tiene " + p.getPuntos()+ " puntos");
					}else {
						System.out.println("operación fallida");
					}
						
					}
				
				
			}
			
			
		break;
			
		case 3: 
			System.out.println("seleccione el pasis");
			System.out.println("1.EEUU");
			System.out.println("2.Japon");
			System.out.println("3.España");
			pais= sc.nextInt();
			
			System.out.println("seleccione el nickname");
			Nick=sc.nextLine();
			
			if (pais == 1) {
				
				if(YoutubersUSA.containsKey(Nick)== true) {
					Youtuber Usa=YoutubersUSA.get(Nick);
				System.out.println("cuantos puntos quiere sumarle");
				int puntos= sc.nextInt();
				
				if(Usa.RestarPuntos(puntos)== true) {
					System.out.println("Operación realizada el youtuber "+Nick+" tiene " + p.getPuntos()+ " puntos");
				}else {
					System.out.println("operación fallida");
				}
					
				}
					
			}
			if (pais == 2) {
				if(YoutubersJPN.containsKey(Nick)== true) {
					Youtuber jpn =YoutubersJPN.get(Nick);
					System.out.println("cuantos puntos quiere sumarle");
					int puntos= sc.nextInt();
					
					if(jpn.RestarPuntos(puntos)== true) {
						System.out.println("Operación realizada el youtuber "+Nick+" tiene " + p.getPuntos()+ " puntos");
					}else {
						System.out.println("operación fallida");
					}
						
					}
							
			}			
						
			if (pais == 3) {
				if(YoutubersESP.containsKey(Nick)== true) {
					Youtuber esp=YoutubersESP.get(Nick);
					System.out.println("cuantos puntos quiere sumarle");
					int puntos= sc.nextInt();
					
					
					
					if(esp.RestarPuntos(puntos)== true) {
						System.out.println("Operación realizada el youtuber "+Nick+" tiene " + p.getPuntos()+ " puntos");
					}else {
						System.out.println("operación fallida");
					}
						
					}
				
				
			}
			
			
		break;
		
		case 4: 
			System.out.println("Hasta la vista");
		break;
		
		default:
		System.out.println("Error elemento no valido");
		
		}
		
	
		
			
		
		
		
	
		

	}

}
