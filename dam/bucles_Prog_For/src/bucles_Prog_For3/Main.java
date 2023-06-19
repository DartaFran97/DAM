package bucles_Prog_For3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double edad;
		double alt;
		double medad =0;
		double malt = 0;
		double sedad = 0;
		double salt = 0;
		double mayor = 0;
		double altur = 0;
		
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("introduce la edad");
			edad = teclado.nextDouble();
			sedad = sedad + edad;
			
			System.out.println("introduce la estatura");
			alt = teclado.nextDouble();
			salt = salt + alt;
				
			medad = sedad / 5;
			malt = salt / 5;
			
			if (edad >= 18) {
				mayor++;
			}
			if (alt >= 1.75) {
				altur++;
			}
		}
		
		System.out.println("la media de edad es de:" + medad);
		System.out.println("la media de altura es de:" + malt);
		System.out.println("el total de personas mayoers de edad es: " + mayor);
		System.out.println("el total de personas con más de 1,75 " + altur);
	}

}
