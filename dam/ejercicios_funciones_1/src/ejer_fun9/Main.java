package ejer_fun9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String repetir="";
		boolean validacion=true;
		
			
				System.out.println("introduzca el radio del cilindro");	
				double radio=sc.nextInt();
				sc.nextLine();
				System.out.println("introduzca la altura");	
				double altura=sc.nextInt();
				sc.nextLine();
				
				System.out.println("elije la operación a realizar");
				System.out.println("1. calcular el área");
				System.out.println("2. calucular el volumen");
				int menu=sc.nextInt();
				sc.nextLine();
				
				switch(menu){
				case 1:
					System.out.println("el area es: "+area(radio,altura));
					
					break;
				case 2:
					System.out.println("el volumen es: "+volumen(radio,altura));
					
					break;
					default:
						System.out.println("error selección no valida");
				}
				System.out.println("¿desea seguir caluculando? si/no");
				repetir=sc.nextLine();
				
				
			
		
	
}
	
public static double volumen(double radio, double altura) {
	
	double resultado=3.1416*radio*radio*altura;
	return resultado;
}
public static double area(double radio, double altura) {
	
	double resultado=2*3.1416*radio*altura*(radio+altura);
	return resultado;
}

public static boolean validacion(String repetir,boolean validacion) {
	boolean resultado=false;
	if(repetir=="si"||repetir=="no") {
	validacion=true;
	}else {
		validacion=false;
	}
	if(validacion==true) {
		if(repetir.equals("si")){
				resultado=true;
			
		}
		if(repetir.equals("no")){
			resultado=false;
		}
	}
	return resultado;
}

}

