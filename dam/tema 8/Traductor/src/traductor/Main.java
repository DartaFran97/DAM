package traductor;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Diccionario diccionario=new Diccionario();
		
		
		diccionario.anadirEntrada("abrazo", "hug");
		diccionario.anadirEntrada("aceituna", "olive");
		diccionario.anadirEntrada("adelgazar", "lose weight");
		diccionario.anadirEntrada("afeitarse", "shave");
		diccionario.anadirEntrada("agradable", "pleasant");
		diccionario.anadirEntrada("aguacate", "avocado");
		diccionario.anadirEntrada("alegría", "joy");
		diccionario.anadirEntrada("almohada", "pillow");
		diccionario.anadirEntrada("amable", "kind");
		diccionario.anadirEntrada("anillo", "ring");
		diccionario.anadirEntrada("apetito", "appetite");
		diccionario.anadirEntrada("aplaudir", "applaud");
		diccionario.anadirEntrada("aprendizaje", "learning");
		diccionario.anadirEntrada("araña", "spider");
		diccionario.anadirEntrada("arco iris", "rainbow");
		diccionario.anadirEntrada("asombroso", "amazing");
		diccionario.anadirEntrada("ataque", "attack");
		diccionario.anadirEntrada("atractivo", "attractive");
		diccionario.anadirEntrada("avión", "airplane");
		diccionario.anadirEntrada("azul", "blue");
		diccionario.anadirEntrada("baloncesto", "basketball");
		diccionario.anadirEntrada("banco", "bank");
		diccionario.anadirEntrada("bañarse", "bathe");
		
		System.out.println("que desea realizar");
		System.out.println("1-añadir una entrada al diccionario");
		System.out.println("2-traducir una palabra");
		System.out.println("3-salir");
		
		int Eleccion=sc.nextInt();
		
		switch (Eleccion) { 
	    case 1:
	     System.out.println("que palabra desea añadir");
	     String palabra=sc.nextLine();
	     System.out.println("cual es la trducción");
	     String traduccion=sc.nextLine();
	     if (diccionario.anadirEntrada(palabra, traduccion)) {
	    	 System.out.println("palabra añadida");
	     }else {
	    	 System.out.println("la palabra ya existe");
	     }
	     break;
	    case 2:
	    	  System.out.println("que palabra desea traducir");
	 	     	palabra=sc.nextLine();
	 	     diccionario.recuperarPalabra(palabra);

	     break;
	    case 3:
	    	System.out.println("hasta la vista");
		 break;
	    default:
	     System.out.println("Error valor no valido");
	  }
		
	}

}
