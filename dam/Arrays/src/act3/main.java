package act3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char[] name = new char[27];
		int tamaño = name.length;
		
		for(int i=0; i<27; i++) {
			System.out.println("introduzca la letra " + i + " de su nombre");
			name[i] = sc.next().charAt(0);
			
		}
		System.out.println("su nombre es: ");
		for(int i=0; i<name.length;i++) {
			System.out.print(name[i]);
		}
		
		

	}

}
