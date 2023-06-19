package act6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int rep = 0;
		int pis = 0;
		String conti;
		
		do {
		System.out.println("introduzca un numero del 1 al 99");
		num = sc.nextInt();
		if (num<100 && num>0) {
			for (pis=1; pis<=num; pis++) {
				for(rep=1; rep<=pis; rep++) {
				System.out.print(pis);
		}
			System.out.println(" ");
	 }
		System.out.println("¿desea continuar?");
		sc.nextLine();
		conti=sc.nextLine();
		
		}else{
			System.out.println("ERROR introduzca un numero entre 1 y 99");
			System.out.println("¿desea continuar?");
			sc.nextLine();
			conti=sc.nextLine();
	
	}
		}while (conti.equals("si"));
}

}
