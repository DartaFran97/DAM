package tiendaOnlineEntregable;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> productos;

	public Carrito(ArrayList<Producto> productos) {
		ArrayList <Producto> p = new ArrayList<Producto>();
	}
	
	public boolean añadirProductos(Producto productoCarrito) {
		if (productoCarrito.isEnStock()==true) {
			productos.add(productoCarrito);
			return true;
		}else {
			return false;
		}	
	}
	public void eliminarProductos(Producto productoCarrito) {
		productos.remove(productoCarrito);
	
	}
	public double precioTotalCarrito () {
		double precioTotal=0;
		for (Producto productos : productos) {
			precioTotal+=productos.getPrecio();
		}
		return precioTotal;
	}
	 public double precioDescuento(Usuario usuario, double precioTotalCarrito) {
		  double precioDescuento=0;
		  double descuento=0.15;
		  if (usuario.getTipo().equalsIgnoreCase("socio")){
			descuento*= precioTotalCarrito();
			precioDescuento=precioTotalCarrito()-descuento;
			return precioDescuento;
		  }else {
			  return precioTotalCarrito();
		  }
		 
		 
	 }
}
