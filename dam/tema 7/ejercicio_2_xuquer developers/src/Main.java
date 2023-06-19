import java.util.Scanner;
/**
 * esta clase es Empleado y es la clase madre de Programador
 * @author franv
 *@version 08/02/23
 */
public class Main {
	/**
	 * metodo principal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Empleado[] arrayEmpleados= new Empleado[2];
		Programador[] arrayProg= new Programador[2];
		
		 arrayEmpleados[0]= new Empleado("paco",23,"44444a",true,1000);
		 arrayEmpleados[1]= new Empleado("pape",22,"44444b",false,1000);
		 
		 arrayProg[0]= new Programador(300,"java","paco",23,"44444a",true,100.12);
		 arrayProg[1]= new Programador(300,"php","pepe",22,"44444b",false,100.12);
		 
	}
	/**
	 * metodo para mostrar empleados
	 * @param arrayEmpleados
	 */
	public void imprimirDatos(Empleado[] arrayEmpleados) {
		 for(int i=0;i<arrayEmpleados.length;i++) {
			System.out.println(arrayEmpleados[i].getNombre()+ arrayEmpleados[i].getDni()+arrayEmpleados[i].getEdad()+arrayEmpleados[i].getSalario()+arrayEmpleados[i].isCasado());
		 }
			 
	}

}
