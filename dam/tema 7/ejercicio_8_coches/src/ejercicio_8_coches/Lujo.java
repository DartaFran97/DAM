package ejercicio_8_coches;

public class Lujo extends Vehiculo{

	private int nPuertas;
	private int nPasajeros;
	
	public Lujo(int id_motor, String marca, int ano, int precio, boolean stock, int pasajeros, int puertas) {
		super(id_motor, marca, ano, precio, stock);
		this.nPuertas=puertas;
		this.nPasajeros=pasajeros;
	}

	public int getnPuertasLujo() {
		return nPuertas;
	}

	public void setnPuertasLujo(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public int getnPasajerosLujo() {
		return nPasajeros;
	}

	public void setnPasajerosLujo(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}
	
}
