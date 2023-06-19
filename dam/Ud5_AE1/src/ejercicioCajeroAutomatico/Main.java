package ejercicioCajeroAutomatico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int pin=1234;
		int numero_pin=0;
		int operacion_realizar=0;
		double saldo=5000;
		String continuar="";
		
		loguinValido(pin,numero_pin,sc);
		
		menu(operacion_realizar, saldo, sc, continuar);
		
	

	}
	public static void loguinValido (final int pin, int numero_pin, Scanner sc) {
	
		boolean valido=false;
		
		do {
			System.out.println("bienvenido a Dartabank");
			System.out.println("ingrese su clave pin");
			numero_pin=sc.nextInt();
				if (numero_pin==pin) {
					valido =true;
					
				}else {
					valido=false;
				}
				
			if (valido==false) {
				System.out.println("clave incorrecta intentelo de nuevo");
			}else {
				System.out.println("bienvenido");
			}
		}while(valido==false);
		
	}
	public static double IngresarDinero(double saldo,Scanner sc,String continuar) {
		double result=0;
		System.out.println("su saldo actual es de "+ saldo+ "€");
		System.out.println("introduzca la cantidad de dinero que desea ingresar");
		double ingreso=sc.nextDouble();
		sc.nextLine();
		
		if (ingreso>0) {
			
		result=saldo+ingreso;
		
		}else {
			System.out.println("error no valido");
		}
		System.out.println("su saldo es de " + result);
		saldo=result;
		comprovadorContinuar(saldo, sc, continuar);
		return result;
		
		
		
	}
	public static double RetirarDinero(double saldo,Scanner sc,String continuar) {
		double result=0;
		
			System.out.println("su saldo actual es de "+ saldo+ "€");
			System.out.println("introduzca la cantidad de dinero que desea sacar");
			double retirada=sc.nextDouble();
			sc.nextLine();
		
			if(retirada<=saldo&&retirada>0) {
				result=saldo-retirada;
			
			}else {
				System.out.println("error no valido");
			}
			System.out.println("su saldo es de " + result);
			
			saldo=result;
			
			comprovadorContinuar(saldo, sc, continuar);
			
			return result ;
			
		
	}	
	public static void ConsultaSaldo (double saldo,Scanner sc,String continuar) {
		double dollar=0;
		double btc=0;
		int consulta=0;
	
			System.out.println("en que desea consultar su saldo");
			System.out.println("1. €");
			System.out.println("2. $");
			System.out.println("3. BTC");
			consulta=sc.nextInt();
			sc.nextLine();
			
			switch(consulta){
			case 1:
				System.out.println("su saldo actual es de "+ saldo+ "€");
				break;
			case 2:
				dollar=saldo*1.08;
				System.out.println("su saldo actual es de "+ dollar+ "$");
				break;
			case 3:
				dollar=saldo*0.0000518627276579259;
				System.out.println("su saldo actual es de "+ btc+ "BTC");
				break;
				default:
				System.out.println("Error no valido el caracter ingresado");
				
			}
			comprovadorContinuar(saldo, sc, continuar);
			
	}

	public static void menu(int operacion_realizar, double saldo,Scanner sc,String continuar ) {
			System.out.println("¿que operación quiere realizar?");
			System.out.println("1. Ingresar Dinero");
			System.out.println("2. retirar dinero");
			System.out.println("3. consulta de Saldo");
			System.out.println("4. Salir");
			operacion_realizar=sc.nextInt();
			
			switch(operacion_realizar){
			case 1:
				IngresarDinero(saldo, sc, continuar);
				break;
			case 2:
				RetirarDinero(saldo, sc, continuar);
				break;
			case 3:
				ConsultaSaldo(saldo, sc, continuar);
				break;
			case 4:
				System.out.println("gracias por confiar en Dartabank, vuelva pronto");
				break;
			default:
				System.out.println("Error");
			}
			comprovadorContinuar(saldo, sc, continuar);
		
		
		
	}
	public static void comprovadorContinuar ( double saldo,Scanner sc,String continuar ) {
			boolean comprovador=false ;
			do {
				System.out.println("desea realizar otra operación");
				continuar=sc.nextLine();
			
				
				if(continuar.equals("si")) {
					comprovador=true;
					menu(0, saldo, sc, continuar);
				}else {
					comprovador=false;
				}
			
			}while(comprovador==true);
		}
}	
