package EntregableTema7Electrodomesticos;

public class Lavadora extends Electrodomestico {

	public int carga;
	public int cargaDefecto =5;
	
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getCargaDefecto() {
		return cargaDefecto;
	}

	public void setCargaDefecto(int cargaDefecto) {
		this.cargaDefecto = cargaDefecto;
	}

	public Lavadora() {
		
	}

	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.cargaDefecto=5;
	}

	public Lavadora(int precioDefecto, int pesoDefecto, String colorDefecto, char consumoEnergeticoDefecto, int carga) {
		super(precioDefecto,pesoDefecto,colorDefecto,consumoEnergeticoDefecto);
		this.carga=carga;
	}
	@Override
	public double precioFinal() {
		
		if (carga>30) {
			return super.precioFinal()+50;
		}else {
			return super.precioFinal();
		}
		
	}
	
	
	
	
	
	
	
	
}
