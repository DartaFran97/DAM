package Agenda;

import java.util.HashMap;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Agenda a=new Agenda();
		
		 	a.anyadirContacto("Maria", 987654321);
		 	a.anyadirContacto("Pedro", 456789123);
		 	a.anyadirContacto("Lucia", 789123456);
		 	a.anyadirContacto("Luis", 321654987);
		 	a.anyadirContacto("Laura", 654987321);
		 	a.anyadirContacto("Carlos", 258369147);
		 	a.anyadirContacto("Ana", 147852369);
		 	a.anyadirContacto("David", 369258147);
		 	a.anyadirContacto("Sara", 159263478);
		int seleccion=0;
		while (seleccion != 5) {
			System.out.println("bienvenido a su agenda que desea realizar");
			
			
			System.out.println("1.- añadir contacto");
			System.out.println("2.- eliminar contacto");
			System.out.println("3.- editar contacto");
			System.out.println("4.- ver contacto");
			System.out.println("5.- Salir");
			
			seleccion=sc.nextInt();
			sc.nextLine();
			
			
			switch (seleccion) {
			
			case 1:
				System.out.println("introduzca el nombre del contacto");
				String nombre=sc.nextLine();
				
				System.out.println("introduzca el numero de telefono");
				Integer numero=sc.nextInt();
				
				a.anyadirContacto(nombre, numero);
				
			break;
			
			case 2:
				
				System.out.println("introduzca el nombre del contacto");
				nombre=sc.nextLine();
				if (a.contieneClave(nombre)) {
					a.eliminarContactos(nombre);
					System.out.println("el contacto fue eliminado");
					
				}else {
					System.out.println("el contacto no existe");
				}
				
			break;
				
			case 3:
				System.out.println("introduzca el nombre del contacto");
				nombre=sc.nextLine();
				System.out.println("introduzca el nombre nuevo del contacto");
				String nombreNuevo=sc.nextLine();
				
				System.out.println("introduzca el numero de telefono nuevo");
				Integer numeroNuevo =sc.nextInt();
			
				if (a.contieneClave(nombre)) {
					a.editarContacto(nombreNuevo, nombre, numeroNuevo);
					System.out.println("el contacto fue editado");
				}else {
					System.out.println("el contacto no existe");
				}
				
			break;
				
			case 4:
				System.out.println("introduzca el nombre del contacto");
				nombre=sc.nextLine();
				
				
					Integer Tlf= a.verContacto(nombre);
				if (Tlf!=null) {
					System.out.println("el telefono de "+nombre+ " es "+ Tlf);
				}else {
					System.out.println("el contacto no existe");
				}		
			break;
			
			
			case 5:
				System.out.println("Hasta la vista, gracias por visitar nuestra tienda");
				break;
			default:
				System.out.println("error, valor no valido");
				
			}
		}

	}
}
