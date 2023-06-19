package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("intoduzca el peso de su paquete a transportar (kg)");
		double kg = teclado.nextDouble();
		teclado.nextLine();
		String destino = ("destination");
		double preciotrans = 0;
		
		
		
		if (kg >= 5) {
			System.out.println("El peso del paquete es superior al permitido. disculpe las molestias.");
		}
		 if (kg < 5){
			 System.out.println("introduzca su destino: ");
			 destino = teclado.nextLine(); 
		 }
		 if(destino.equals("america del norte")) {
				 preciotrans = kg * 24 ;
				 System.out.println("el envio tiene un costo de: " + preciotrans + "€");
		     } else {
		    	 if(destino.equals("america central")) {
					 preciotrans = kg * 20;
					 System.out.println("el envio tiene un costo de: " + preciotrans + "€");
		         } else {
		        	 if(destino.equals("america del sur")) {
						 preciotrans = kg * 21 ;
						 System.out.println("el envio tiene un costo de: " + preciotrans + "€");
		             } else {
		            	 if(destino.equals("asia")) {
		    				 preciotrans = kg * 18 ;
		    				 System.out.println("el envio tiene un costo de: " + preciotrans + "€");
		                 } else {
		                	 if(destino.equals("europa")) {
		        				 preciotrans = kg * 10 ;
		        				 System.out.println("el envio tiene un costo de: " + preciotrans + "€");
		                     }else {
		                    	 System.out.println("no hay destino disponible");
		                 		 
		            }
		          }
		        }
	          }
		    }
		  

  }
}
