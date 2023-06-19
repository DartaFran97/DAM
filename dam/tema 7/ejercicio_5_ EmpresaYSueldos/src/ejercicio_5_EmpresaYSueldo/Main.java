package ejercicio_5_EmpresaYSueldo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			Empleado[] array=new Empleado[2];
			
			for(int i=0;i<array.length;i++) {
				
				System.out.println("introduzca el nombre del comercial");
				String nombre=sc.nextLine();
				System.out.println("introduzca la edad");
				int edad=sc.nextInt();
				System.out.println("introduzca el salario del comercial");
				double salario=sc.nextDouble();
				System.out.println("que empleado va a introducir:");
				System.out.println("1-comerrcial");
				System.out.println("2-repartidor");
				int tipoEmpleado=sc.nextInt();
				
				if (tipoEmpleado==1) {
				
					array[i]=generadorComercial(nombre, edad, salario);
				}
				if (tipoEmpleado==2) {
					array[i]=generadorRepartidor(nombre, edad, salario);
					
				}
				
			}
			
			for(int i=0;i<array.length;i++) {
				if (array[i] instanceof Comercial) {
					Comercial c=(Comercial)array[i];
					System.out.println(c.toStringComercial());
				}
				if (array[i] instanceof Repartidor) {
					Repartidor r=(Repartidor)array[i];
					System.out.println(r.toStringRepartidor());
				}
			}
		
	}
	public static Comercial generadorComercial(String nombre, int edad, double salario) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca que comisión se ha llevado");
		double comision=sc.nextDouble();
		
		
		Comercial c=new Comercial(nombre, edad, salario,comision);
		return c;
	}
	public static Repartidor generadorRepartidor(String nombre, int edad, double salario) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca que ruta tiene el repartidor");
		String ruta=sc.nextLine();
		
		Repartidor r=new Repartidor(nombre, edad, salario, ruta);
		return r;
	
	}
	
}
