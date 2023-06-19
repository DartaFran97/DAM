package tiendaOnlineEntregable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Datos d=new Datos();
		ArrayList<Usuario> u= d.getUsuarios();
		HashMap<Integer,Producto> p=d.getProductos();
		HashMap<Integer,Categoria> c=d.categoriaProductos();
		Producto product = new Producto();
		Categoria categoria=new Categoria();
		
		
		Scanner sc= new Scanner(System.in);
		
		String dni=" ";
		String nombre=" ";
		
			System.out.println("hola bienvenido a DartaCAM, tienda de productos fotograficos");
			System.out.println("identifiquese");
			System.out.println("introduzca su nombre");
			nombre=sc.nextLine();
			System.out.println("introduzca su dni");
			dni=sc.nextLine();
			
			if (login(nombre,dni,u)==true) {
				
					mostrarMenu();
					
					System.out.println("escoja una opción");
					int opcion=sc.nextInt();
					
					
					switch (opcion) {
					
					case 1:
						
						for (Entry<Integer, Producto> entrada : p.entrySet()) {
						    System.out.println(entrada.getValue());
						}
							
							
					break;
					
					case 2:
						
						System.out.println("seleccione el id del producto al que desea cambiarle el nombre");
						int id=sc.nextInt();
						sc.nextLine();
						if (p.containsKey(id)==true) {
						product=p.get(id);
						System.out.println("introduzca el nuevo nombre del producto");
						String nuevoNombre=sc.nextLine();
						product.setNombre(nuevoNombre);
						System.out.println(product.toString());
						}else {
							System.out.println("la id no coincide");
						}
					break;
						
					case 3:
						System.out.println("seleccione el id del producto al que desea cambiarle el nombre");
						id=sc.nextInt();
						if (p.containsKey(id)==true) {
						product=p.get(id);
						System.out.println("introduzca el nuevo precio del producto");
						double precioNuevo=sc.nextDouble();
						product.setPrecio(precioNuevo);
						System.out.println(product.toString());
						}else {
							System.out.println("la id no coincide");
						}
					break;
						
					case 4:
						for (Entry<Integer, Categoria> entrada : c.entrySet()) {
						    System.out.println(entrada.getValue());
						}
						
					break;
					case 5:
						System.out.println("seleccione el id de la categoria a la  que desea cambiarle el nombre");
						id=sc.nextInt();
						
						sc.nextLine();
						categoria=c.get(id);
						if (p.containsKey(id)==true) {
						System.out.println("introduzca el nuevo nombre de la categoria");
						String nuevoNombreCategoria=sc.nextLine();
						categoria.setNombreCategoria(nuevoNombreCategoria);	
						System.out.println(categoria.toString());
						}else {
						System.out.println("la id no coincide");
						}
						
						break;
					
					case 0:
						System.out.println("Hasta la vista, gracias por visitar nuestra tienda");
						break;
					default:
						System.out.println("error, valor no valido");
						
					}
					
			
				
			}else {
				System.out.println("Error, no tiene permisos");
			}
			
			
		}
	
	
	
	public static boolean login(String nombre, String dni, ArrayList<Usuario> u) {
		boolean verificado=false;
		Usuario a = new Usuario(dni, nombre);
		
		for(Usuario comprobacion: u) {
			if (comprobacion.getNombreUsser().equalsIgnoreCase(nombre)==true && (comprobacion.getDni().equalsIgnoreCase(dni)==true)) {
				verificado=true;
			}
		}
		
		return verificado;		
	}
	
	public static void mostrarMenu() {
		
		 System.out.println("1. Listar productos");
         System.out.println("2. Modificar nombre de producto");
         System.out.println("3. Modificar precio de producto");
         System.out.println("4. Listar categorías");
         System.out.println("5. Modificar nombre de categoría");
         System.out.println("0. Salir");
	}
	

	

}
