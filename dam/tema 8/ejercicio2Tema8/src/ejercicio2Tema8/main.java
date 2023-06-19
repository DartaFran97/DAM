package ejercicio2Tema8;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(11) + 10;
		double suma=0;
		int contador=0;
		double media=0;
		double max=0;
		double min=100;
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		for(int i=0;i<numeroAleatorio;i++) {
			int valor=random.nextInt(101);
			listaNumeros.add(valor);
			suma+=valor;
			if(valor>max) {
				max=valor;
			}
			if(valor<min) {
				min=valor;
			}
			contador++;
			
		}
		media= suma/numeroAleatorio;
		
		 System.out.println("Lista de números: " + listaNumeros);
	        System.out.println("Suma: " + suma);
	        System.out.println("Media: " + media);
	        System.out.println("Máximo: " + max);
	        System.out.println("Mínimo: " + min);

	}

}
