package ejercicio4Tema8;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap<String, String> monedas = new HashMap<String, String>();
		
		monedas.put("euro","€");
		monedas.put("dolar","$");
		monedas.put("libra","£");
		monedas.put("yen","Y");
		monedas.put("bitcoin","B");
		
		System.out.println(" introduzca el nombre de la moneda ");
		String moneda=sc.nextLine();
	
		
		if (monedas.containsKey(moneda)){
		System.out.println(monedas.get(moneda));
		}else {
			System.out.println("error, moneda no disponible");
			
		}
		
	}

}
