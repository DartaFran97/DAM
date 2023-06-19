package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int nota = 0;
		
		System.out.println("introduzaca su nota:");
		nota = teclado.nextInt();
		
		switch(nota) {
		
		case 0:
			
				System.out.println("muy deficiente :,( ");
			
			break;
		
		case 1:
			
				System.out.println("muy deficiente :,( ");
			
			break;
		
		case 2:
			if (nota >= 0 && nota <= 3) {
				System.out.println("muy deficiente :,( ");
			}
			break;
		
		case 3:
			
				System.out.println("Insuficiente :( ");
			
			break;
		
		case 4:
			
				System.out.println("Insuficiente :( ");
			
			break;
			
		case 5:
			
				System.out.println("bien :/ ");
			
			break;
		
		case 6:
			
				System.out.println("notable :)");
			
			break;
			
		case 7:
			
				System.out.println("notable :)");
		
			break;
			
		case 8:
			
			System.out.println("notable :)");
	
		break;
		
		case 9:
			
			System.out.println("sobresaliente :D");
	
		break;
		
	    case 10:
			
			System.out.println("sobresaliente :D");
	
		break;
		
		default:
		}
 }
}
