package ejer_fun24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("introduzca el numero de su DNI sin letra");
		int dni=sc.nextInt();
		
		System.out.println("su letra del DNI es: "+letraDni(dni));
	
		

	}
	
	public static String letraDni(int dni) {
		String letra="";
		int resto=dni%23;
		if (resto==0) {
			letra ="T";
		}
		if (resto==1) {
			letra ="R";
		}
		if (resto==2) {
			letra ="W";
		}
		if (resto==3) {
			letra ="A";
		}
		if (resto==4) {
			letra ="G";
		}
		if (resto==5) {
			letra ="M";
		}
		if (resto==6) {
			letra ="Y";
		}
		if (resto==7) {
			letra ="F";
		}
		if (resto==8) {
			letra ="P";
		}
		if (resto==9) {
			letra ="D";
		}
		if (resto==10) {
			letra ="X";
		}
		if (resto==11) {
			letra ="B";
		}
		if (resto==12) {
			letra ="N";
		}
		if (resto==13) {
			letra ="J";
		}
		if (resto==14) {
			letra ="Z";
		}
		if (resto==15) {
			letra ="S";
		}
		if (resto==16) {
			letra ="Q";
		}
		
		if (resto==17) {
			letra ="V";
		}
		if (resto==18) {
			letra ="H";
		}
		if (resto==19) {
			letra ="L";
		}
		if (resto==20) {
			letra ="C";
		}
		if (resto==21) {
			letra ="K";
		}
		if (resto==22) {
			letra ="E";
		}
	
		return letra;
	}
}
