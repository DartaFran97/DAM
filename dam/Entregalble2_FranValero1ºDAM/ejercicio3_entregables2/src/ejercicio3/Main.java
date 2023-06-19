package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduzca el mes a traducir ");
		System.out.println("1.enero ");
		System.out.println("2.febrero ");
		System.out.println("3.marzo ");
		System.out.println("4.abril ");
		System.out.println("5.mayo ");
		System.out.println("6.junio ");
		System.out.println("7.julio ");
		System.out.println("8.agosto ");
		System.out.println("9.septiembre ");
		System.out.println("10.octubre ");
		System.out.println("11.noviembre ");
		System.out.println("12.diciembre ");
		
		
		
		int num = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("elija el idioma al cual traducir (Ingles / Frances) ");
		String idioma = teclado.nextLine();
		
		if (idioma.equals("ingles")) {
			
			switch (num){
			
			case 1:
				System.out.println("january");
				break;
			
			case 2:
				System.out.println("february");
				break;
			
			case 3:
				System.out.println("march");
				break;
				
			case 4:
				System.out.println("april");
				break;
				
			case 5:
				System.out.println("may");
				break;
				
			case 6:
				System.out.println("june");
				break;
				
			case 7:
				System.out.println("july");
				break;
				
			case 8:
				System.out.println("august");
				break;
				
			case 9:
				System.out.println("september");
				break;
				
			case 10:
				System.out.println("october");
				break;
				
			case 11:
				System.out.println("november");
				break;
				
			case 12:
				System.out.println("december");
				break;
				default:
					
			}
			}
		if (idioma.equals("frances")) {
        
			switch (num){
			
			case 1:
				System.out.println("janvier");
				break;
			
			case 2:
				System.out.println("février");
				break;
			
			case 3:
				System.out.println("mars");
				break;
				
			case 4:
				System.out.println("avril");
				break;
				
			case 5:
				System.out.println("mai");
				break;
				
			case 6:
				System.out.println("juin");
				break;
				
			case 7:
				System.out.println("julliet");
				break;
				
			case 8:
				System.out.println("août");
				break;
				
			case 9:
				System.out.println("septembre");
				break;
				
			case 10:
				System.out.println("octobre");
				break;
				
			case 11:
				System.out.println("novembre");
				break;
				
			case 12:
				System.out.println("décembre");
				break;
				default:
					
			}
			}
		}
		}
		
	

