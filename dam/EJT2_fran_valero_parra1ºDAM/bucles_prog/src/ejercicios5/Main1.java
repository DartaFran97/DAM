package ejercicios5;
import java.util.Scanner;

public class Main1 {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			double n1;
			int neg = 0;
			int pos = 0;
			int cont = 1; 
			
			while (cont <= 10){
				System.out.println("introduzca el numero");
				 n1 = teclado.nextDouble();
				
				if (n1 >= 0) {	
			        pos++;
					
				}else {
					neg++;
					
				}
				    cont++;
			}	    
			
			if (cont >= 10) {
				System.out.println("hay " + pos + " numeros positivos y " + neg + " negativos");
			}
	

	}

}

