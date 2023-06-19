package ejercicio_4_Empresa;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		Empleado E1 = new Empleado("Eduardo");
		Empleado E2 = new Empleado("Pablo");
		Empleado E3 = new Empleado("Baltasar");
		Empleado E4 = new Empleado("Xusi");
		Empleado E5 = new Empleado("Joanot");
		
		ArrayList<Empleado> E= new ArrayList<Empleado>();
		
		E.add(E1);
		E.add(E2);
		E.add(E3);
		E.add(E4);
		E.add(E5);
		
		System.out.println(E.size());	
		
		E.remove(3);
		E.remove(E2);
		
		System.out.println(E.get(2));
		
		System.out.println(E.get(1).getNombre());
		
		System.out.println(E.size());
		
		E.clear();
		
		
		
	}

}
