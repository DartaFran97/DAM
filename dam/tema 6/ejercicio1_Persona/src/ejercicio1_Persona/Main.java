package ejercicio1_Persona;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("introduzca el nombre");
			String name=sc.nextLine();
			System.out.println("introduzca su edad");
			int edad=sc.nextInt();
			sc.nextLine();
			
			Persona p1=new Persona(name);
			p1.setedad(edad);
			
			System.out.println("introduzca el nombre");
			name=sc.nextLine();
			System.out.println("introduzca su edad");
			edad=sc.nextInt();
			sc.nextLine();
			
			Persona p2=new Persona(name);
			p2.setedad(edad);
			
			System.out.println("introduzca el nombre");
			name=sc.nextLine();
			System.out.println("introduzca su edad");
			edad=sc.nextInt();
			sc.nextLine();
			
			Persona p3=new Persona(name);
			p3.setedad(edad);
			System.out.println(p1.getname(name));
			System.out.println(p1.getedad(edad));
			System.out.println(p2.getname(name));
			System.out.println(p2.getedad(edad));
			System.out.println(p3.getname(name));
			System.out.println(p3.getedad(edad));
			int edadLuis=p2.getedad(edad);
			int edadPepe=p1.getedad(edad);
			int edadMaria=p3.getedad(edad);
			
			p2.setedad((edadLuis-edadMaria)+edadPepe);
			System.out.println(p1.getedad(edadPepe));
			System.out.println(p2.getedad(edadLuis));
			System.out.println(p3.getedad(edadMaria));
		
			
			
			
			
			
		
		
		
		
		
	}

}
