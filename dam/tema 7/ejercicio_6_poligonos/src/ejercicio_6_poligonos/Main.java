package ejercicio_6_poligonos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Triangulo t=new Triangulo(3,10,7,8);
		Rectangulo r= new Rectangulo(10,5,4);
		
		System.out.println(t.toString());
		System.out.println(r.toString());
	}

}
