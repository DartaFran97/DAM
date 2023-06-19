package ejercicioAgenda;

import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Agenda a=new Agenda();
		
		
		System.out.println("que operación desea realizar");
		System.out.println("1. añadir contacto");
		System.out.println("2. borrar contacto");
		System.out.println("3. editar contacto");
		System.out.println("4. ver telefono contacto");
		int opcion=sc.nextInt();
		sc.nextLine();
		switch (opcion) {
		
		case 1:
		System.out.println("introduzca el nombre del contacto");
		String nombre=sc.nextLine();
		System.out.println("introduzca el numero de telefono");
		Integer telefono=sc.nextInt();
		a.anyadirContacto(nombre, telefono);
			
		break;
		
		case 2:
		System.out.println("introduzca el nombre del contacto a eliminar");
		nombre=sc.nextLine();
		a.borrarContacto(nombre);
		
		break;
			
		case 3:
			
			System.out.println("introduzca el nombre del contacto");
			String nombreAntiguo=sc.nextLine();
			System.out.println("introduzca el nombre nuevo del contacto");
			nombre=sc.nextLine();
			System.out.println("introduzca el antiguo numero de telefono");
			Integer telefonoAntiguo=sc.nextInt();
			System.out.println("introduzca el nuevo numero de telefono");
			telefono=sc.nextInt();
			System.out.println("que desea modificar?");
			String Seleccion=sc.nextLine();
			
			a.editarContacto(nombreAntiguo, telefonoAntiguo, nombre, Seleccion, telefono);
			 
			
		break;
			
		case 4:

			System.out.println("introduzca el nombre del contacto");
			nombre=sc.nextLine();
			a.verContacto(nombre);
			
		break;
		default:
			System.out.println("error");
			
		}
			
		
		
	}

}
