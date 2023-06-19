package EntregableTema7Electrodomesticos;

public class Televisor extends Electrodomestico {

	private boolean smatTv;
	private boolean smatTvDefecto=false;
	private int pulgadas;
	private int pulgadasDefecto=20;
	
	public Televisor() {}

	public Televisor(int precioDefecto, String colorDefecto, int pesoDefecto, char consumoEnergeticoDefecto) {
		super(precioDefecto, colorDefecto, pesoDefecto, consumoEnergeticoDefecto);
	this.pulgadasDefecto=20;
	this.smatTvDefecto=false;
	}

	public Televisor(int precio, int peso) {
		super(precio, peso);
		this.pulgadasDefecto=20;
		this.smatTvDefecto=false;
	}

	public Televisor(int precio, int peso, String color, char consumoEnergetico, int pulgadas, boolean smartTv) {
		super(precio, peso, color, consumoEnergetico);
		this.pulgadas=pulgadas;
		this.smatTv=smartTv;
		
	}

	public boolean isSmatTv() {
		return smatTv;
	}

	public void setSmatTv(boolean smatTv) {
		this.smatTv = smatTv;
	}

	public boolean isSmatTvDefecto() {
		return smatTvDefecto;
	}

	public void setSmatTvDefecto(boolean smatTvDefecto) {
		this.smatTvDefecto = smatTvDefecto;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public int getPulgadasDefecto() {
		return pulgadasDefecto;
	}

	public void setPulgadasDefecto(int pulgadasDefecto) {
		this.pulgadasDefecto = pulgadasDefecto;
	}
	@Override
	public double precioFinal() {
		double incremento=0;
		if (this.smatTv==true) {
			return (super.precioFinal()+50);
		}
		if (this.pulgadas>40) {
			 incremento=super.precioFinal()*0.3;
			 return incremento+super.precioFinal();
		}else {
			return super.precioFinal();
		}
		
	}
	
	
	
	
}
