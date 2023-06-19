package act1;

public class Main {

	public static void main(String[] args) {
		// Crea un programa que genere una matriz de tamaño 5x5 que almacene los números del 1 al 25 y luego muestre la matriz por pantalla.
		
		int[][]matriz=new int[5][5];
		int tamaño=matriz.length;
		int n=0;
		int m=0;
		
		for(int i=0;i<matriz.length;i++) {
	
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=(i*matriz.length)+(j+1);
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
			
				
		
	}

}
