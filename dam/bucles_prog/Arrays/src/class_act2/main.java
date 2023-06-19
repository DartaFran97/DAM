package class_act2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("que cantidad de datos quiere insertar");
		int n=sc.nextInt();
		sc.nextLine();
		
		String name[]= new String[n];
		int edad[]= new int[n];
	
	for(int i=0; i<n ;i++) {
		System.out.println("introduzca el nombre " + i);
		name[i]=sc.nextLine();
		System.out.println("introduzca la edad " + i);
		edad[i]=sc.nextInt();
		sc.nextLine();
	
	}
		
	}
	
	}


