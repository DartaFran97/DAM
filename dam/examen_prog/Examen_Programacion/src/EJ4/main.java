package EJ4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int numero1=0;
		int numero2=0;
		int factorialj=1;
		
		System.out.println("bienvenido piensa 2 numeros: ");
		System.out.println("introduzca el pimer numero, el menor ");
		numero1=sc.nextInt();
		System.out.println("introduzca el segundo numero, el mayor ");
		numero2=sc.nextInt();
		
		
	for (int i=numero1; i<=numero2;i++) {
		for(int j=i;j>=1;j--) {
			factorialj=factorialj*j;
			System.out.print(j+" x ");
			
		}
		for(int j=1;j>=1;j--) {
			System.out.print("="+factorialj);
		}
		factorialj=1;
		System.out.println();
	}
		
	}

}
