package ejercicio_1_profesor_aluumno;

import java.util.Scanner;
/**
 * esta clase define main 
 * @author franv
 *@version 08/02/2023
 */
public class Main {
/**
 * este es el metodo principal del programa que contiene un switch de elección para contruir objetos profesor y alumno
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Alumno b = null;
		Profesor a=null;
		int edad=0;
		String nombre="";
		String despacho="";
		String horarios="";
		String curso="";
		int id_alumno=0;
		String campo="Campo";
		double[] notas=new double[7];
		System.out.println("que desea crear? un profesor[1] o un alumno[2]?");
		int eleccion=sc.nextInt();
		sc.nextLine();
		
	
		switch(eleccion) {
		case 1:
			System.out.println("introduce el nombre del profesor");
			nombre=sc.nextLine();
			System.out.println("introducela edad del profesor");
			edad=sc.nextInt();
			sc.nextLine();
			System.out.println("introduzca el despacho del profesor");
			despacho=sc.nextLine();
			System.out.println("introduzca la hora del profesor");
			horarios=sc.nextLine();
			
			a=generadorProfesor(despacho, horarios, nombre, edad);
			 consultaProfesor(a,sc);
			 modificadorProfesor(a, sc, campo);
		break;
		case 2:
			System.out.println("introduzca el nombre del alumno");
			nombre=sc.nextLine();
			System.out.println("introduce el id del alumno");
			id_alumno=sc.nextInt();
			sc.nextLine();
			System.out.println("introduce el curso");
			curso=sc.nextLine();
			System.out.println("introduce la edad del alumno "+nombre);
			edad=sc.nextInt();
			sc.nextLine();
			System.out.println("introduca las notas de: ");
			System.out.println("1-mates, 2-fisica, 3-lengua, 4-geografia");
			System.out.println("5-historia, 6-valenciano, 7-informatica");
			
			
			 for(int i=0;i<notas.length;i++) {
				 System.out.println("introduce la nota de "+(i+1));
				 notas[i]=sc.nextDouble();
			 }
			 
			
			 b = generadorAlumno(id_alumno, curso, notas, nombre, edad);
			 ConsultaAlumno(b);
			 modificadorAlumno( b,sc,campo);
			 
			break;
			
			
			default:
			System.out.println("error");
		}
		 
		
			
	}
	/**
	 * este metodo cgenera alumnos
	 * @param id_alumno
	 * @param curso
	 * @param notas
	 * @param nombre
	 * @param edad
	 * @return
	 */
	public static  Alumno generadorAlumno(int id_alumno,String curso,double[]notas,String nombre,int edad) {

		Alumno b=new Alumno(id_alumno,curso,notas,nombre,edad);
		return b;
	}
	/**
	 * este metodo genera profesores
	 * @param despacho
	 * @param horarios
	 * @param nombre
	 * @param edad
	 * @return
	 */
	public static Profesor generadorProfesor(String despacho, String horarios,String nombre,int edad) {
		
		Profesor a=new Profesor(despacho,horarios,nombre,edad);
		return a;
	}
	/**
	 * este metodo imprime los datos del alumno
	 * @param b
	 */
	public static void ConsultaAlumno( Alumno b) {
		
		
		System.out.println(" el alumno "+ b.getNombre()+ "con edad" + b.getEdad()+" en el curso "+ b.getCurso()+" y su id es: "+b.getId());

	}
	/**
	 * este metodo modifica los valores del alumno
	 * @param b
	 * @param sc
	 * @param campo
	 * @return
	 */
	public  static Alumno modificadorAlumno(Alumno b,Scanner sc,String campo) {
		System.out.println("introduzca el nuevo "+ campo +"del alumno");
		campo=sc.nextLine();
		if (campo.equals("nombre")) {
			String valor=sc.nextLine();
			b.setNombre(campo);
		}
		if (campo.equals("edad")) {
			int valor=sc.nextInt();
			b.setEdad(valor);
		}
		
		return b;
	}
	/**
	 * este metodo muestra los atributos del profesor
	 * @param a
	 * @param sc
	 */
	public static void consultaProfesor(Profesor a,Scanner sc) {
		
		System.out.println(" el Proofesor "+ a.getNombre()+ "con edad" + a.getEdad()+" tiene horario "+ a.getHorarioTutorias()+" y su despacho es: "+a.getDespacho());

	}
	/**
	 * este metodo modifica los valores de los atributos del profesor
	 * @param a
	 * @param sc
	 * @param campo
	 * @return
	 */
	public static Profesor modificadorProfesor(Profesor a,Scanner sc,String campo) {
		System.out.println("introduzca el nuevo "+ campo +"del Profesor");
		campo=sc.nextLine();
		if (campo.equals("horario")) {
			String valor=sc.nextLine();
			a.setNombre(campo);
		}
		if (campo.equals("edad")) {
			int valor=sc.nextInt();
			a.setEdad(valor);
		}
		
		return a;
	}
	
}
