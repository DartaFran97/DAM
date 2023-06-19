package ejercicio5_Cafetera;

public class Cafetera {
	
		private int capacidadMaxima;
		private int capacidadActual;

	public Cafetera() {}
	
	public Cafetera(int maxima) {
		this.capacidadMaxima=maxima;
	}
	public Cafetera(int maxima,int actual) {
		this.capacidadMaxima=maxima;
		this.capacidadActual=actual;
	}
	//getters 
	public double getMaxima() {
		return this.capacidadMaxima;
	}
	public double getActual() {
		return this.capacidadActual;
	}
	//setters
	public void setMaxima(int maxima) {
		this.capacidadMaxima=maxima;
	}
	public void setActual(int actual) {
		this.capacidadActual=actual;
	}
	//metodos
	
	public void llenarCafetera(int maxima, int actual) {
		setMaxima(maxima);
		setActual(actual);
		if (actual==0){	
			actual=maxima;
		}
	}
	public int llenarTaza(int actual) {
		
		int taza=100;
		actual-=taza;
		if (actual<taza) {
			taza=actual;
			actual-=taza;
			return taza;
		}else {
			setActual(actual);
		return taza;
		}
		
		
	}
	public void vaciarCafetera(int actual) {
		actual=0;
		setActual(actual);
		
	}
	public int agregarCafe(int actual,int cantidad) {
		actual+=cantidad;
		setActual(actual);
	return actual;
	}
}