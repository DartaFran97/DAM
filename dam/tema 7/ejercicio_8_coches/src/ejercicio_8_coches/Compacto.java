package ejercicio_8_coches;

public class Compacto extends Vehiculo{
	
	private int nPuertas;
	private int nPasajeros;
	
	public Compacto(int id_motor, String marca, int ano, int precio, boolean stock, int pasajeros, int puertas) {
		super(id_motor, marca, ano, precio, stock);
		this.nPuertas=puertas;
		this.nPasajeros=pasajeros;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public int getnPasajeros() {
		return nPasajeros;
	}

	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}
	
	
	
	
	

}
