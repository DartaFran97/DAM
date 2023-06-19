package bucles_Prog_For6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca el numero para el caculo de la serie de fibonacci");
		 int n1 = sc.nextInt();
		 int t1 = 1;
		 int f= 0;
		 int t2;
         int i = 0;
		 
         while(n1 != t1 && i < 1000000) {
			
		 t2 = f;
		 f = t1 + f;
		 t1 = t2;
		 i++;
		
		 }	
         if (n1 == t1) {
        	 System.out.println("el numero SI que pertenece a la serie de fibonacci");
         }else {
        	 System.out.println("el numero NO que pertenece a la serie de fibonacci");
        	 
         }
	}

}
