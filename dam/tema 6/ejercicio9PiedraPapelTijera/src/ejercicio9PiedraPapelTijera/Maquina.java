package ejercicio9PiedraPapelTijera;

import java.util.Random;

public class Maquina {
	
	public String tiradaMaquina() {
		Random r=new Random();
		String jugada="";
		int numero=r.nextInt(3);
	
		
			if (numero==0) {
				jugada="piedra";
			}
			if (numero==1) {
				jugada="papel";
			}
			if (numero==2) {
				jugada="tijera";
			}
	return jugada;	
	}

}
