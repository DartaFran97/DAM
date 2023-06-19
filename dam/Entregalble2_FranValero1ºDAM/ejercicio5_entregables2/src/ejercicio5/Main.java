package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("bienvenido seleccione que desea calcular:");
		System.out.println("a.área de un triangulo");
		System.out.println("b.área de un cuadrado");
		System.out.println("c.área de un circulo");
		System.out.println("d.área de un rectangulo ");
		System.out.println("e.salir");
		
		String op = teclado.nextLine();
		double result = 0;
		
		switch (op) {
		
		case "a":
		    System.out.println("introduzcal la medida de la base");
		    double base = teclado.nextDouble();
		    System.out.println("introduzcal la medida de la atura");
		    double alt = teclado.nextDouble();
		    result = base * alt / 2;
		    System.out.println("el area del triangulo es de : " + result);
		     
		break;
		
		case "b":
			 System.out.println("introduzcal la medida del lado");
			    double lado = teclado.nextDouble();
			   
			    result = lado * lado;
			    System.out.println("el area del cuadrado es de  es de : " + result);
			     
		break;
		
		case "c":
		 System.out.println("introduzcal el radio de la circunferencia");
		    double rad = teclado.nextDouble();
		    result = 3.14* (rad * rad);
		    System.out.println("el area del triangulo es de : " + result);
		break;    
		
		case "d":
			 System.out.println("introduzcal la medida de la base");
			    double bas = teclado.nextDouble();
			    System.out.println("introduzcal la medida de la atura");
			    double al = teclado.nextDouble();
			    result = bas * al;
			    System.out.println("el area del rectangulo es de : " + result);
			break;  
			
		case "e":
			 System.out.println("hasta la vista ;)");
			  
			break;  
			default:
				 System.out.println("Error Valor incorrecto");
				
 
		}
		
		
		

		
		
	   
		
	
}
}

