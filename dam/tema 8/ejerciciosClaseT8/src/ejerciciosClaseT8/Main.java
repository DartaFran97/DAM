package ejerciciosClaseT8;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Hotel> HotelSet=new HashSet<Hotel>();
		
		HotelSet.add(new Hotel(1, "playa", 120.0));
        HotelSet.add(new Hotel(2, "montaña", 80.0));
        HotelSet.add(new Hotel(3, "rural", 60.0));
        HotelSet.add(new Hotel(4, "playa", 150.0));
        HotelSet.add(new Hotel(5, "montaña", 90.0));
        HotelSet.add(new Hotel(6, "rural", 70.0));
        HotelSet.add(new Hotel(7, "playa", 130.0));
        HotelSet.add(new Hotel(8, "montaña", 100.0));
        HotelSet.add(new Hotel(9, "rural", 80.0));
        HotelSet.add(new Hotel(10, "playa", 110.0));
        
        System.out.println("hoteles disponibles");
        
        for(Hotel hotel: HotelSet) {
        	System.out.println(hotel.toString());
        }
        boolean comprobar=false;
        String zonaDeseada;
        int precioDeseado;
       
		do {
        System.out.println("en que zona desea el hotel?");
         zonaDeseada=sc.nextLine();
        if (zonaDeseada.equalsIgnoreCase("playa") && zonaDeseada.equalsIgnoreCase("montaña") && zonaDeseada.equalsIgnoreCase("rural")) {
        	 comprobar=false;
        }
		
        System.out.println("que precio esta buscando?");
        precioDeseado=sc.nextInt();
        if (precioDeseado<0) {
       	 comprobar=true;
        }
		}while(comprobar==true);
        
		
		for(Hotel hotel: HotelSet) {
			if (hotel.getZona().equals(zonaDeseada) && hotel.getPrecio()==precioDeseado) {
			System.out.println(hotel.toString());
			
			}
				
			
		
		}
		
       
	}

}
