package ejemplo;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class Main {

		public static void main(String[] args) {
			try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","3497Fjvp1997");
			
			
			String query= "SELECT a.nombreAlumno, a.edadAlumno from Alumno a";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
			
				 String nombre=rs.getString("nombreAlumno");
				 Integer edad=rs.getInt("edadAlumno");
						
				 System.out.println(nombre+ " " +edad);
				 
		
				 
			 }
			 String sqlInsert= "insert into prueba.alumno (idalumno, nombreAlumno,edadAlumno) values (?,?,?)";
			 PreparedStatement stmt= conn.prepareStatement(sqlInsert);
			 
			 stmt.setInt(1, 5);
			 stmt.setString(2, "Antonio");
			 stmt.setInt(3, 23);
			 
			 //la funcion execute no funciona del todo bien porque realiza
			 //el proceso pero al ser un insertado no hay retorno y por tanto devuelve false 
			 
			int resultado = stmt.executeUpdate();
			 
			 if (resultado==1) {
				 System.out.println("operación realizada con exito");
			 } else {
				 System.out.println("operación fallida");
			 }
			 conn.close();
			
			}catch (SQLException e) {
				e.printStackTrace();
				
				
			}
			
		}

	}
