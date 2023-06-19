package ejercicio1Parte2Biblioteca;

public class Libro {
	
	private int id_libro;
	private String ISBN;
	private String titulo;
	private String Autor;
	private int numeroPaginas;
	private Character tematica;
	private int estado;
	
	
	public Libro() {
		super();
	}


	public Libro(int id_libro, String iSBN, String titulo, String autor, int numeroPaginas, Character tematica,
			int estado) {
		super();
		this.id_libro = id_libro;
		ISBN = iSBN;
		this.titulo = titulo;
		Autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.tematica = tematica;
		this.estado = estado;
	}


	public int getId_libro(int idLibro) {
		return id_libro;
	}


	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return Autor;
	}


	public void setAutor(String autor) {
		Autor = autor;
	}


	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	public Character getTematica() {
		return tematica;
	}


	public void setTematica(Character tematica) {
		this.tematica = tematica;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
