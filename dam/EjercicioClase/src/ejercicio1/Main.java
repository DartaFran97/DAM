package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner teclado = new Scanner(System.in);
	 
	 String usuario = "fran";
	 String pasword = "1234";
	 int op1 ;
	 String dia ;
	 
	 
	 
	 
	System.out.println("introduzca su usuario: ");
	usuario = teclado.nextLine();
	System.out.println("introduzca su contraseña: ");
	pasword = teclado.nextLine();
	
	if (usuario.equals("fran")&& pasword.equals("1234")) {
		System.out.println("bienvenido");
		System.out.println("elija una de las siguientes opciones:");
		System.out.println("1. ver horario completo");
		System.out.println("2. ver horario por día");
		System.out.println("3. vero horario por horas");
		System.out.println("4. Salir del sistema");
		
		op1 = teclado.nextInt();
		teclado.nextLine();
		
		switch(op1) {
		
		case 1:
			System.out.println("tu horario completo es:");
			System.out.println(" 8:00/8:55 \t   SI \t  PROG \t SI \t LLMM \t SI "); 
		    System.out.println(" 8:55/9:50 \t   ANG \t PROG \t ANG \t SI \t BDA");
		    System.out.println("PATIO");
		    System.out.println(" 10:10/11:05 \t PROG \t ANG \t PROG \t PROG \t BDA ");
		    System.out.println(" 11:05/12:00 \t PROG \t FOL \t ED \t FOL \t BDA");
		    System.out.println("PATIO");
		    System.out.println(" 12:20/13:15 \t PROG \t FOL \t ED \t BDA \t LLMM");
		    System.out.println(" 13:15/14:10 \t LLMM \t SI \t ED \t BDA \t PROG");
		break; 
		case 2:
			System.out.println("Que día de la semana quieres ver:");
			
			dia = teclado.nextLine();
			
			switch(dia) {
			
			case "lunes":
				System.out.println(" 8:00/8:55   SI"); 
			    System.out.println(" 8:55/9:50   ANG ");
			    System.out.println("PATIO");
			    System.out.println(" 10:10/11:05 PROG ");
			    System.out.println(" 11:05/12:00 PROG ");
			    System.out.println("PATIO");
			    System.out.println(" 12:20/13:15 PROG ");
			    System.out.println(" 13:15/14:10 LLMM ");
				break;
			case "martes":
				
				System.out.println(" 8:00/8:55  PROG "); 
			    System.out.println(" 8:55/9:50  PROG" );
			    System.out.println("PATIO");
			    System.out.println(" 10:10/11:05 ANG  ");
			    System.out.println(" 11:05/12:00 FOL ");
			    System.out.println("PATIO");
			    System.out.println(" 12:20/13:15 FOL ");
			    System.out.println(" 13:15/14:10 SI ");
			    
			break;
			
			case "miercoles":
				System.out.println(" 8:00/8:55    SI "); 
			    System.out.println(" 8:55/9:50    ANG ");
			    System.out.println("PATIO");
			    System.out.println(" 10:10/11:05  PROG  ");
			    System.out.println(" 11:05/12:00  ED ");
			    System.out.println("PATIO");
			    System.out.println(" 12:20/13:15  ED ");
			    System.out.println(" 13:15/14:10  ED ");
				break;
			
			case "jueves":
				System.out.println(" 8:00/8:55    LLMM "); 
			    System.out.println(" 8:55/9:50    SI ");
			    System.out.println("PATIO");
			    System.out.println(" 10:10/11:05  PROG ");
			    System.out.println(" 11:05/12:00  FOL ");
			    System.out.println("PATIO");
			    System.out.println(" 12:20/13:15  BDA ");
			    System.out.println(" 13:15/14:10  BDA ");
				
				break;
			
			case "viernes":
				System.out.println(" 8:00/8:55    SI "); 
			    System.out.println(" 8:55/9:50    BDA ");
			    System.out.println("PATIO");
			    System.out.println(" 10:10/11:05  BDA ");
			    System.out.println(" 11:05/12:00  BDA ");
			    System.out.println("PATIO");
			    System.out.println(" 12:20/13:15  PROG ");
			    System.out.println(" 13:15/14:10  LLMM");
				break;
			default:
					}
			
		break;
		
		case 3:	
			System.out.println("que franja horaria quieres visualizar");
			System.out.println("1. 8:00/8:55");
			System.out.println("2. 8:55/9:50");
			System.out.println("3. 10:10/11:05");
			System.out.println("4. 11:05/12:00");
			System.out.println("5. 12:20/13:15");
			System.out.println("6. 13:15/14:10");
			
			int hora = teclado.nextInt();
			 switch(hora) {
			 case 1:
				 System.out.println(" 8:00/8:55 \t     SI \t PROG \t SI \t LLMM \t SI "); 
				 break;
				 
			 case 2:
				 System.out.println(" 8:55/9:50 \t     ANG \t PROG \t ANG \t SI \t BDA");
				 break;
				 
			 case 3:
				 System.out.println(" 10:10/11:05 \t PROG \t ANG \t PROG \t PROG \t BDA ");
				 break;
				 
			 case 4:
				 System.out.println(" 11:05/12:00 \t PROG \t FOL \t ED \t FOL \t BDA");
				 break;
				 
			 case 5:
				    System.out.println(" 12:20/13:15 \t PROG \t FOL \t ED \t BDA \t LLMM");
				 break;
				 
			 case 6:
				 System.out.println(" 13:15/14:10 \t LLMM \t SI \t ED \t BDA \t PROG");
				 break;
			
			 default:
			 }
			
		break;
		
		case 4:
			System.out.println("hasta pronto :)");
			
			break;
			
		}	
	}else {
		System.out.println("error, acceso denegado");
	}
 
  }

}
