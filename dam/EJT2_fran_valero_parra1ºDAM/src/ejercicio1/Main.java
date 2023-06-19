package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("introduzca la cantidad de kg de uva:");	
		double kg = teclado.nextDouble();
		
		System.out.println("introduzca el precio por kg de uva:");	
	    double precio = teclado.nextDouble();
	    teclado.nextLine();
	    
	    System.out.println("indique el tipo y tamaño de uva (a1, a2, b1, b2):");	
	    String tipouva = teclado.nextLine();    
	    
	    double preciofinal = 0;
	    		
	    if (tipouva.equals("a1")) {
	    	 preciofinal = kg *(precio + 0.20);
	    	System.out.println("su precio final es de: " + preciofinal + "€");
	    }else {
	    	if (tipouva.equals("a2")) {
	    		 preciofinal = kg *(precio + 0.30);
	    		System.out.println("su precio final es de: " + preciofinal + "€");
	    	}else {
	    		if (tipouva.equals("b1")) {
	    			 preciofinal = kg *(precio - 0.30);
	    			System.out.println("su precio final es de: " + preciofinal + "€");
	    		}else {
	    			if (tipouva.equals("b2")) {
	    				 preciofinal = kg *(precio - 0.50);
	    				System.out.println("su precio final es de: " + preciofinal + "€");
	    			}
	    			}
	    			
	    		}
	    	}
	    }
		
		
		


	}


