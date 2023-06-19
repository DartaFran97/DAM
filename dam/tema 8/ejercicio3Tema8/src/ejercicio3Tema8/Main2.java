package ejercicio3Tema8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		int valor=0;
		
		for(int i=0; i<10;i++) {
			
			System.out.println("introduzca un numeroi entero");
			valor=sc.nextInt();
			numeros.add(valor);
			
		}
		System.out.println(numeros);
		Collections.sort(numeros);
		System.out.println(numeros);

	}

}
