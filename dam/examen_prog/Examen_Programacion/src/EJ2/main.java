package EJ2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("introduzca un numero:");
		int numero=sc.nextInt();
		
		int[] arraynumero=new int[numero];
		int[] numeros9=new int[numero];
		int[] numerosimpar=new int[numero];
		int contadorpar=0;
		
		for(int i=1; i<arraynumero.length;i++) {
			arraynumero[i]=i;
			if(arraynumero[i]%2==0) {
				contadorpar++;
			}else {
				numerosimpar[i]=arraynumero[i];
			}
			if (arraynumero[i]%10==9) {
				numeros9[i]=arraynumero[i];
			}
		}
		
		System.out.println("la secuencia de numeros");
		for(int i=1; i<arraynumero.length;i++) {
			System.out.print(arraynumero[i]+" ");
			
		}
		System.out.println("los numeros primos de la secuencia son: ");
		for(int i=1; i<arraynumero.length;i++) {
			System.out.print(numerosimpar[i]+" ");
			
		}
		System.out.println("los numeros que acaban en 9 son: ");
		for(int i=1; i<arraynumero.length;i++){
			System.out.print(numeros9[i]+" ");
		
		}
		
	}

}
