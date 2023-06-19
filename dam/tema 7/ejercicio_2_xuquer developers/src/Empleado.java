/**
 * esta clase es Empleado y es la clase madre de Programador
 * @author franv
 *@version 08/02/23
 */
public class Empleado {

	private String nombre;
	private String dni;
	private int edad;
	private boolean casado;
	private double salario;
	/**
	 * este es un constructor vacio
	 */
	public Empleado () {}
	
	/**
	 * este es un contructor parametrizado
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param casado
	 * @param salario
	 */
	public Empleado (String nombre,int edad,String dni,boolean casado,double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
		this.casado=casado;
		this.salario=salario;
	}
/**
 * getter del nombre
 * @return nombre
 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * setter del nombre
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * getter del dni
	 * @return dni
	 */
	public String getDni() {
		return this.dni;
	}
	/**
	 * setter del dni
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * getter del edad
	 * @return edad
	 */
	public int getEdad() {
		return this.edad;
	}
	/**
	 * setter de la edad
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * getter de casado
	 * @return casado
	 */
	public boolean isCasado() {
		return this.casado;
	}
	/**
	 * setter de casado
	 * @param casado
	 */
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	/**
	 * getter del salario
	 * @return salario
	 */
	public double getSalario() {
		return this.salario;
	}
	/**
	 * setter del salario
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * metodo para imprimir los datos
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param casado
	 * @param salario
	 */
	public void mostratDatos(String nombre,int edad,String dni,boolean casado,double salario) {
		
		System.out.println(" empleado: "+ this.getNombre()+" edad:" + this.getEdad() +" con DNI: "+ this.getDni()+" casado: "+this.isCasado()+" con salario: "+this.salario);                          
	}
	/**
	 * metodo del aumento del salario
	 * @param porcentage
	 * @return
	 */
	public double aumentoSalario(int porcentage) {
		double salario = this.salario;
		double aux= (salario/100)*porcentage;
		salario+=aux;
		
		return salario;
	
	}
	
}
