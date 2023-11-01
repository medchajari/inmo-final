
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
	
	private static final String url="jdbc:mariadb://localhost/";
	private static final String db="inmodb";
	private static final String usuario="root";
	private static final String password="";
	private static Connection conexion;
	
	public Conexion(){}
	
	public static Connection getConexion(){
	
		if(conexion==null){
			try {
				Class.forName("org.mariadb.jdbc.Driver");
//                                jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull
				conexion = DriverManager.getConnection(url+db,usuario,password);
				
                                JOptionPane.showMessageDialog(null,"Conectado correctamente.");
				
			} catch (ClassNotFoundException ex) {
				JOptionPane.showMessageDialog(null,"Error al cargar los driver.");
			} catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null,"Error al conectarse a la Base de Datos.");
                    }
		}
                return conexion;
	}

	
	
}
