package conexion.base.de.datos.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private Conexion() {
	private Conexion conexion;
	private Connection connection;
	
	public static void Conexion getInstancia() {
		if (this.Conexion == null)
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108/curso","alumnos","java123");
			}catch (Exception)e){
				e.printStackTrace();
			}
		
			return null;
		}else {
			return Conexion;
		}
		
	}
	
	
	
}
