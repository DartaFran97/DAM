package ejercicio_7_trabajador;

import java.util.Date;

public abstract class Trabajador {
	private String nombre;
	private String puesto;
	private String direccion;
	private int telefono;
	
	private String NSS;
	
	
	public Trabajador(String nombre, String puesto, String direccion, int telefono, String nSS) {
		
		this.nombre = nombre;
		this.puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
		
		NSS = nSS;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getNSS() {
		return NSS;
	}
	public void setNSS(String nSS) {
		NSS = nSS;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + ", telefono="
				+ telefono+ ", NSS=" + NSS + "]";
	}
	
	
	
	

}
