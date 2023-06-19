package traductor;

import java.util.HashMap;

public class Diccionario {

	private HashMap <String,String> palabras;

	public Diccionario() {
	this.palabras = new HashMap <String,String>();
	
	}

	public HashMap<String, String> getPalabras() {
		return palabras;
	}

	public void setPalabras(HashMap<String, String> palabras) {
		this.palabras = palabras;
	}
	
	public String recuperarPalabra(String palabraOriginal) {
		
		if(this.palabras.containsKey(palabraOriginal)){
			 return palabras.get(palabraOriginal);
			 
		}else {
			return null;
		}
	}
	public boolean anadirEntrada(String palabraOriginal, String traduccion) {
		if(palabras.containsKey(palabraOriginal)){
			return false;
		}else {
			palabras.put(palabraOriginal, traduccion);
			return true;
		}
	}
}
