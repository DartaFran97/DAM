package ejer_fun23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("introduzca un numero positivo >0");
			int n=sc.nextInt();
			generador_rectangulo(n);
		}
		public static void generador_rectangulo(int n) {
			
			
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<n; j++) {
					System.out.print(i+1);
				}
				System.out.println("");
			}
		
		}

	

	}


