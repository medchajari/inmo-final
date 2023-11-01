/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelly
 */
public class InquilinoData {
 private Connection con;
 private Inquilino ocupante = new Inquilino();
public InquilinoData() {
        con = Conexion.getConexion();
	
    }


public void agregarInquilino(Inquilino ocupante) {
    String sql = "INSERT INTO inquilino(apellido, nombre, dni, cuit, lugarTrabajo, telefono, tipo) VALUES (?,?,?,?,?,?,?)";
    con = Conexion.getConexion();
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, ocupante.getApellido());
            ps.setString(2, ocupante.getNombre());
            ps.setInt(3, ocupante.getDni());
            ps.setInt(4, ocupante.getCuit());
            ps.setString(5, ocupante.getLugarTrabajo());
            ps.setInt(6, ocupante.getTelefono());
            ps.setString(7, String.valueOf(ocupante.getTipo()));

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        ocupante.setIdInquilino(rs.getInt(1));
                        JOptionPane.showMessageDialog(null, "Inquilino guardado exitosamente.");
                    }
                }
            }
        } catch (SQLException e) {
           
        
    }
}


    private static class Statement {

        private static int RETURN_GENERATED_KEYS;

        public Statement() {
        }
    }
    
    
    public void bajaInquilino (int idInquilino){
                                       
      //consulta sql ok 
    String sql = "DELETE FROM inquilino WHERE idInquilino = ?"; 
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idInquilino);
        
        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Inquilino dado de baja exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el inquilino con ID proporcionado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla Inquilino.");
    }
        
    }
    
    
    
  public Inquilino buscarInquilinoPorDni(int dni){
      //consulta sql ok
        String sql = "SELECT * FROM inquilino WHERE dni = ?";
       
    Inquilino ocupante = null;

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            ocupante = new Inquilino();
            ocupante.setDni(dni);
            ocupante.setNombre(rs.getString("nombre"));
            ocupante.setApellido(rs.getString("apellido"));
            ocupante.setDni(rs.getInt ("dni"));
            ocupante.setCuit(rs.getInt ("cuit"));
            ocupante.setTelefono(rs.getInt("telefono"));
            ocupante.setLugarTrabajo(rs.getString ("lugartrabajo"));
	    ocupante.setTipo(rs.getString("tipo"));
	    
            
         
        } else {
            JOptionPane.showMessageDialog(null, "El inquilino no existe.");
        }

        ps.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inquilino: " + e.getMessage());
    }
	
    return ocupante;
    }
  
  
  
   public void modificarInquilino(Inquilino ocupante){
       //consulta sql ok
   String sql = "UPDATE inquilino SET apellido =?, nombre = ?, dni=?, cuit =?, lugarTrabajo=?, telefono=?, tipo= ? WHERE idInquilino = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ocupante.getApellido());
        ps.setString(2, ocupante.getNombre());
        ps.setInt(3, ocupante.getDni());
        ps.setInt(4,ocupante.getCuit());
        ps.setInt(5, ocupante.getTelefono());
        ps.setString(6, ocupante.getLugarTrabajo());
        ps.setInt(7, ocupante.getIdInquilino());
        

        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Inquilino modificado Exitosamente.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla inquilino.");
    }
    
    
    }
   public void multarInquilino(Inquilino inquilino){
       //revisar
       try {
        String sql = "UPDATE inquilino SET apellido =?, nombre = ? WHERE tipo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, inquilino.getIdInquilino());
        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Inquilino multado exitosamente.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla inquilino.");
    }
   }
   
   
   
   public ArrayList <Inquilino> listarInquilinos(){
         
          ArrayList<Inquilino> inquilinos = new ArrayList<>();
		con = Conexion.getConexion();
    try {
        String sql = "SELECT * FROM inquilino ORDER BY nombre";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Inquilino inquilino = new Inquilino();
            
            inquilino.setIdInquilino(rs.getInt("idInquilino"));
            inquilino.setNombre(rs.getString("nombre"));
            inquilino.setApellido(rs.getString("apellido"));
            inquilino.setDni(rs.getInt("dni"));
            inquilino.setCuit(rs.getInt("cuit"));
            inquilino.setLugarTrabajo(rs.getString("LugarTrabajo"));
            inquilino.setTipo(rs.getString("tipo"));

            inquilinos.add(inquilino);
        }

        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inquilinos.");
        e.printStackTrace();
    }

    return inquilinos;
}
   
   //yoha
   
       public Inquilino buscarInquilinoPorId(int id) {
        con = Conexion.getConexion();
        try {
            String sql = "SELECT * FROM inquilino WHERE idInquilino = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ocupante.setNombre(rs.getString("nombre"));
                ocupante.setApellido(rs.getString("apellido"));
                ocupante.setDni(rs.getInt("dni"));
                ocupante.setCuit(rs.getInt("cuit"));
                ocupante.setTelefono(rs.getInt("telefono"));
                ocupante.setLugarTrabajo(rs.getString("lugarTrabajo"));
                ocupante.setTipo(rs.getString("tipo"));
            }
//            JOptionPane.showMessageDialog(null, "El inquilino no existe.");

            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inquilino: " + e.getMessage());
        }

        return ocupante;
    }
}
   
   
