package ejercicio_7_trabajador;

import java.util.Date;

public class Consultor extends Trabajador {
	
	private int horas;
	private double impuestos;
	
	public Consultor(String nombre, String puesto, String direccion, int telefono, int horas,double impuestos, String nSS) {
		super(nombre, puesto, direccion, telefono, nSS);
		
		this.horas=horas;
		this.impuestos=impuestos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", impuestos=" + impuestos + "]";
	}
	public double calcularPagar() {
		int tarifas=10;
		double sueldo= this.horas*tarifas;
		int pagas =14;
		this.impuestos=(sueldo*0.3);
		sueldo-= this.impuestos/pagas;
		return sueldo;
	}
	
	

}
