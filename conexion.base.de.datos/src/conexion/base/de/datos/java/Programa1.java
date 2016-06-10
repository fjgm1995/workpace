package conexion.base.de.datos.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Programa1 {
     
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108/curso","alumnos","java123");
		
		
		String nombreUsuario = JOptionPane.showInputDialog("ingrese usuario");
		String password = JOptionPane.showInputDialog("ingrese password");
		
		PreparedStatement st = conexion.prepareStatement("select* from usuarios where "+ "nombre_usuario=? AND "+"password = ?;");
		st.setString(1,nombreUsuario );
		st.setString(2 , password );
		ResultSet rs = st.executeQuery(  );
		if( rs.next()){
			JOptionPane.showMessageDialog(null, "acceso correcto andas de suerte puto");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "acceso denegado chinga a tu madre");

		}
		
		

	}

}
