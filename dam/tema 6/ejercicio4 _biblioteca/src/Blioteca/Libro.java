package Blioteca;

public class Libro {
	
	private String nombreLibro;
	private String autor;
	private int ejemplaresDisponibles;
	private int ejemplaresPrestados;
	
	public Libro() {}
	
	public Libro(String libro, String autor, int disponible, int prestados) {
		this.nombreLibro=libro;
		this.autor=autor;
		this.ejemplaresDisponibles=disponible;
		this.ejemplaresPrestados=prestados;
	}
	//GETTERS
	public String getLibro() {
		return this.nombreLibro;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getDisponibles() {
		return this.ejemplaresDisponibles;
	}
	public int getPrestados () {
		return this.ejemplaresPrestados;
	}
		
	//SETTERS
	public void setLibro(String libro){
		this.nombreLibro=libro;
	}
	public void setAutor (String autor) {
		this.autor=autor;
	}
	public void setDisponibles(int disponible) {
		this.ejemplaresDisponibles=disponible;
	}
	public void setPrestados(int prestados) {
		this.ejemplaresPrestados=prestados;	
	}
	
	//METODOS
	
	public boolean prestamo(int disponibles, int prestados) {
		boolean result=false;
		
		if (disponibles>0) {
			disponibles--;
			prestados++;
			result=true;
			
		}else {
			result=false;
		}
		return result;
	}
	
	public  boolean devolucion(int prestados,int disponibles) {
		boolean resultado=false;
		if (prestados>0) {
			prestados--;
			disponibles++;
			resultado = true;
		}else {
			resultado=false;
		}
		return resultado;
	}
}
	
	
	
	
	

	
	
