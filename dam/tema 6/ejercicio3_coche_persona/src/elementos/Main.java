package elementos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Persona a=crearPersona();
		Persona b=crearPersona();
		Persona c=crearPersona();
		
		Coche f=crearCoche();
		Coche g=crearCoche();
		
		a.setcoche(g);
		b.setcoche(g);
		c.setcoche(f);
		
	}
	public static  Coche crearCoche() {
		Scanner sc =new Scanner(System.in);
		System.out.println("su marca de coche");
		String coche=sc.nextLine();
		System.out.println("introduzca el modelo de su vehiculo");
		String modelo=sc.nextLine();
		System.out.println("introduzca el color de su modelo");
		String color=sc.nextLine();
		
		Coche d=new Coche(coche, modelo, color);
		return d;
	}
	public static Persona crearPersona() {
		Scanner sc =new Scanner(System.in);
		System.out.println("introduce el nombre de la 1º persona");
		String nombre =sc.nextLine();
		System.out.println("introduce el nomb de la 1º persona");
		int edad =sc.nextInt();
		
		Persona a=new Persona(nombre, edad);
		return a;
	}
}

