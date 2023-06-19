package act2;

public class Main {

	public static void main(String[] args) {
		//  Crea un programa que genere una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego muestra la matriz por pantalla

		int[][]tabla=new int[11][10];
		int tamaño=tabla.length;
		
		for(int i=1;i<tabla.length;i++){
			System.out.println("tabla del "+i+" :");
			for(int j=0;j<tabla[i].length;j++) {
				tabla[i][j]=(j*i);
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
	}

}
