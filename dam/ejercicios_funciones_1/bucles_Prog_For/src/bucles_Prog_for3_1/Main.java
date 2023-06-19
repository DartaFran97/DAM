package bucles_Prog_for3_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int money = 0;
		int qui = 0;
		int dos = 0;
		int ci =0;
		int cinc = 0;
		int vein = 0;
		int die = 0;
		int cinco = 0;
		
		
		do {
		System.out.println("introduzca el dinero a calcular en billetes (multiplo de 5)");
		money = teclado.nextInt();
		
		}while (money < 0);
	
		if (money >= 500) {
		    qui = money / 500;
			money = money % 500;
		}
		
		if (money >= 200 && money < 500) {
			dos = money / 200;
			money = money % 200;
		}
		
		if (money >= 100 && money < 200) {
			ci = money / 100;
			money = money % 100;
		}
		
		if (money >= 50  && money < 100) {
			cinc = money / 50;
			money = money % 50;
		}
		
		if (money >= 20 && money < 50) {
			vein = money / 20;
			money = money % 20;
		}
		if (money >= 10 && money < 20) {
			die = money / 10;
			money = money % 10;
		}
		if (money >= 5 && money < 10) {
			cinco = money / 5;
			money = money % 5;
			
		}
		if (money < 5 && money > 0) {
			System.out.println(money + "€, cantidad solo disponible en monedas");
		}
			
		System.out.println(qui + " billetes de 500");
		System.out.println(dos + " billetes de 200");
		System.out.println(ci + " billetes de 100");
		System.out.println(cinc + " billetes de 50");
		System.out.println(vein + " billetes de 20");
		System.out.println(die + " billetes de 10");
		System.out.println(cinco + " billetes de 5");

	}
}
