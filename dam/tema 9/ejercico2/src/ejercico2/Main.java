package ejercico2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random(100);
		

	}
	public static void insertarNumeros( Random r) {
		 int n= r.nextInt();
		 String query="";
		 
				try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ejercicio2","root","3497Fjvp1997");
			for (int i=0;i<100;i++) {
				int Par=n%2;
				if (Par==0) {
				query="insert into numeros ( cifra, esPar ) values ( "+r+",'si');";
				} else {
				query="insert into numeros ( cifra, esPar ) values ( "+r+",'no');";
				
				}
				PreparedStatement ps = conn.prepareStatement(query);
				
				
				ResultSet rs = ps.executeQuery();
				
			
			}
			conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}


