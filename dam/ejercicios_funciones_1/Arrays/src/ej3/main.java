package ej3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	double[] notas;
	int nalum;
	double mgrupo;
	double sumnotas =0;
	
	System.out.println("¿cuantos alumnos hay en clase?");
	nalum=sc.nextInt();
	notas=new double[nalum];
	int tamaño= notas.length;
	
	for(int i=0;i<nalum;i++) {
		System.out.println("introduzca la nota del alumno " + i);
		notas[i]=sc.nextDouble();
		sumnotas += notas[i];
	}
	mgrupo=sumnotas/nalum;
	System.out.println("la media del grupo es " + mgrupo);
	
	for(int i = 0; i<notas.length;i++) {
		if(notas[i]>mgrupo) {
			System.out.println(notas[i] + " es superior a la media");
		}
	}

	}

}
