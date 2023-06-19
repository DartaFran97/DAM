package ejercicio6_Cancion;

public class Cancion {
	
	private String titulo;
	private String autor;
	
	public Cancion() {}

	public Cancion(String titulo,String autor) {
		this.autor=autor;
		this.titulo=titulo;
		
	}
	//getters
	
	
	public String getAutor() {
		return this.autor;
		
	}
	public String getTitulo() {
		return this.titulo;
		
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	//metodos
	
	public String cancionCompelta(String titulo,String autor) {
		return "la canción es de "+autor+" y se llama "+titulo;
	}
}
