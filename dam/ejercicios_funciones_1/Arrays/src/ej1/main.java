package ej1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double[] temp = new double[10];
		int tamaño= temp.length;
		double mneg=0;
		double mpos=0;
		double neg=0;
		double pos=0;
		double tpos=0;
		double tneg=0;
		
		for(int i=0; i<10;i++) {
			System.out.println("introduzca la temperatura " + i);
			temp[i]=sc.nextDouble();
		}
		for( int i=0; i<temp.length; i++) {
			if(temp[i]<0) {
				mneg=mneg+temp[i];
				neg++;
				
			}else {
				mpos=mpos+temp[i];
				pos++;
			}
		}
			tneg=mneg/neg;
			tpos=mpos/pos;
			System.out.println("la media de temperaturas positivas es " + tpos);
			System.out.println("la media de temperaturas negtivas es " + tneg);
		
		
		
		
		

	}

}
