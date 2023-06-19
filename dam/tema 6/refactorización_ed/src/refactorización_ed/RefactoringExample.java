package refactorización_ed;
/*
 * Mediante las técnicas de refactorización realiza los siguientes cambios en el código visto a continuación:
 * 
 * 1) Renombra la función f utilizando la funcionalidad "Refactor -> Rename" para darle un nombre más intuitivo.
 * 2) Extrae la línea que imprime el resultado de la operación utilizando la funcionalidad "Refactor -> Extract Method".
 * 3) Refactoriza la variable result del método m utilizando la funcionalidad "Refactor -> inline".
 * 4) Mediante la funcionalidad Change Method Signature cambia el tipo de la función p de int a double, 
 * añade un parámetro extra z, da valores por defecto a 1 para las variables y cambiale el nombre a la función.
 * 
 * Documenta el proceso realizado con capturas de pantalla explicando cada uno de los pasos realizados.
 * 
 * */
public class RefactoringExample {

	public static void main(String[] args) {

		int x = 5, y = 3, z;
		z = Suma(x,y);
		extracted(z);
	}

	private static void extracted(int z) {
		System.out.print(z);
	}

	public static int Suma(int x, int y) {
		return x + y;
	}
	
	public static int m(int x, int y) {
		return x - y;
	}
	
	public static double modificada(int x, int y, int z) {
		return x * y;
	}
}
