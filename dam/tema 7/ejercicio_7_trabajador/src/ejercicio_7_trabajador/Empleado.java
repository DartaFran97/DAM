package ejercicio_7_trabajador;

import java.util.Date;

public class Empleado extends Trabajador{
	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, String direccion, int telefono, String nSS, double sueldo,double impuestos) {
		super(nombre, puesto, direccion, telefono, nSS);
		this.impuestos=impuestos;
		this.sueldo=sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
		
	}
	public double calcularPagar() {
		this.sueldo=15000;
		int pagas =14;
		this.impuestos=(this.sueldo*0.3);
		this.sueldo-= this.impuestos/pagas;
		return this.sueldo;
	}
}
