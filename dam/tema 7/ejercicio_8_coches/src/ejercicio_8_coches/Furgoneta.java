package ejercicio_8_coches;

public class Furgoneta extends Vehiculo {
	
	private int carga;
	private boolean traccion4Ruedas;
	private int nVentanasOpacas;
	private boolean asientoDesmontable;
	public Furgoneta(int id_motor, String marca, int ano, int precio, boolean stock, int carga, boolean traccion, boolean asiento, int ventanas) {
		super(id_motor, marca, ano, precio, stock);
		this.asientoDesmontable=asiento;
		this.carga=carga;
		this.traccion4Ruedas=traccion;
		this.nVentanasOpacas=ventanas;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean isTraccion4Ruedas() {
		return traccion4Ruedas;
	}
	public void setTraccion4Ruedas(boolean traccion4Ruedas) {
		this.traccion4Ruedas = traccion4Ruedas;
	}
	public int getnVentanasOpacas() {
		return nVentanasOpacas;
	}
	public void setnVentanasOpacas(int nVentanasOpacas) {
		this.nVentanasOpacas = nVentanasOpacas;
	}
	public boolean isAsientoDesmontable() {
		return asientoDesmontable;
	}
	public void setAsientoDesmontable(boolean asientoDesmontable) {
		this.asientoDesmontable = asientoDesmontable;
	}
	
	
	
	
	

}
