package act10;
import java.util.Random;
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int resp = 0;
		
		System.out.println("voy a pensar un numero del 1 al 100, ¿eres capaz de acertarlo?");
		int num= r.nextInt(101);
		System.out.println("ya lo tengo,¡comenzamos!");
		
		for (int i=num; num!=resp;) {
			System.out.println("¿cual crees que es?");
			resp=sc.nextInt();
			
			if(num>resp) {
				System.out.println("mi numero es MAYOR que " + resp);
			}
			if (num<resp){
				System.out.println("mi numero es MENOR que " + resp);
			}
		
		}
		System.out.println("ACERTASTE!!!!!");
	}

}
