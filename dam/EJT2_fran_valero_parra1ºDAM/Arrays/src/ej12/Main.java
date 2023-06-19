package ej12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("introduzca el numero de comensales (1-5)");
		int numerocomensales=sc.nextInt();
		int menu1=0;
		int menu2=0;
		int menu3=0;
		int[] arraypedidos=new int[numerocomensales];
		
		
		if(numerocomensales>0 && numerocomensales<=5) {
		
			for(int i=0;i<arraypedidos.length;i++) {
				System.out.println("que menu va a tomar el comensal "+(i+1));
				arraypedidos[i]=sc.nextInt();
				
				if (arraypedidos[i]<=3&&arraypedidos[i]>=1) {
						
						if (arraypedidos[i]==1) {
							menu1++;
						}
						if (arraypedidos[i]==2) {
							menu2++;
						}
						if (arraypedidos[i]==3) {
							menu3++;
						}
			
		
				}else {
					System.out.println("el menu introducido no es valido.");
				}
				
			}
				
			for(int i=0;i<arraypedidos.length;i++) {
				System.out.println("el comensal "+(i+1)+" ha pedido el menu "+ arraypedidos[i]);
			}
				System.out.println("se han pedido "+menu1+" del menu 1");
				System.out.println("se han pedido "+menu2+" del menu 2");
				System.out.println("se han pedido "+menu3+" del menu 3");
		}else {
			System.out.println("introduzca un numero de comensales validos");
				
				
			}

		
		
		
		
		
	}

}
