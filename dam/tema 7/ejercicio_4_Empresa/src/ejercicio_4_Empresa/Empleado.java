package ejercicio_4_Empresa;

import java.util.Objects;

public class Empleado {
	
	private String nombre;
	
	public Empleado () {}
	
	public Empleado(String nombre) {
		
		this.nombre = nombre;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.nombre + " es un objeto de la clase Empleado";
	}

	public static void add(Empleado E1) {
		// TODO Auto-generated method stub
		
	}

	
	
}

