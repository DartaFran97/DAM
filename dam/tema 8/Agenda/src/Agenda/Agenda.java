package Agenda;

import java.util.HashMap;

public class Agenda {

	private HashMap<String,Integer> listaContactos;

	public Agenda() {
		
		listaContactos=new HashMap<>();
	}

	
	public boolean anyadirContacto( String nombre, Integer numeroTelefono) {
		
		if (this.listaContactos.containsKey(nombre)) {
			
				return false;
						
		}else {
			listaContactos.put(nombre, numeroTelefono);
			return true;
		}
	}
	public boolean eliminarContactos(String nombre) {
		
		if (listaContactos.containsKey(nombre)) {
			listaContactos.remove(nombre);
			return true;
					
		}else {
		
		return false;
		}
	}
	public boolean editarContacto(String nombreNuevo, String nombre, Integer nuevoNumero) {
		
		if (listaContactos.containsKey(nombre)) {
			listaContactos.replace(nombreNuevo, nuevoNumero);
			return true;
					
		}else {
		
		return false;
		}
	}
	public Integer verContacto(String nombre) {
		return listaContactos.get(nombre);
	}


	public boolean contieneClave(String nombre) {
		return 	listaContactos.containsKey(nombre);
		
	}

	
	
	
}
