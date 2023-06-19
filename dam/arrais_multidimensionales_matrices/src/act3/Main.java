package act3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca la cantidad de filas que dispondra la matriz");
		int n=sc.nextInt();
		System.out.println("introduzca la cantidad de columnas de la matriz");
		int m=sc.nextInt();
		
		int[][] matriz=new int[n][m];
		int tamaño=matriz.length;
		
		for (int i=0; i<matriz.length;i++) {
			System.out.println("introduzca "+m+" numeros");
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=sc.nextInt();
			}
		}
		for (int i=0; i<matriz.length;i++) {
			System.out.println(" ");
			for(int j=0;j<matriz[i].length;j++) {
			System.out.print(matriz[i][j]+" ");
			}
		}	
		
	
	}

}
