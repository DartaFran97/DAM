package ejercicio_3_ProfesorEnfermo;
/**
 * esta clase define Persona(nombre y edad) y es la clase madre
 * @author franv
 *@version 08/02/2023
 */
public class Persona {
	
		protected String nombre;
		protected int edad;
		/**
		 * constructor vacio de tipo persona
		 */
		public Persona() {}
		/**
		 * constructor parametrizado de tipo cuenta
		 * @param nombre
		 * @param edad
		 */
		public Persona(String nombre, int edad) {
			this.nombre=nombre;
			this.edad=edad;
			
		}
		//getters
		/**
		 * getter del nombre
		 * @return nombre
		 */
		public String getNombre() {
			return this.nombre;
		}
		/**
		 * getter de la edad 
		 * @return edad
		 */
		public int getEdad() {
			return this.edad;
		}
		
		//setters
		/**
		 * setter del del nombre
		 * @param Nombre
		 */
		public void setNombre(String Nombre) {
			this.nombre=nombre;
			
		}
		/**
		 * setter de la edad
		 * @param edad
		 */
		public void setEdad(int edad) {
			this.edad=edad;
		}
}
