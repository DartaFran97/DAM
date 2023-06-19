package ej14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
	
		int[] array=new int[10];
		String continuar= "no";
		do {
			System.out.println("que desea hacer:");
			System.out.println("a. mostrar el array por pantalla, posición 0 al 9");
			System.out.println("b. introducir un valor");
			System.out.println("c. salir");
			String selec=sc.next();
		switch(selec){
			case "a":
				for(int i=0;i<array.length;i++) {
					System.out.print(array[i]+" ");
				}
			break;
			
			case "b":
				
				System.out.println("introduzca la popsición dentro del array");
				int posicion=sc.nextInt();
				System.out.println("introduzca el valor para la posición: "+posicion);
				int valor=sc.nextInt();
				sc.nextLine();
				if(posicion>=0&&posicion<10) {
					array[posicion]=valor;
				}
					
			break;
			
			case "c":
				System.out.println("desea continuar? si/no");
				continuar=sc.nextLine();
			break;
		
			default:
		}
		System.out.println("desea continuar? si/no");
		continuar=sc.nextLine();
		}while(continuar.equals("si"));
	
	
	
	
	
	
	}

}
