/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PropietarioData {
	private Connection con;
    private PropietarioData proD;

    public PropietarioData() {

    }

    public PropietarioData(Connection con) {
        this.con = con;
//        con=Conexion.getConexion();    
    }

public void guardarPropietario(Propietario propietario) {
        //consulta para insertar datos
        String sql = "INSERT INTO propietario(nombre, apellido, dni, domicilio, telefono, estado) VALUES (?,?,?,?,?,1)"; //funciona la consulta
        con = Conexion.getConexion();
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propietario.getNombre());
            ps.setString(2, propietario.getApellido());
            ps.setInt(3, propietario.getDni());
            ps.setString(4, propietario.getDomicilio());
            ps.setInt(5, propietario.getTelefono());
            ps.setInt(6, propietario.Estado());

            //ejecutamos, enviamos los datos
            ps.executeUpdate();

            //obtener la clave
            ResultSet rs = ps.getGeneratedKeys();

            //si se pudo agregar setamos el id
            if (rs.next()) {

                propietario.setIdPropietario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Propietario guardado exitosamente.");

            }
            ps.close();

            //si nos equivocamos en algun datos nos muestra este error
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla Propietario.");
        }

    }

    public void eliminarPropietario (int id){
                                        //modificamos el estado de la  propietarioalumno a 0
        // Consulta para cambiar el estado del propietario a 0 (eliminado)
    String sql = "UPDATE propietario SET estado = 0 WHERE idPropietario = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        
        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Propietario eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el propietario con el ID proporcionado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla propietario.");
    }
        
    }
  
    public Propietario buscarPropietarioPorDni(int dni) {
          String sql = "SELECT idPropietario, nombre, apellido, telefono, domicilio, estado FROM propietario WHERE estado = 1 and dni = ? ";
//        String sql = "SELECT idPropietario, nombre, apellido, telefono, domicilio, estado FROM propietario WHERE dni = ? ";
//        String sql = "SELECT nombre, anio FROM propietario WHERE idPropietario = ? AND estado = 1";        
        Propietario propietario = null;
        con = Conexion.getConexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                propietario = new Propietario();
                propietario.setDni(dni);                
                propietario.setIdPropietario(rs.getInt("idPropietario")); //agrado Rodo
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getInt("telefono"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setEstado(rs.getInt("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El propietario no existe.");
            }

            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de propietario: " + e.getMessage());
        }

        return propietario;
    }
 
     public void modificarPropietario(Propietario propietario) {
        String sql = "UPDATE propietario SET nombre=?, apellido=?, dni=?, domicilio=?, telefono=?, estado=? WHERE idPropietario=?";
        con = Conexion.getConexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, propietario.getNombre());
            ps.setString(2, propietario.getApellido());
            ps.setInt(3, propietario.getDni());
            ps.setString(4, propietario.getDomicilio());
            ps.setInt(5, propietario.getTelefono());
            ps.setInt(6, propietario.getEstado());
            ps.setInt(7, propietario.getIdPropietario());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propietario modificado Exitosamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla propietario.");
        }

    }
    
      public ArrayList <Propietario> listarPropietarios(){
         
          ArrayList<Propietario> propietarios = new ArrayList<>();

    try {
        String sql = "SELECT * FROM propietario WHERE idPropietario ORDER BY nombre";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Propietario propietario = new Propietario();
            
            // Establece los atributos con los valores de la base de datos
            propietario.setIdPropietario(rs.getInt("idPropietario"));
            propietario.setNombre(rs.getString("nombre"));
            propietario.setApellido(rs.getString("apellido"));
            propietario.setDni(rs.getInt("dni"));
            propietario.setDomicilio(rs.getString("domicilio"));
            propietario.setTelefono(rs.getInt("telefono"));
            propietario.setEstado(rs.getInt("estado"));

            propietarios.add(propietario);
        }

        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de propietario.");
        e.printStackTrace();
    }

    return propietarios;
    }
      
      // yoha
      
      public Propietario buscarPropietarioPorId(int id) {
        String sql = "SELECT * FROM propietario WHERE idPropietario = ? ";// cons.sql.andando
       
        Propietario propietario = null;
        con = Conexion.getConexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                propietario = new Propietario();
                propietario.setDni(rs.getInt("dni"));
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getInt("telefono"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setEstado(rs.getInt("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El propietario no existe.");
            }

            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de propietario: " + e.getMessage());
        }

        return propietario;
    }
      
      //rodo
      
       public Propietario buscarPropietarioPorIdInmueble(int id) {
        String sql = "SELECT FROM propietario WHERE idPropietario = ? ";
//        String sql = "SELECT nombre, anio FROM propietario WHERE idPropietario = ? AND estado = 1";        
        Propietario propietario = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                propietario = new Propietario();
                propietario.setDni(rs.getInt("dni"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getInt("telefono"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setEstado(rs.getInt("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El propietario no existe.");
            }

            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de propietario: " + e.getMessage());
        }

        return propietario;
    }

}