package ejercicio_8_coches;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vehiculo[] v=new Vehiculo[4];
		
		v[0]=new Furgoneta(123456,"peugeot",2022,1000,true,100,true,true,8);
		v[1]= new Sub(98765,"ford",2022,2000,true,2,3,true);
		v[2]=new Lujo(13579,"aston martin",2022,3000,true,4,5);
		v[3]=new Compacto(24680,"fiat",2022,5000,true,3,5);
		
		
		for (int i=0; i<v.length;i++) {
			System.out.println(v[i]);
			
			if(v[i] instanceof Furgoneta) {
				System.out.println(v[i]);
			}
			if(v[i] instanceof Sub) {
				System.out.println(v[i]);
			}
			if(v[i] instanceof Lujo) {
				System.out.println(v[i]);
			}
			if(v[i] instanceof Compacto) {
				System.out.println(v[i]);
			}
		}	
		
	}
}
