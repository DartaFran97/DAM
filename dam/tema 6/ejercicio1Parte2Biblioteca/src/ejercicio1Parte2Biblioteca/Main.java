package ejercicio1Parte2Biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		Libro[] arrayLibros=new Libro[10]; 
		
		Libro libro1 = new Libro(1, "9788498387070", "El nombre del viento", "Patrick Rothfuss", 662, 'C', 0);
		Libro libro2 = new Libro(2, "9788497599023", "Cien años de soledad", "Gabriel García Márquez", 471, 'H', 1);
		Libro libro3 = new Libro(3, "9788408069102", "El código Da Vinci", "Dan Brown", 604, 'S', 0);
		Libro libro4 = new Libro(4, "9789875666477", "El psicoanalista", "John Katzenbach", 560, 'S', 1);
		Libro libro5 = new Libro(5, "9788466321535", "La sombra del viento", "Carlos Ruiz Zafón", 568, 'T', 0);
		Libro libro6 = new Libro(6, "9780545010221", "Harry Potter y la piedra filosofal", "J.K. Rowling", 256, 'C', 0);
		Libro libro7 = new Libro(7, "9788483461938", "El ángel perdido", "Javier Sierra", 480, 'T', 1);
		Libro libro8 = new Libro(8, "9788420485229", "La naranja mecánica", "Anthony Burgess", 192, 'S', 0);	
		Libro libro9 = new Libro(9, "9788466664417", "Ready Player Two", "Ernest Cline", 384, 'C', 0);
		Libro libro10 = new Libro(10, "9788401024086", "Los cuatro vientos", "Kristin Hannah", 448, 'H', 1);

		
		
		arrayLibros[0]=libro1;
		arrayLibros[1]=libro2;
		arrayLibros[2]=libro3;
		arrayLibros[3]=libro4;
		arrayLibros[4]=libro5;
		arrayLibros[5]=libro6;
		arrayLibros[6]=libro7;
		arrayLibros[7]=libro8;
		arrayLibros[8]=libro9;
		arrayLibros[9]=libro10;
		 
		System.out.println("elija una opción");
		System.out.println("1- ver libros");
		System.out.println("2- sollicitar el prestamo de un libro");
		System.out.println("3- realizar la devolución de un libro ");
		System.out.println("4- recomendador de libros");
		System.out.println("5- salir");
		
		int opcion=sc.nextInt();
		
		switch(opcion) {
		
			case 1:
				listaLibros(arrayLibros);
			break;
			
			case 2:
				System.out.println("introduzca el id del libro que desea que se le preste");
				int idLibro=sc.nextInt();
				if (prestamoLibros(arrayLibros, idLibro)==true) {
					System.out.println("operación realizada");
				}else {
					System.out.println("el libro no se encuentra disponible para el prestamo");
				}
			break;
			
			case 3:
				System.out.println("introduzca el id del libro que desea devolver");
				idLibro=sc.nextInt();
				if (prestamoLibros(arrayLibros, idLibro)==false) {
					System.out.println("operación realizada");
				}else {
					System.out.println("el libro actualmente no esta prestado por lo que no se puede devolver");
				}
			break;
			
			case 4:
				System.out.println("que tipo de tematica es su preferida (terror = T, ciencia ficcion=C, humor=H o suspense=S");
				String tematica=sc.nextLine();
				System.out.println("Sobre que autor te gustaria leer");
				String autor=sc.nextLine();
				
			break;
			
			case 5:
				System.out.println("hasta la vista");
			break;
			
			default:
			System.out.println("Error introduzca un valor correcto");
			}
	}
	public static Libro[] listaLibros(Libro[] arrayLibros) {
		
			for (Libro a: arrayLibros) {
				if(a.getEstado()==0) {
					System.out.println(a.getTitulo()+" "+a.getAutor()+" "+a.getISBN());
				}
			}
		return arrayLibros;
	}
	public static boolean prestamoLibros(Libro[] arrayLibros, int idLibro) {
		boolean verificado=false;
		Libro a = new Libro();
		a.setId_libro(idLibro);
		
		if(a.getEstado()==0) {
			verificado=true;
			a.setEstado(1);
		}
		
	
		return verificado;
	}
	
	public static Libro[] recomendador(Character tematica, String autor,Libro[] arrayLibros) {
		
		for (Libro a: arrayLibros) {
			if(a.getTematica().equals(tematica)&& a.getAutor().equalsIgnoreCase(autor)){
				System.out.println(a.getTitulo()+" "+a.getAutor()+" "+a.getISBN());
			}
		}
		return arrayLibros;
		
	}
}
