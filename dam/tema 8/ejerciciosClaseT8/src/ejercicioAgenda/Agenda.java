package ejercicioAgenda;

import java.util.HashMap;

public class Agenda {
	// se crea el atributo de una forma normal, aunque, el tipo es
	 //HashMap<String, Integer>
	private HashMap<String, Integer> listaContactos;

	// en el constructor se debe de inicializar los atributos
	public Agenda() {
		HashMap<String, Integer> listaContactos=new HashMap<String, Integer>();
	}
	//al añadir hay que utilizar la palabra reservada this
	public boolean anyadirContacto(String nombre, Integer telefono) {
		boolean resultado=true;
		if(this.listaContactos.put(nombre, telefono)==null) {
			System.out.println("operación exitosa");
			resultado=false;
		}else {
			System.out.println("operación erronea");
			resultado=true;
		}
		
		return resultado;
	}
	
	public boolean borrarContacto(String nombre) {
		boolean resultado=true;
		if(this.listaContactos.remove(nombre).equals(true)) {
			this.listaContactos.remove(nombre);
			System.out.println("contacto eliminado");
			resultado = true;
		}else {
			System.out.println("operación fallida");
			this.listaContactos.remove(nombre);
			resultado =false;
		}
		
		return resultado;
	}
	public boolean editarContacto(String nombreAntiguo, Integer telefonoAntiguo, String nombre, String Seleccion, Integer telefono) {
		boolean resultado=true;
	
		if(Seleccion.equalsIgnoreCase("nombre")||Seleccion.equalsIgnoreCase("telefono")||Seleccion.equalsIgnoreCase("nombreo y telefono") ||Seleccion.equalsIgnoreCase("telefono y nombre")) {
			if (Seleccion.equalsIgnoreCase("nombre")) {
				this.listaContactos.remove(nombreAntiguo);
				this.listaContactos.put(nombre,telefonoAntiguo);
				System.out.println("operación exitosa");
				resultado=true;
			}
			if (Seleccion.equalsIgnoreCase("telefono")) {
				this.listaContactos.remove(nombreAntiguo);
				this.listaContactos.put(nombreAntiguo,telefono);
				System.out.println("operación exitosa");
				resultado=true;
			}
			if (Seleccion.equalsIgnoreCase("nombreo y telefono") ||Seleccion.equalsIgnoreCase("telefono y nombre")) {
				this.listaContactos.remove(nombreAntiguo);
				this.listaContactos.put(nombreAntiguo,telefono);
				System.out.println("operación exitosa");
				resultado=true;
			}
			
		}else {
			System.out.println("operación erronea");
			resultado=false;
		}
		return resultado;
	}
	public void verContacto(String nombre) {
		
		if(this.listaContactos.containsValue(nombre)) {
			System.out.println(this.listaContactos.get(nombre));   
		}else {
			System.out.println("el contacto no existe");
		}
		
		
		
		
	}
	 
	
	

}
