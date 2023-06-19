package ejercicio_4_Empresa;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return getNombre() + " es un objeto de la clase Empleado --> operario --> oficial";
	}
}
