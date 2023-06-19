package ejercicio2Cuenta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		System.out.println("introduzca su nombre");
		String cliente=sc.nextLine();
		System.out.println("Introduzca su numero de cuenta");
		String cuenta=sc.nextLine();
		System.out.println("introduzca el porcentaje de sus intereses");
		double interes=sc.nextDouble();
		System.out.println("introduzca su saldo actual"); 
		double saldo=sc.nextDouble();
		sc.nextLine();
		
		Cuenta a=new Cuenta(cliente,cuenta, interes, saldo);
		Cuenta b=new Cuenta();
		b.setsaldo(1000);
		
		System.out.println("Que operación desea realizar?");
		System.out.println("1. ingresar");
		System.out.println("2. retirar");
		System.out.println("3. transferencia");
		System.out.println("4.salir");
		int seleccion=sc.nextInt();
		sc.nextLine();
		switch(seleccion) {
		case 1:
			System.out.println("que cantidad desea ingresar?");
			int ingreso=sc.nextInt();
			a.ingreso(ingreso);
			System.out.println("su saldo actual es de "+a.getsaldo()); 
		break;
		case 2:
			System.out.println("que cantidad desea ingresar?");
			int reintegro=sc.nextInt();
			a.reintegro(reintegro);
			System.out.println("su saldo actual es de "+a.getsaldo()); 
			
		
		case 3:

			System.out.println("introduzca el nombre del destinatario");
			cliente=sc.nextLine();
		
			System.out.println("Introduzca el numero de cuenta de destino");
			cuenta=sc.nextLine();
			System.out.println("Introduzca la cantidad a ingresar");
			double transferencia=sc.nextDouble();
			if(b.transferencia(b, saldo)==true) {
			b.ingreso(transferencia);
			a.reintegro(transferencia);
			System.out.println("su saldo actual es de "+a.getsaldo());
			System.out.println(b.getsaldo());
			}else {
				System.out.println("cantidad no valida");
			}
		break;
		default:
			System.out.println("error");
		}
		
		
		
	}
}


