package ejercicio_8_coches;

public abstract class  Vehiculo {
	
	public int id_motor;
	public String marca;
	public int ano;
	public int precio;
	public boolean stock;
	
	public Vehiculo(int id_motor, String marca, int ano, int precio, boolean stock) {
		super();
		this.id_motor = id_motor;
		this.marca = marca;
		this.ano = ano;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId_motor() {
		return id_motor;
	}

	public void setId_motor(int id_motor) {
		this.id_motor = id_motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	

}
