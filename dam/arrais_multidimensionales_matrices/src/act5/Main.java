package act5;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int[][] matriz=new int[10][10];
		int tamaño=matriz.length;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=r.nextInt(999);
			}
		}	
	System.out.println("escoja una de las siguientes opciones");
	System.out.println("1. Mostrar la matriz");
	System.out.println("2. Sumar una fila determinada");
	System.out.println("3. Sumar un acolumna determinada");
	System.out.println("4. Salir");

	int a=sc.nextInt();
	   switch (a){
	   case 1:
		   
		   for(int i=0;i<matriz.length;i++) {
			   System.out.println(" ");
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j]+" ");
				}
			}	
		   break;
	   
	   case 2:
		   int nfil=0;
		   int sumfil=0;
		   System.out.println("escriba el numero de fila que desea sumar");
		   nfil=sc.nextInt();
		   for(int i=0;i<matriz[nfil].length;i++) {
			  sumfil=sumfil+matriz[nfil][i];
			  	System.out.print(matriz[nfil][i]+" ");
		   }
		   System.out.println("el total de la fila es " + sumfil);
		   break;
		   
	   case 3:
		   int ncol=0;
		   int sumcol=0;
		   System.out.println("escriba el numero de fila que desea sumar");
		   nfil=sc.nextInt();
		   for(int i=0;i<matriz[ncol].length;i++) {
			  sumcol=sumcol+matriz[i][ncol];
			  System.out.println(matriz[i][ncol]);
		   }
		   System.out.println("el total de la columna es " + sumcol);
		   break;
		   
	   case 4:
		   System.out.println("hasta la vista :)");
		   break;
	   
	   default:}
	   
	   
		
	
	
	}
	
}

