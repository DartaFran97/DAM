package EntregableTema7Electrodomesticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Electrodomestico[] Electrodomestic= new Electrodomestico[5];
		
		Electrodomestic [0]=new Lavadora(1000, 50);
		Electrodomestic [1]=new Lavadora(1000, 50);
		Electrodomestic [2]=new Televisor(200, 10);
		Electrodomestic [3]=new Electrodomestico(1000, "gris", 30, 'A');
		Electrodomestic [4]=new Lavadora(1000, 50);
		
		double precioTotal=0;
		double precioTV=0;
		double preciolavadora=0;
		
		for (int i=0;i<Electrodomestic.length;i++) {
			precioTotal+= Electrodomestic[i].precioFinal();
			if(Electrodomestic[i] instanceof Lavadora) {
				Lavadora l =(Lavadora)Electrodomestic[i];
				precioTV+= Electrodomestic[i].precioFinal();
			}
			if(Electrodomestic[i] instanceof Televisor) {
				Televisor t =(Televisor)Electrodomestic[i];
				preciolavadora+= Electrodomestic[i].precioFinal();
			
			}
		}
		
		System.out.println("precio total" + precioTotal);
		System.out.println("precio TV" + precioTV);
		System.out.println("precio lavadora" + preciolavadora);
	}
}

			
			
		
		
	


