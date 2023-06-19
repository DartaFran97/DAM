package ejercicio_5_EmpresaYSueldo;

public class Comercial extends Empleado {

	private double comision;
	
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision=comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public String toStringComercial() {
		return "Comecial nombre: " + getNombre() + " edad: "
				+ getEdad() + "salario" + getSalario()+ "con una comisión de "+ getComision()+ "total plus"+getPlus()+"total salario "+ getSueldoComercial();
	}
	public double getSueldoComercial() {
		double sueldo=this.getSalario();
		
		if (this.getEdad()>30 && this.comision>200) {
			sueldo=getSalario()+getPlus();
		}
		return sueldo;
	}
}
