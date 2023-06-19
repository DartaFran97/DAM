package ejercicio1_Persona;

	public class Persona {

	private String name;
	private int edad;
	

	public Persona() {}

	public Persona(String name) {
		this.name=name;
		this.edad=0;
	}
	public String imprimir(String name, int edad) {
		String imprimir=this.name+this.edad;
		return imprimir;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public void setedad(int edad) {
		this.edad=edad;
	}
	public String getname(String name) {
		return this.name;
	}
	public int getedad(int edad) {
		return this.edad;
	}
	
}
