package ejer_fun13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("introduzca el limite inferior de la secuencia a determinar");
		 int limite_inferior=sc.nextInt();
		 System.out.println("introduzca el limite superior de la secuencia a determinar");
		 int limite_superior=sc.nextInt();
		 System.out.println("el producto de la secuencia es: "+generador_productos(limite_inferior,limite_superior));
		 

	}
	public static int generador_productos(int limite_inferior, int limite_superior) {
		int producto=1;
		for (int i=limite_inferior;i<=limite_superior;i++) {
			producto*=limite_inferior;
			limite_inferior++;
		}
	return producto;
	}
}
	
