package lecturaEscrituraFicheros;

public class superHeroe {

	private String nombre;
	private String raza;
	
	private String sexo;
	private String colorOjos;
	private double altura;
	private String publicador;
	private String alimento;
	
	

	public superHeroe(String nombre, String raza, String sexo, String colorOjos, double altura,
			String publicador, String alimento) {
	
		this.nombre = nombre;
		this.raza = raza;
		
		this.sexo = sexo;
		this.colorOjos = colorOjos;
		this.altura = altura;
		this.publicador = publicador;
		this.alimento = alimento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public String getPublicador() {
		return publicador;
	}

	public void setPublicador(String publicador) {
		this.publicador = publicador;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	
}
