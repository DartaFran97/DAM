package ej2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int columnas=0;
		int filas=0;
		
		
		System.out.println("introduca la capacidad de las matrices 1 y 2");
		System.out.println("introduzca el numero de filas");
		filas=sc.nextInt();
		System.out.println("introduzca el numero de columnas");
		columnas=sc.nextInt();
		
		int[][] matriz1=new int[filas][columnas];
		int[][] matriz2=new int[filas][columnas];
		int[][] matrizsuma=new int[filas][columnas];
		
		System.out.println("valores de la primera matriz");
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[i].length;j++) {
				System.out.println("introduzca el valor de la fila "+i+" y la columna: "+j);
				matriz1[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("valores de la segunda matriz");
		for(int i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2[i].length;j++) {
				System.out.println("introduzca el valor de la fila "+i+" y la columna: "+j);
				matriz2[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("matriz 1");
		for(int i=0;i<matriz1.length;i++) {
			System.out.println(" ");
			for(int j=0;j<matriz1[i].length;j++) {
				System.out.print(matriz1[i][j]+" ");
				
			}
		}
		System.out.println();
		System.out.println("matriz 2");
		for(int i=0;i<matriz2.length;i++) {
			System.out.println(" ");
			for(int j=0;j<matriz2[i].length;j++) {
				System.out.print(matriz2[i][j]+" ");
				
			}
		}
		System.out.println();
		System.out.println("suma de matrices");
		
		for(int i=0;i<matrizsuma.length;i++) {
			for(int j=0;j<matrizsuma[i].length;j++) {
				matrizsuma[i][j]=matriz1[i][j]+matriz2[i][j];
				System.out.print(matrizsuma[i][j]+" ");
			}
			System.out.println();
		}
		if (columnas==3) {
			System.out.println("suma de columnas");
			int sumacolumna=0;
			for(int j=0;j<1;j++) {	
				for(int i=0;i<matriz1[1].length;i++) {
					sumacolumna+=matriz1[i][1];
				}
			}
			System.out.println("el resultado del la suma de los elementos de la columna central de la matriz 1 es:"+ sumacolumna);
			
			int sumacolumna2=0;
			for(int j=0;j<1;j++) {	
				for(int i=0;i<matriz2[1].length;i++) {
					sumacolumna2+=matriz2[i][1];
				}
			}
			System.out.println("el resultado del la suma de los elementos de la columna central de la matriz 2 es:"+ sumacolumna2);
		}
		if(filas==3) {
			System.out.println("suma de filas");
			int sumafila=0;
			for(int i=0;i<1;i++) {
				for(int j=0;j<matriz1[1].length;j++) {
					sumafila+=matriz1[1][j];	
				}
				
			}
			System.out.println("el resultado del la suma de los elementos de la  fila central de la matriz 1 es:"+ sumafila);
			
			int sumafila2=0;
			for(int i=0;i<1;i++) {
				for(int j=0;j<matriz2[1].length;j++) {
					sumafila2+=matriz2[1][j];	
				}
				
			}
			System.out.println("el resultado del la suma de los elementos de la  fila central de la matriz 2 es:"+ sumafila2);
		}
	
	}

}
