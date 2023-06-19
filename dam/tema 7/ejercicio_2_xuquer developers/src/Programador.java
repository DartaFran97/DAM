	/**
	 * esta clase es Empleado y es la clase madre de Programador
	 * @author franv
	 *@version 08/02/23
	 */
public class Programador extends Empleado {

	private int nLineasXHora;
	private String lenguajeDominante;
	
	/**
	 * getter lenguaje programación
	 * @return lenguajeDominante
	 */
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	/**
	 * setter de lenguaje de programación
	 * @param lenguajeDominante
	 */
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	/**
	 * getter de lineas por hora
	 * @return lineas
	 */
	public int getnLineasXHora() {
		return nLineasXHora;
	}
	/**
	 * setter de lineas por hora
	 * @param nLineasXHora
	 */
	public void setnLineasXHora(int nLineasXHora) {
		this.nLineasXHora = nLineasXHora;
	}
	
	/**
	 * constructor vacio
	 */
	public Programador() {}
	/**
	 * constructor parametrizado
	 * @param lineas
	 * @param lenguaje
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param casado
	 * @param salario
	 */
	public Programador(int lineas, String lenguaje,String nombre,int edad,String dni,boolean casado,double salario) {
		super(nombre, edad, dni, casado,salario);
		this.nLineasXHora=lineas;
		this.lenguajeDominante=lenguaje;
		
	}
	/**
	 * metodo de nivel de programación
	 * @param lineas
	 * @return clasificacion
	 */
	public int nivel (int lineas) {
		int  clasificacion=0;
		if (lineas<=200) {
			clasificacion=1;
		}
		if (lineas>200 && lineas<500) {
			clasificacion=2;
		}
		if (lineas>=500) {
			clasificacion=3;
		}
		return clasificacion;
	
	}
}