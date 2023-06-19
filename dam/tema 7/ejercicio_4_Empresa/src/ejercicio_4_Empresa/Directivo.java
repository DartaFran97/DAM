package ejercicio_4_Empresa;
	
public class Directivo extends Empleado {

	
	

	public Directivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return getNombre() + " es un objeto de la clase Empleado --> directivo";
	}
	
}
