package elementos;

public class Persona {
	private String name;
	private int edad;
	private Coche coche;

	public Persona() {}

	public Persona(String name, int edad) {
		this.name=name;
		this.edad=edad;
		this.coche=null;
	}
	public String imprimir(String name, int edad) {
		String imprimir=this.name+" ("+this.edad+")";
		return imprimir;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public void setedad(int edad) {
		this.edad=edad;
	}
	public String getname() {
		return this.name;
	}
	public int getedad() {
		return this.edad;
	}
	public void setcoche(Coche coche) {
		this.coche=coche;
	}
	public Coche getcoche() {
	return this.coche;
	}
	
	
}


