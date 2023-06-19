package act9;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int seg=0;
		int min=0;
		int horas=0;
		String borraAnterior = "\n\n\n\n\n\n\n\n"; 
		
		for(horas=0; horas<=23; horas++) {
			
			for(min=0; min<=59; min ++) {
				
				for (seg=0; seg<=59;seg++) {
					System.out.printf("%02d:%02d:%02d",horas,min,seg);
					TimeUnit.SECONDS.sleep(1);
					System.out.print(borraAnterior);
				}
			}
		}
}
}