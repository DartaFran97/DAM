package ejercicio5Tema8;

	import java.util.HashMap;
	import java.util.Scanner;
/**
 * 
 * @author franv
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap<String, Double> combustible= new HashMap<String, Double>();
				
			combustible.put("gasolina", 1.50);
			combustible.put("diesel", 1.40);
			combustible.put("sin plomo", 1.60);
			combustible.put("sin plomo 98", 1.70);
				
			System.out.println("¿que tipo de combustible quiere respostar?");
				String combustibleRepostar=sc.nextLine();
			System.out.println("¿cuantos litros va a repostar?");
				double litros=sc.nextDouble();
				
			System.out.println(PrecioCombustible(combustible,combustibleRepostar, litros));
	}
	public static double PrecioCombustible(HashMap<String, Double> combustible, String combustibleRepostar, double litros){ {
			double precio=0;
			double total=0;
		if(combustible.containsKey(combustibleRepostar)){
		precio=combustible.get(combustibleRepostar);
		total=precio*litros;
		
		}
			return total;
		
		
		
	}
	

	}
}
