package bucles_Prog_For5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca el numero para el caculo de la serie de fibonacci");
		 int n = sc.nextInt();
		 int t1 = 1;
		 int f= 0;
		 int t2;
		 
		 for (int i = 1; i <= n; i++) {
			
		 t2 = f;
		 f = t1 + f;
		 t1 = t2;
		 System.out.println(t1);		
		
		 }	
	}

}
