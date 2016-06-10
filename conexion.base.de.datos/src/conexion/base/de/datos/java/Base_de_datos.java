package conexion.base.de.datos.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Base_de_datos {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108/curso","alumnos","java123");
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery  ("select * from alumnos");
			int resultado = s.executeUpdate("INSERT INTO curso.alumnos(idalumno, nombre, apellido)"+"VALUES ('23','juan','maldonado');");
			
			while (rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getInt("idalumno"));
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString(2));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("El Driver requerido no esta cargado");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}


	}

}