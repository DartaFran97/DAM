package ejercicio_4_Empresa;

public class Operario extends Empleado {
	
	


	public Operario(String nombre) {
		super(nombre);
		
	}

	@Override
	public String toString() {
		
		return getNombre() + " es un objeto de la clase Empleado --> operario";
	}
}