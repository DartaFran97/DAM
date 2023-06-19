package EJ1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca el numero de espectadores a analizar ");
		int numeroespectadores=sc.nextInt();
		
		int[] hijos=new int[numeroespectadores];
		double[] dinero= new double[numeroespectadores];
		int maxhijos=0;
		int mediahijos=0;
		int conthijos=0;
		int resultadomediahijos=0;
		
		for(int i=0;i<hijos.length;i++){
			System.out.println("introduzca el numero de hijos del espectador "+(i+1));
			hijos[i]=sc.nextInt();
			if(i==0) {
				maxhijos=hijos[i];
				
			}
			if(hijos[i]>maxhijos) {
				maxhijos=hijos[i];
			}
			if(hijos[i]>=3) {
				conthijos++;
			}
		}
		for(int i=0;i<hijos.length;i++){
				mediahijos+=hijos[i];
			}
		resultadomediahijos=mediahijos/numeroespectadores;
		
		double mediadinero=0;
		double contdinero=0;
		double resultadomediadinero=0;
		
		for(int i=0;i<dinero.length;i++){
			System.out.println("introduzca el dinero del espectador "+(i+1));
			dinero[i]=sc.nextInt();
			
			if(dinero[i]>=25) {
				contdinero++;
			}
		}
		for(int i=0;i<hijos.length;i++){
				mediadinero+=dinero[i];
			}
		resultadomediadinero=mediadinero/numeroespectadores;
		
		System.out.println("la cantidad media de dinero es: "+resultadomediadinero);
		System.out.println("la cantidad media de hijos es: "+resultadomediahijos);
		System.out.println("la cantidad de espectadores con más de 3 hijos es: "+conthijos);
		System.out.println("la cantidad de espectadores con más de 25€ es: "+contdinero);
		System.out.println("el espectador con más hijos tiene: "+maxhijos);
	}

}
