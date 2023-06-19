package ejercicio3Tema8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		
		numeros.add(99);
		numeros.add(22);
		numeros.add(88);
		numeros.add(33);
		numeros.add(77);
		numeros.add(44);
		numeros.add(66);
		numeros.add(55);
		numeros.add(11);
		System.out.println("el arrayList de numeros: "+ numeros);
		
		int index =0;
		int valor =11;
			
	for (Iterator iterator =numeros.iterator(); iterator.hasNext();) {
		Integer integer = (Integer)iterator.next();
			
			numeros.set(index,valor);
			
			index++;
			valor+=11;
	}
	System.out.println(numeros);
	}

}
