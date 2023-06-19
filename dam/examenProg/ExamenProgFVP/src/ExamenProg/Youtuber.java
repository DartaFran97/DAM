package ExamenProg;

public class Youtuber {

	private String nombre;
	
	private String NickName;
	
	private int Edad;
	
	private char TipContenido;
	
	private int puntos;

	public Youtuber(String nombre, String nickName, int edad, char tipContenido, int puntos) {
		super();
		this.nombre = nombre;
		NickName = nickName;
		Edad = edad;
		TipContenido = tipContenido;
		this.puntos = puntos;
	}

	public Youtuber() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public char getTipContenido() {
		return TipContenido;
	}

	public void setTipContenido(char tipContenido) {
		TipContenido = tipContenido;
	}

	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos=puntos;
	}

	
	//sumar y restar puntos
	public boolean sumarPuntos(int puntos) {
		boolean Validacion=false;
		if ((this.puntos += puntos)>0 && (this.puntos += puntos)<100 ) {
			this.puntos += puntos;
			Validacion=true;
		}else {
			Validacion=false;
		}
		return Validacion;
	}
	
	public boolean RestarPuntos(int puntos) {
		boolean Validacion=false;
		if ((this.puntos -= puntos)>0 && (this.puntos -= puntos)<100 ) {
			this.puntos -= puntos;
			Validacion=true;
		}else {
			Validacion=false;
		}
		return Validacion;
	}
}
	
	
	

