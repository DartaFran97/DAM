package ejercicio6_Cancion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca el titulo de la canción");
		String titulo=sc.nextLine();
		System.out.println("introduzca el autor de la canción");
		String autor=sc.nextLine();
		
		Cancion a=new Cancion(titulo, autor);
		
		System.out.println(a.cancionCompelta(titulo, autor));

	}

}
