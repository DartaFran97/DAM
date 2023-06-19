package elementos;

public class Coche {
	
	private String marca;
	private String modelo;
	private String color;
	
	//constructores
	
	public Coche(String marca, String modelo, String Color) {
		this.marca=marca;
		this.color=color;
		this.modelo=modelo;
	}
	
	//getters
	
	public String getmarca() {
		return this.marca;
	}
	public String getcolor() {
		return this.color;
		
	}
	public String getmodelo() {
		return this.modelo;
	}
	
	//setters
	
	public void setmarca(String marca) {
		this.marca=marca;
	}
	public void setcolor(String color) {
		this.color=color;	
	}
	public void setmodelo(String modelo) {
		this.modelo=modelo;
	}
	
}
