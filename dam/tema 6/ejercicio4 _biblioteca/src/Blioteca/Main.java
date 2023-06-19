package Blioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("bienvenido a la bliblioteca que desea hacer");
		System.out.println("1.coger un libro ");
		System.out.println("2.devolver un libro");
		int elecion=sc.nextInt();
		Libro a=new Libro();
		elegir(elecion,a);
		

	}
	public static Libro crearLibro() {
		Scanner sc=new Scanner(System.in);
		System.out.println("el titulo del libro");
		String libro=sc.nextLine();
		System.out.println("el autor del libro");
		String autor=sc.nextLine();
		
		Libro a=new Libro(libro,autor,0,0);
		return a;
	}
	
	public static void elegir(int elecion,Libro a) {
		Scanner sc=new Scanner(System.in);
		switch(elecion) {
		case 1:
			
			if(a.prestamo(1000,0)==true) {
			System.out.println("hay "+a.getLibro() +" diponibles");
			}    
		break;
		case 2:
		
			if (a.devolucion(100, 1000)==true) {
			System.out.println("ahora hay "+a.getLibro() +" prestados");
			}
		break;
		default:
			System.out.println("ERROR");
		}
	
	}
}
