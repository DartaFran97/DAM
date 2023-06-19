package tiendaOnlineEntregable;

public class Producto {
	
	    private int idProducto;
	    private String nombreProducto;
	    private double precio;
	    private Categoria categoria;
	    private boolean stock;

	    public Producto(int id, String nombre, double precio, Categoria categoria, boolean enStock) {
	        this.idProducto = id;
	        this.nombreProducto = nombre;
	        this.precio = precio;
	        this.categoria = categoria;
	        this.stock = enStock;
	    }

	    public Producto() {
			// TODO Auto-generated constructor stub
		}

		public int getId() {
	        return idProducto;
	    }

	    public void setId(int id) {
	        this.idProducto = id;
	    }

	    public String getNombre() {
	        return nombreProducto;
	    }

	    public void setNombre(String nombre) {
	        this.nombreProducto = nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public Categoria getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(Categoria categoria) {
	        this.categoria = categoria;
	    }

	    public boolean isEnStock() {
	        return stock;
	    }

	    public void setEnStock(boolean enStock) {
	        this.stock = enStock;
	    }

		@Override
		public String toString() {
			return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio
					+ ", categoria=" + categoria + ", stock=" + stock + "]";
		}
	    
	}


