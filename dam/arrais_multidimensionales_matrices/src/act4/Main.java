package act4;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r =new Random();
		
		System.out.println("introduzca la cantidad de filas que dispondra la matriz");
		int n=sc.nextInt();
		

		int[][] matriz=new int[n][5];
		int tamaño=matriz.length;
		
		for (int i=0; i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=r.nextInt(999);
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
