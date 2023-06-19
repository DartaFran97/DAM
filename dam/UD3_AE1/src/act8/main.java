package act8;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numerofilas=0;
		int altura=0;
		int espacio=0;
		int star=0;
		
		System.out.println("introduce el numero de filas de la piramide");
		numerofilas=sc.nextInt();
		
		for(altura=1;altura<=numerofilas; altura++) {
			for(espacio=1; espacio<=(numerofilas-altura);espacio++) {
				System.out.print(" ");
			}
			for(star=1; star<=(altura*2)-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}		
		
}


		
		
	


