package ejercicio_8_coches;

public class Sub extends Vehiculo {

	private int traccion;
	private int ventanasOpacas;
	private boolean asientosDesmontables;
	public Sub(int id_motor, String marca, int ano, int precio, boolean stock, int traccion, int ventanasOpacas, boolean asientosDesmontables) {
		super(id_motor, marca, ano, precio, stock);
		this.traccion=traccion;
		this.asientosDesmontables=asientosDesmontables;
		this.ventanasOpacas=ventanasOpacas;
	}
	public int getTraccion() {
		return traccion;
	}
	public void setTraccion(int traccion) {
		this.traccion = traccion;
	}
	public int getVentanasOpacas() {
		return ventanasOpacas;
	}
	public void setVentanasOpacas(int ventanasOpacas) {
		this.ventanasOpacas = ventanasOpacas;
	}
	public boolean isAsientosDesmontables() {
		return asientosDesmontables;
	}
	public void setAsientosDesmontables(boolean asientosDesmontables) {
		this.asientosDesmontables = asientosDesmontables;
	}
	
	
	
}
