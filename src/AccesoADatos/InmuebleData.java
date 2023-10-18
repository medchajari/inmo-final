/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Contrato;
import Entidades.Inmueble;
import Entidades.Inquilino;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelly
 */
public class InmuebleData {
    private Connection con = null;
    private ContratoData conData;
    private PropietarioData proData;

public InmuebleData(){        
        con=Conexion.getConexion(); 
        conData= new ContratoData();
        proData = new PropietarioData();
        
        
//        aluData = new AlumnoDataG62();

    }
//Dado como parámetro un inmueble en particular, listar todos sus contratos y nombre del inquilino.
public void crearInmueble(Inmueble inmueble){
    
        //consulta para insertar datos
        String sql = "INSERT INTO `inmueble`(idInquilino, idPropietario, caracteristicas, direccion, zona, tipoInmueble, precio, revisor, superficie, observaciones, estado)VALUES (?,?,?,?,?,?,?,?,?,?,true)";
         //char TipoInmueble = inmueble.getTipoInmueble();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,inmueble.getOcupante().getIdInquilino()+"");
            ps.setString(2,inmueble.getPropietario().getIdPropietario()+"");
            ps.setString(3, inmueble.getCaracteristicas()+"");
            ps.setString(4, inmueble.getDireccion()+"");
            ps.setString(5, inmueble.getZona());
            ps.setString(6, String.valueOf(inmueble.getTipoInmueble()));
            ps.setFloat(7, inmueble.getPrecio());
            ps.setString(8, inmueble.getRevisor());
            ps.setInt(9, inmueble.getSuperficieMinima());
            ps.setString(10, inmueble.getObservaciones()+"");
            ps.setBoolean(11, true);

            //ejecutamos, enviamos los datos
            ps.executeUpdate();
            //obtener la clave
            ResultSet rs = ps.getGeneratedKeys();
            //si se pudo agregar setamos el id
            if(rs.next()){
                inmueble.setIdInmueble(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Inmueble guardado exitosamente.");
            }
            ps.close();
            //si nos equivocamos en algun dato nos muestra este error
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla Inmueble.");
        }
}


public void alquilarInmueble(Inmueble inmueble){
     String sql = "INSERT INTO `inmueble`(idInmueble,idInquilino, caracteristicas, direccion, zona, tipoInmueble, precio, superficie, observaciones, estado)VALUES (?,?,?,?,?,?,?,?,?,true)";
         //char TipoInmueble = inmueble.getTipoInmueble();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,inmueble.getIdInmueble());
            ps.setInt(2,inmueble.getOcupante().getIdInquilino());
            ps.setString(3, inmueble.getCaracteristicas()+"");
            ps.setString(4, inmueble.getDireccion()+"");
            ps.setString(5, inmueble.getZona()+"");
            ps.setString(6, String.valueOf(inmueble.getTipoInmueble()+""));
            ps.setFloat(7, inmueble.getPrecio());
            ps.setString(8, inmueble.getRevisor()+"");
            ps.setInt(9, inmueble.getSuperficieMinima());
            ps.setString(10, inmueble.getObservaciones()+"");
            ps.setBoolean(11, true);

            //ejecutamos, enviamos los datos
            ps.executeUpdate();
            //obtener la clave
            ResultSet rs = ps.getGeneratedKeys();
            //si se pudo agregar setamos el id
            if(rs.next()){
                inmueble.setIdInmueble(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Inmueble guardado exitosamente.");
            }
            ps.close();
            //si nos equivocamos en algun dato nos muestra este error
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla Inmueble.");
        }
}


public void enviarRequisitos(){
    
}

public void fijarPrecio(){
    
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
   
   
   
 public ArrayList<Inmueble> listarInmueble(int idInmueble) {
    ArrayList<Inmueble> inmuebles = new ArrayList<>();

    try {
        String sql = "SELECT * FROM inmueble WHERE idInmueble = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idInmueble);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Inmueble inmueble = new Inmueble();
            inmueble.setIdInmueble(rs.getInt("idInmueble"));
            inmueble.setEstado(rs.getBoolean("estado"));
            inmueble.setCaracteristicas(rs.getString("caracteristicas"));
            inmueble.setDireccion(rs.getString("direccion"));
            inmueble.setZona(rs.getString("zona"));
            inmueble.setObservaciones(rs.getString("observaciones"));
            inmueble.setPrecio(rs.getFloat("precio"));
            inmueble.setSuperficieMinima(rs.getInt("superficieMinima"));
            inmueble.setTipoInmueble(rs.getString("tipoInmueble").charAt(0)); // Asumiendo que es un solo caracter

            // Obtener información del propietario
            Propietario propietario = new Propietario();
            propietario.setIdPropietario(rs.getInt("idPropietario"));
            propietario.setNombre(rs.getString("nombre"));
            propietario.setApellido(rs.getString("apellido"));
            propietario.setDni(rs.getInt("dni"));
            propietario.setDomicilio(rs.getString("domicilio"));
            propietario.setTelefono(rs.getInt("telefono"));
            propietario.setEstado(rs.getBoolean("estado"));

            inmueble.setPropietario(propietario);

            inmuebles.add(inmueble);
        }

        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inmueble.");
    }

    return inmuebles;
}
}
