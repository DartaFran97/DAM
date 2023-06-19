package ejercicio_1_profesor_aluumno;
/**
 * esta clase define Alumno que esta heredada de Persona y es la clase madre
 * @author franv
 *@version 08/02/2023
 */
public class Alumno extends Persona{
	
	private int id_alumno;
	private String curso;
	private double [] notas=new double[7];
	/**
	 * constructor vacio 
	 */
	public Alumno() {}
	/**
	 * constructor parametrizado
	 * @param id_alumno
	 * @param curso
	 * @param notas
	 * @param nombre
	 * @param edad
	 */
	public Alumno(int id_alumno,String curso,double[]notas,String nombre,int edad) {
		super(nombre,edad);
		this.curso=curso;
		this.id_alumno=id_alumno;
		this.notas=notas;
		this.nombre=nombre;
		this.edad=edad;
	}
	/**
	 * constructor parametrizado
	 * @param id_alumno
	 */
	public Alumno(int id_alumno){
		this.id_alumno=id_alumno;
	}
	/** constructor parametrizado
	 * 
	 * @param curso
	 */
	public Alumno(String curso) {
		this.curso=curso;
	}
	/**
	 * contructror parametrizado
	 * @param notas
	 */
	public Alumno(double[]notas) {
		this.notas=notas;
	}
	
	/**
	 * getter del id
	 * @return id
	 */
	public int getId() {
		return this.id_alumno;
	}
	/**
	 * detter delcurso
	 * @return curso
	 */
	public String getCurso() {
		return this.curso;
	}
	/**
	 * getter de notas
	 * @return notas
	 */
	public double[] getNotas() {
		return this.notas;
	}
	/**
	 * setter del id
	 * @param id_alumnos
	 */
	public void setId(int id_alumnos) {
		this.id_alumno=id_alumnos;
	}
	/**
	 * setter del curso
	 * @param curso
	 */
	public void setCurso(String curso) {
		this.curso=curso;
	}
	/**
	 * setter de las notas
	 * @param notas
	 */
	public void setNotas(double[]notas) {
		this.notas=notas;
	}
	/**
	 * metod de la nota media, calcula la media de los elementos del array
	 * @return notaMedia
	 */
	public double getNotaMedia() {
		double totalNotas=0;
		for(int i=0;i<this.notas.length;i++) {
			 totalNotas+=this.notas[i];
		 }
		double notaMedia=totalNotas/this.notas.length;
		return notaMedia;
		
	}
	
	
}
