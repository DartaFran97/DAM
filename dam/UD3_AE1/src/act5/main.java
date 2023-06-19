package act5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int star = 0;
		
		System.out.println("introduzca un numero");
		num = sc.nextInt();
		if(num>=0) {
			
		do {
			
			System.out.print("*");
		     star++;
		}while (star <= num);
		
		}else {
			System.out.print("*");
		}

	}

}
