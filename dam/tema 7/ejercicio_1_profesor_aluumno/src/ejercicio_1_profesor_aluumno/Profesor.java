package ejercicio_1_profesor_aluumno;
/**
 * esta clase define Profesor que esta heredada de Persona y es la clase madre
 * @author franv
 *@version 08/02/2023
 */
public class Profesor  extends Persona{
		
	private String despacho;
	private String HorarioTutorias;
	/**
	 * metodo vacio de profesor 
	 */
	public Profesor () {}
	/**
	 * constructor parametrizado
	 * @param despacho
	 * @param horarios
	 */
	public Profesor(String despacho, String horarios) {
		this.despacho=despacho;
		this.HorarioTutorias=horarios;
	}
	/**
	 * constructor parametrizado de tipo profesor
	 * @param despacho
	 * @param horarios
	 * @param nombre
	 * @param edad
	 */
	public Profesor(String despacho, String horarios,String nombre,int edad) {
		super(nombre, edad);
		this.despacho=despacho;
		this.HorarioTutorias=horarios;
		this.nombre=nombre;
		this.edad=edad;
	}
	//getters
	/**
	 *  getter del despacho
	 * @return despacho
	 */
	public String getDespacho() {
		return this.despacho;
	}
	/**
	 * getter de las tutorias
	 * @return tutorias
	 */
	public String getHorarioTutorias() {
		return this.HorarioTutorias;
	}
	//setters
	/**
	 * setter del despacho.
	 * @param despacho
	 */
	public void setDespacho(String despacho) {
		this.despacho=despacho;
	}
	/**
	 * setter de los horarios
	 * @param horario
	 */
	public void setHorarios(String horario) {
		this.HorarioTutorias=horario;
	}
	public String getConsultas (String despacho, String horarios) {
		String consultas;
		consultas = "tiene tutoria "+horarios+" en el espacho "+despacho;
		return consultas;
	}
	
	
	
	
}
