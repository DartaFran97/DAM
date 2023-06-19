package ejercicio4;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduzca el primer número");
		double num1 = teclado.nextDouble();
		
		System.out.println("introduzca el segundo número");
		double num2 = teclado.nextDouble();
		
		System.out.println("introduzca la operación");
		System.out.println("1.suma");
		System.out.println("2.resta");
		System.out.println("3.multiplicación");
		System.out.println("4.división");
		System.out.println("5.salir");
		
		int opr = teclado.nextInt();
		double result = 0;
		
		switch (opr){
			
		case 1:
			result = num1 + num2;
			System.out.println("el resultado de la operación es" + result);
			break;
			
		case 2:
			result = num1 - num2;
			System.out.println("el resultado de la operación es" + result);
			break;

		case 3:
			result = num1 * num2;
			System.out.println("el resultado de la operación es" + result);
			break;

		case 4:
			result = num1 / num2;
			System.out.println("el resultado de la operación es" + result);
			break;

		case 5:
			
			System.out.println("gracias y hasta luego ;)");
			break;
           default:
   			System.out.println("ERROR, introduzca una opción valida");
		}
		
		
		

	}

}
