package random_number;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int a = 0;
		String b;
		String c;
		
		System.out.println("piense un numero del 1 al 100 contesta solo si o no");
		
		a = r.nextInt(101);
		System.out.println(a + " ¿es el numero que has pensado?");
		b = sc.nextLine();
		
		while (b.equals("no")) {
			System.out.println("¿es mayor que " + a + "?");
			c = sc.nextLine();
			
			if (c.equals("si")){
				a = r.nextInt((101- a + 1) + a);
				System.out.println(a + " ¿es el numero que has pensado?");
				b = sc.nextLine();
			}else {
				a = r.nextInt((a- 1 + 1) + 1);
				System.out.println(a + " ¿es el numero que has pensado?");
				b = sc.nextLine();
				
				
				
			
		}
		
}
		System.out.println("ACERTE");		

}
}




	}

}
