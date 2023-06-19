package ejercicio1Tema8;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Companero> compi=new ArrayList<Companero>();
		
		Companero c1= new Companero("xusi",20,"dam");
		Companero c2= new Companero("Paolo",21,"dam");
		Companero c3= new Companero("Baltasar",22,"dam");
		Companero c4= new Companero("juano",23,"dam");
		Companero c5= new Companero("goreno",24,"dam");
		Companero c6= new Companero("macaquino",25,"dam");
		
		
		compi.add(c1);
		compi.add(c2);
		compi.add(c3);
		compi.add(c4);
		compi.add(c5);
		compi.add(c6);
		
		for(Companero c : compi) {
			System.out.println(c.toString());
			
		}
		
	}

}
