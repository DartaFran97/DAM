package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca su nombre de usuario");
		String usuario=sc.nextLine();
		System.out.println("introduzca su contraseña");
		String pasword=sc.nextLine();
		
		if (consultaLoguin(usuario,pasword)) {
			System.out.println("ok");
		}else {
			System.out.println("acceso denegado");
		}
		
		

	}		
		
	public static boolean consultaLoguin(String usuario, String pasword) {
			boolean variable = false;
		
			try {
				
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ejercicio1","root","3497Fjvp1997");
			String a=usuario;
			String b=pasword;
			String query= "SELECT a.nombre_usuario, a.pasword from usuarios a where a.nombre_usuario='"+a+"'AND a.pasword ='"+b+"'";
			
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			
			ResultSet rs = ps.executeQuery();
			
			
			if (rs.next()) {
				variable=true;
			}else {
				variable=false;
			}
			
			}catch (SQLException e) {
				e.printStackTrace();
			
			}
			return variable;
			
	}
}

