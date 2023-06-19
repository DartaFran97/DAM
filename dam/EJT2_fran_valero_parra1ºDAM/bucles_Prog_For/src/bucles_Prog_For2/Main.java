package bucles_Prog_For2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
     Scanner teclado = new Scanner(System.in);
     System.out.println("introduzca cuantos sueldos va a procesar");
     int nsuel = teclado.nextInt();
     int max = 0;
   
     
      for (int cont = 0; cont < nsuel; cont++) {
    	  System.out.println("introduzca el importe:");
    	  int suel = teclado.nextInt();
    	  
    	  if(suel > max) {
    		  max = suel;
    	  }
    
      }
      System.out.println("el sueldo maximo es de :" + max );

	}

}
