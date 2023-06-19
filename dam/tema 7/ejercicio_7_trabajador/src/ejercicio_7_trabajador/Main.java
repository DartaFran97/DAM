package ejercicio_7_trabajador;

public class Main {

	public static void main(String[] args) {
		
		Trabajador[] arrayTrabajador=new Trabajador[4];
		
		arrayTrabajador[0]=new Empleado("paco","Empleado","calle 3",987654321,"ss123",1000.50, 30);
		arrayTrabajador[1]=new Consultor("pepe","consultor","calle 2", 123456789, 1000, 30,"ss12345");
		
		
		for(int i=0;i<arrayTrabajador.length;i++) {
			
			if (arrayTrabajador[i] instanceof Empleado) {
				Empleado e1=(Empleado)arrayTrabajador[i];
				System.out.println(e1.calcularPagar());
				System.out.println(e1.toString());
			}
			if (arrayTrabajador[i] instanceof Consultor) {
				Consultor c1=(Consultor)arrayTrabajador[i];
				System.out.println(c1.calcularPagar());
				System.out.println(c1.toString());
			}
		}
		
	}

}
