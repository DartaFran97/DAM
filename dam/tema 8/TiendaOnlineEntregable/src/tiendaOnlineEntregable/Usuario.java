package tiendaOnlineEntregable;

public class Usuario {
	
	private int idUsuario;
	private String dni;
	private String nombreUsuario;
	private String tipo;
	
	
	public Usuario(int idUsuario, String dni, String nombreUsuario, String tipo) {
		super();
		this.idUsuario = idUsuario;
		this.dni = dni;
		this.nombreUsuario = nombreUsuario;
		this.tipo = tipo;
	}

	public Usuario (String dni, String nombre) {
		this.dni = dni;
		this.nombreUsuario = nombre;
	}

	public int getIdUsser() {
		return idUsuario;
	}

	public void setIdUsser(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreUsser() {
		return nombreUsuario;
	}

	public void setNombreUsser(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
