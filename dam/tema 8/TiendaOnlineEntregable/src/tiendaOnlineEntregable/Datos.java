package tiendaOnlineEntregable;

import java.util.ArrayList;
import java.util.HashMap;

public class Datos {

	public ArrayList<Usuario>getUsuarios() {
		 
		ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
		
		usuarios.add(new Usuario(1,"123456789f","Fran Valero","admin"));
		usuarios.add(new Usuario(2,"987654321p","Pablo Cebrian","socio"));
		usuarios.add(new Usuario(3,"567483921s","usuario","usuario"));
		
		return usuarios;
	}
	public HashMap<Integer,Producto> getProductos(){
		HashMap<Integer,Producto> productoAudiovisual=new HashMap<Integer,Producto>();
		
		
		//Categorias
		
		Categoria camara=new Categoria(99,"camaras");
		Categoria objetivos=new Categoria(98,"objetivos");
		Categoria filtros=new Categoria(97,"filtros");
		Categoria flash=new Categoria(96,"tripode");
		
		//Productos
		
		productoAudiovisual.put(1,new Producto(01,"Canon c1", 1000.99,camara, true));
		productoAudiovisual.put(2,new Producto(02,"Canon c2", 1100.99,camara, true));
		productoAudiovisual.put(3,new Producto(03,"Canon c3", 1200.99,camara, true));
		productoAudiovisual.put(4,new Producto(04,"Canon c4", 1400.99,camara, true));
		productoAudiovisual.put(5,new Producto(05,"Canon c5", 1500.99,camara, true));
		
		
		productoAudiovisual.put(6,new Producto(6,"zomm 24-70mm", 2000.99,objetivos, true));
		productoAudiovisual.put(7,new Producto(7,"zomm 70-200mm", 2100.99,objetivos, true));
		productoAudiovisual.put(8,new Producto(8,"fijo 50mm", 3200.99,objetivos, true));
		productoAudiovisual.put(9,new Producto(9,"fijo 35mm", 4400.99,objetivos, true));
		productoAudiovisual.put(10,new Producto(10,"fijo 14mm", 5500.99,objetivos, true));
		
		
		productoAudiovisual.put(11,new Producto(11,"filtro uv", 200.99,filtros, true));
		productoAudiovisual.put(12,new Producto(12,"filtro pro-mist", 210.99,filtros, true));
		productoAudiovisual.put(13,new Producto(13,"filtro black-mist", 320.99,filtros, true));
		productoAudiovisual.put(14,new Producto(14,"filtro nd", 440.99,filtros, true));
		productoAudiovisual.put(15,new Producto(15,"filtro degradado", 550.99,filtros, true));
		
		
		productoAudiovisual.put(16,new Producto(16,"godox v860", 200.99,flash, true));
		productoAudiovisual.put(17,new Producto(17,"canon speed-ligth", 210.99,flash, true));
		productoAudiovisual.put(18,new Producto(18,"newer v500", 220.99,flash, true));
		productoAudiovisual.put(19,new Producto(19,"profoto x", 350.99,flash, true));
		productoAudiovisual.put(20,new Producto(20,"godox v850", 190.99,flash, true));
		
		return productoAudiovisual;
	}
		public HashMap<Integer,Categoria>categoriaProductos(){
		HashMap<Integer,Categoria> categoriaProductos=new HashMap<Integer,Categoria>();
	
		categoriaProductos.put(99,new Categoria(99,"camaras"));
		categoriaProductos.put(98,new Categoria(98,"objetivos"));
		categoriaProductos.put(97,new Categoria(97,"filtros"));
		categoriaProductos.put(96,new Categoria(96,"tripode"));
		
		return categoriaProductos;
		
		
		
	}
	}
