package ejerciciosClaseT8;

import java.util.Objects;

public class Hotel {
	

	private int idHotel;
	 private String zona;
	 private double precio;
	 
public Hotel(int idHotel, String zona, double precio) {
		super();
		this.idHotel = idHotel;
		this.zona = zona;
		this.precio = precio;
	}


public Hotel(String zona, double precio) {
	super();
	this.zona = zona;
	this.precio = precio;
}


public int getIdHotel() {
	return idHotel;
}

public void setIdHotel(int idHotel) {
	this.idHotel = idHotel;
}

public String getZona() {
	return zona;
}

public void setZona(String zona) {
	this.zona = zona;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

@Override
public int hashCode() {
	return Objects.hash(idHotel, precio, zona);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Hotel other = (Hotel) obj;
	return idHotel == other.idHotel && Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
			&& Objects.equals(zona, other.zona);
}
@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", zona=" + zona + ", precio=" + precio + "]";
	}
	 
	 
}
