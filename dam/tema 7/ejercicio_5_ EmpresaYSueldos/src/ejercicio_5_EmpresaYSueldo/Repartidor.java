package ejercicio_5_EmpresaYSueldo;

public class Repartidor extends Empleado{

	private String ruta;
	
	public Repartidor(String nombre, int edad, double salario, String ruta) {
		super(nombre, edad, salario);
		this.ruta=ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String toStringRepartidor() {
		return "Repartidor en la ruta" + getRuta() + " nombre: " + getNombre() + " edad: "
				+ getEdad() + "salario" + getSalario()+ "total plus"+getPlus()+"total salario "+ getSueldoRepartidor() ;
	}
	public double getSueldoRepartidor() {
		double sueldo=this.getSalario();
		
		if (this.getEdad()<25 && this.ruta.equalsIgnoreCase("zona 3")) {
			sueldo=getSalario()+getPlus();
		}
		return sueldo;
	}
	
	
}
