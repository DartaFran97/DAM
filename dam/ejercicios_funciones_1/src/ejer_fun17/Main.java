package ejer_fun17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dia,mes,año=0;
		do {
		System.out.println("introduzca la fecha a comprobar");
		System.out.println("introduzca el día");
		dia=sc.nextInt();
		System.out.println("introduzca el mes, pero con valor numerico");
		mes=sc.nextInt();
		System.out.println("introduzca el año");
		año=sc.nextInt();
		
		if (comprobador(dia,mes,año)==true) {
			System.out.println("la fecha es Correcta");
		}else {
			System.out.println("la fecha es incorrecta, intoduzca una fecha valida");
		}
		}while(comprobador(dia,mes,año)!=true);
		
		
	}
	public static boolean comprobador(int dia, int mes, int año) {
		boolean comprobarDia=false;
		boolean comprobarMes=false;
		boolean comprobarAño=false;
		boolean verificacion=false;
		if (dia>=1&&dia<=30){
			comprobarDia=true;
		}
		if (mes>=1&&mes<=12) {
			comprobarMes=true;
		}
		if (año>=0) {
			comprobarAño=true;
		}
		if (comprobarDia==true&&comprobarMes==true&&comprobarAño==true) {
			verificacion=true;
			
		
		}
		if (comprobarDia!=true||comprobarMes!=true||comprobarAño!=true) {
			verificacion=true;{
			verificacion=false;
		}
		return verificacion;
		}
		return verificacion;
	
	}
}
