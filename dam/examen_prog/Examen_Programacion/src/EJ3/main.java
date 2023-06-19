package EJ3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca su nuombre:");
		String nombre=sc.nextLine();
		System.out.println("Selecione un Idioma");
		System.out.println("1. Ingles");
		System.out.println("2. Frances");
		System.out.println("3. Italiano");
		System.out.println("4. Aleman");
		System.out.println("5. Salir");
		
		int seleccion=sc.nextInt();
	
		if (seleccion>=1&&seleccion<=4) {
			
			switch(seleccion) {
			
			case 1:
				System.out.println("Hello "+nombre);
				
				break;
			case 2:
				System.out.println("Bonjour "+nombre);
				
				break;
			case 3:
				System.out.println("Ciao "+nombre);
				
				
				break;
			case 4:
				System.out.println("Hallo "+nombre);
				
				break;
			
			}
		}else {
			System.out.println("ERROR introduzca un numero valido");
	
		}
		
}
}
