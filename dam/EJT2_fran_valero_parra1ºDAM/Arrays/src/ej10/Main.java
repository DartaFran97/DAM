package ej10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	String[] empleados=new String[10];
	int templeados=empleados.length;
	int[] sueldo=new int[10];
	int tsueldo=sueldo.length;
	String rico=" ";
	int maxsueldo=0;
	
	for(int i=0;i<templeados;i++) {
		System.out.println("introduzcal el nombre del empleado: ");
		empleados[i]=sc.nextLine();	
		System.out.println("introduzca el sueldo de "+empleados[i]);
		sueldo[i]=sc.nextInt();
		sc.nextLine();		
			
	}
	for(int i=0;i<tsueldo;i++) {
		if(i==0) {
			rico=empleados[i];
			maxsueldo=sueldo[i];
			
		}
		if(sueldo[i]>maxsueldo) {
			rico=empleados[i];
			maxsueldo=sueldo[i];
		}

		
	}
	System.out.println("el empleado que más cobra es "+rico+" y gana "+maxsueldo);
	
	}

}
