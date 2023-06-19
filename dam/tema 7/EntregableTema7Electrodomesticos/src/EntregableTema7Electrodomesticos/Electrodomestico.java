package EntregableTema7Electrodomesticos;

public  class Electrodomestico {

	
	private int precio;
	private String color;
	private int peso;
	private char consumoEnergetico;
	
	private int precioDefecto=100;
	private String colorDefecto="blanco";
	private int pesoDefecto=5;
	private char consumoEnergeticoDefecto='F';
	
	
	public Electrodomestico() {
		
	}
	public Electrodomestico(int precio, int peso) {
		super();
		this.precio = precio;
		this.peso = peso;
		this.colorDefecto ="Blanco";
		this.consumoEnergeticoDefecto = 'F';
	}
	public Electrodomestico(int precio, String color, int peso, char consumoEnergetico) {
	
		this.precio = precio;
		this.color = color;
		this.peso = peso;
		this.consumoEnergetico = consumoEnergetico;
	}
	
	
	public Electrodomestico(int precioDefecto2, int pesoDefecto2, String colorDefecto2,
			char consumoEnergeticoDefecto2) {
	
	}
	//metodos
	public char comprobarConsumo(char consumoEnergetico) {
		consumoEnergetico=Character.toUpperCase(consumoEnergetico);
		if (consumoEnergetico=='A' && consumoEnergetico=='B' && consumoEnergetico=='C' && consumoEnergetico=='D' && consumoEnergetico=='E' && consumoEnergetico=='F') {
			return	this.consumoEnergetico=consumoEnergetico;
		}else {
			 return this.consumoEnergeticoDefecto;
		}
		
	}
	
	public String comprobarColor(String color) {
		
		if(color.equalsIgnoreCase("balco") && color.equalsIgnoreCase("negro") &&color.equalsIgnoreCase("rojo") && color.equalsIgnoreCase("azul") && color.equalsIgnoreCase("gris")) {
			return this.color=color;
		}else {
			return this.colorDefecto;
		}
	}
	   public  double precioFinal() {
	        int precioConsumo = 0;
	        int precioTamano = 0;

	       
	        if (consumoEnergetico == 'A') {
	            precioConsumo = 100;
	        }
	        if (consumoEnergetico == 'B') {
	            precioConsumo = 80;
	        }
	        if (consumoEnergetico == 'C') {
	        	precioConsumo = 60;
	        }
		            
		    if (consumoEnergetico == 'D') {
		        precioConsumo = 50;
		    }
	        if (consumoEnergetico == 'E') {
	            precioConsumo = 30;
	        }
	        if (consumoEnergetico == 'F') {
	            precioConsumo = 10;
	        }

	        if (peso >= 0 && peso < 20) {
	            precioTamano = 10;
	        }
	        if (peso >= 20 && peso < 50) {
	            precioTamano = 50;
	        }
	        if (peso >= 50 && peso < 80) {
	            precioTamano = 80;
	        }
	        if (peso >= 80) {
	            precioTamano = 100;
	         }

	        double precioFinal= precio + precioConsumo + precioTamano;
	        return precioFinal;
	   }
	
	//getters y setters
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public int getPrecioDefecto() {
		return precioDefecto;
	}
	public void setPrecioDefecto(int precioDefecto) {
		this.precioDefecto = precioDefecto;
	}
	public String getColorDefecto() {
		return colorDefecto;
	}
	public void setColorDefecto(String colorDefecto) {
		this.colorDefecto = colorDefecto;
	}
	public int getPesoDefecto() {
		return pesoDefecto;
	}
	public void setPesoDefecto(int pesoDefecto) {
		this.pesoDefecto = pesoDefecto;
	}
	public char getConsumoEnergeticoDefecto() {
		return consumoEnergeticoDefecto;
	}
	public void setConsumoEnergeticoDefecto(char consumoEnergeticoDefecto) {
		this.consumoEnergeticoDefecto = consumoEnergeticoDefecto;
	}
	
}
