/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Inmueble;
import Entidades.Inquilino;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Kelly
 */
public class InmuebleData {
    private Connection con;
    private ContratoData conData;
    private PropietarioData proData;
    private Inquilino inq = new Inquilino();    
    private InquilinoData inqData = new InquilinoData();
public InmuebleData(){
        
        con = Conexion.getConexion();
	conData= new ContratoData(con);
        proData = new PropietarioData(con);
    }

//Dado como parámetro un inmueble en particular, listar todos sus contratos y nombre del inquilino.
public void crearInmueble(Inmueble inmueble){//se creal el inmueble disponible estado(1) sin idInquilino
   
        //consulta para insertar datos
        String sql = "INSERT INTO inmueble (idPropietario, caracteristicas, direccion, zona, tipoInmueble, precio, revisor, superficieMinima, observaciones, estado)VALUES (?,?,?,?,?,?,?,?,?,?)";
       
          Inmueble inmu= null;
        

        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,inmueble.getIdPropietario());
            ps.setString(2, inmueble.getCaracteristicas());
            ps.setString(3, inmueble.getDireccion());
            ps.setString(4, inmueble.getZona());
            ps.setString(5, inmueble.getTipoInmueble());
            ps.setFloat(6, inmueble.getPrecio());
            ps.setString(7, inmueble.getRevisor());
            ps.setInt(8, inmueble.getSuperficieMinima());
            ps.setString(9, inmueble.getObservaciones());
            ps.setInt(10,inmueble.getEstado());

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
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El inmueble ya existe");
        }catch (SQLException ex) {
  
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble."); 
}
}
 public void modificarInmueble( Inmueble inmueble){
       //consulta sql ok
   String sql = "UPDATE inmueble SET idInquilino = ?, idPropietario = ?, caracteristicas = ?, direccion = ?, zona = ?, tipoInmueble = ?, precio = ?, revisor = ?, superficieMinima = ?, observaciones = ?, estado = ? WHERE idInmueble = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, inmueble.getOcupante().getIdInquilino());
        ps.setInt(2, inmueble.getPropietario().getIdPropietario());
        ps.setString(3, inmueble.getCaracteristicas());
        ps.setString(4, inmueble.getDireccion());
        ps.setString(5, inmueble.getZona());
        ps.setString(6, inmueble.getTipoInmueble());
        ps.setFloat(7, inmueble.getPrecio());
        ps.setString(8, inmueble.getRevisor());
        ps.setInt(9, inmueble.getSuperficieMinima());
        ps.setString(10, inmueble.getObservaciones());
        ps.setInt(11, inmueble.getEstado());
        ps.setInt(12, inmueble.getIdInmueble());

        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Inmueble modificado exitosamente.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Esto imprimirá información sobre la excepción en la consola
        JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla inquilino: " + ex.getMessage());
    }
   
   }

public void alquilarInmueble(int idInmueble, int idInquilino){
     Connection con = null;
    try {
        con = Conexion.getConexion();
        
        // Actualizar el estado del inmueble a 1
        String sqlInmueble = "UPDATE inmueble SET estado = 1, idInquilino = ? WHERE idInmueble = ?";
        PreparedStatement psInmueble = con.prepareStatement(sqlInmueble);
        psInmueble.setInt(1, idInquilino);
        psInmueble.setInt(2, idInmueble);

        // Ejecutar la actualización del inmueble
        int rowsAffectedInmueble = psInmueble.executeUpdate();

        if (rowsAffectedInmueble > 0) {
            JOptionPane.showMessageDialog(null, "Inmueble alquilado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El inmueble no se encontró o ya está alquilado.");
        }

        psInmueble.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla Inmueble: " + e.getMessage());
    } finally {
        // Asegurarse de cerrar la conexión
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                // Manejar el cierre de la conexión, si es necesario
            }
        }
    }
}

public void desocuparInmueble(int idInmueble) {
   Connection con = null;
    try {
        con = Conexion.getConexion();
        String sql = "UPDATE inmueble SET estado = 0, idinquilino = 22 WHERE idInmueble = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idInmueble);

        // Ejecutar la actualización
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Inmueble desocupado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "");
        }

        ps.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al tratar de desocupar el inmueble: " + e.getMessage());
    } finally {
        // Asegurarse de cerrar la conexión
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                // Manejar el cierre de la conexión, si es necesario
            }
        }
    }
}

public void reservarInmueble(int id){ //METODO PARA CAMBIAR SOLAMENTET EL ESTADO DEL INMUEBLE DE 1 A 3 revisarlo porque no se si esta bien 
     String sql = "UPDATE inmueble SET estado = 2 WHERE inmueble.idInmueble = ?;";
        //estado 1 Alquilable, estado =2 alqulado y estado 3 = reservado
         
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,id);
            

            //ejecutamos, enviamos los datos
            ps.executeUpdate();
            //obtener la clave
            ResultSet rs = ps.getGeneratedKeys();
            //si se pudo agregar setamos el id

                JOptionPane.showMessageDialog(null,"Inmueble reservado exitosamente.");
            
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
   

 
 public Inmueble listarInmueblePorId(int id) {
    Inmueble inmueble = null;

    try {
        String sql = "SELECT * FROM inmueble WHERE idInmueble = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            inmueble = new Inmueble();
            inmueble.setIdInmueble(rs.getInt("idInmueble"));
            inmueble.setEstado(rs.getInt("estado"));
            // Resto de la carga de datos
        }

        rs.close();
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inmueble.");
        e.printStackTrace();
    }

    return inmueble;
}
 
  public ArrayList <Inmueble> listarInmuebles(){
         
          ArrayList<Inmueble> inmuebles = new ArrayList<>();
		con = Conexion.getConexion();
    try {
        String sql = "SELECT * FROM inmueble WHERE estado = 0";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Inmueble inmue = new Inmueble();
            inmue.setIdInmueble(rs.getInt("idInmueble"));
            inmue.setCaracteristicas(rs.getString("caracteristicas"));
	    inmue.setSuperficieMinima(rs.getInt("superficieMinima"));
            inmue.setPrecio(rs.getInt("precio"));
            inmue.setZona(rs.getString("zona"));
            

            inmuebles.add(inmue);
        }

        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inquilinos.");
        e.printStackTrace();
    }

    return inmuebles;
}

  public ArrayList <Inmueble> listarInmueblesporTipo(){
         
          ArrayList<Inmueble> inmuebles = new ArrayList<>();
		con = Conexion.getConexion();
    try {
        String sql = "SELECT * FROM inmueble WHERE tipo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Inmueble inmue = new Inmueble();
            
            inmue.setCaracteristicas(rs.getString("caracteristicas"));
            inmue.setPrecio(rs.getInt("precio"));
            inmue.setZona(rs.getString("zona"));
            

            inmuebles.add(inmue);
        }

        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inquilinos.");
        e.printStackTrace();
    }

    return inmuebles;
}
  
  
  //yahoaaaa
  
    public ArrayList<Inmueble> listarInmueblesDe(int sup, String tipo, String zona) {
        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        
        try {
 
            String sql = "SELECT * FROM inmueble WHERE superficieMinima <= ? AND tipoInmueble = ? AND zona = ? AND estado = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, sup);
            ps.setString(2,tipo);
            ps.setString(3,zona);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                
                Inmueble inmueble = new Inmueble();
                
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCaracteristicas(rs.getString("caracteristicas"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setObservaciones(rs.getString("observaciones"));
                inmueble.setPrecio(rs.getFloat("precio"));
                inmueble.setSuperficieMinima(rs.getInt("superficieMinima"));
                inmueble.setTipoInmueble(rs.getString("tipoInmueble"));
                inmueble.setEstado(rs.getInt("estado"));
                
                Propietario pro = proData.buscarPropietarioPorId(rs.getInt("idPropietario"));
                
                inmueble.setPropietario(pro);

                inmuebles.add(inmueble);
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inmueble!!");
        }
        return inmuebles;

    }
    
    
   
    public Inmueble buscarInmueblePorId(int id) {//revisar por que no anda en la vista de ageregar inmueble
        
        String sql = "SELECT * FROM inmueble WHERE idInmueble =? AND estado != 4 ";// estado distinto de 4 para que busque solo los inmuebles disp, ocup y reserv
        Inmueble in = new Inmueble();
        
        Propietario pro = new Propietario();
        PreparedStatement ps = null;
        
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                in.setIdInmueble(id);
                pro = proData.buscarPropietarioPorId(rs.getInt("idPropietario"));
                inq = inqData.buscarInquilinoPorId(rs.getInt("idInquilino")); 
                in.setOcupante(inq);
                in.setPropietario(pro);
                in.setCaracteristicas(rs.getString("caracteristicas"));
                in.setDireccion(rs.getString("direccion"));
                in.setZona(rs.getString("zona"));
                in.setTipoInmueble(rs.getString("tipoInmueble"));
                in.setPrecio(rs.getFloat("precio"));
                in.setRevisor(rs.getString("revisor"));
                in.setSuperficieMinima(rs.getInt("superficieMinima"));
                in.setObservaciones(rs.getString("observaciones"));
                in.setEstado(rs.getInt("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE EL INMUEBLE");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla INMUEBLE" + ex.getMessage());
        }
        
     return in;

    }
    
        public void eliminarInmueble (int id){
      con = Conexion.getConexion();
    try{
            String sql= "UPDATE inmueble SET estado= 4 WHERE idInmueble = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if(fila ==1){
               JOptionPane.showMessageDialog(null, "SE ELIMINÓ EL INMUEBLE.");
               
            }
            ps.close();
            
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INMUEBLE");
        }
}
	
	
     public ArrayList<Inmueble> listarInmueblePorId() {
    ArrayList<Inmueble> inmuebles = new ArrayList<>();
con = Conexion.getConexion();
    try {
        String sql = "SELECT * FROM inmueble WHERE estado = 0 ";
        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, id);
        
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Inmueble inmueble = new Inmueble();
            inmueble.setIdInmueble(rs.getInt("idInmueble"));
            Propietario pro = proData.buscarPropietarioPorId(rs.getInt("idPropietario"));
            Inquilino Inqui= inqData.buscarInquilinoPorId(rs.getInt("idInquilino"));
            inmueble.setEstado(rs.getInt("estado"));
            inmueble.setCaracteristicas(rs.getString("caracteristicas"));
            inmueble.setDireccion(rs.getString("direccion"));
            inmueble.setZona(rs.getString("zona"));
            inmueble.setObservaciones(rs.getString("observaciones"));
            inmueble.setPrecio(rs.getFloat("precio"));
            inmueble.setSuperficieMinima(rs.getInt("superficieMinima"));
            inmueble.setTipoInmueble(rs.getString("tipoInmueble")); 


            inmuebles.add(inmueble);
        }

        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inmueble.");
    }
        return inmuebles;

    
}
     
          
        public ArrayList<Inmueble> listarInmueblePorDniProp(int dni) {
    ArrayList<Inmueble> inmuebles = new ArrayList<>();
    try {
        //consulta sql ok
        String sql = "SELECT * FROM inmueble JOIN propietario ON (inmueble.idPropietario = propietario.idPropietario) JOIN inquilino ON (inmueble.idInquilino = inquilino.idInquilino) WHERE propietario.dni = ? AND propietario.estado = 1";
        //            
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Inmueble inmueble = new Inmueble();
            inmueble.setIdInmueble(rs.getInt("idInmueble"));
             Inquilino inq = inqData.buscarInquilinoPorId(rs.getInt("idInquilino"));
            inmueble.setOcupante(inq);
            Propietario prop = proData.buscarPropietarioPorId(rs.getInt("idPropietario"));
            inmueble.setPropietario(prop);
            inmueble.setCaracteristicas(rs.getString("caracteristicas"));
            inmueble.setDireccion(rs.getString("direccion"));
            inmueble.setZona(rs.getString("zona"));
            inmueble.setObservaciones(rs.getString("observaciones"));
            inmueble.setPrecio(rs.getFloat("precio"));
            inmueble.setSuperficieMinima(rs.getInt("superficieMinima"));
            inmueble.setTipoInmueble(rs.getString("tipoInmueble"));
            inmueble.setEstado(rs.getInt("estado"));
     inmuebles.add(inmueble);
        }

        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inmueble.");
    }
        return inmuebles;
}
  
   
     
       public ArrayList<Inmueble> listarInmueblePorDniInqui(int dni) { 
    ArrayList<Inmueble> inmuebles = new ArrayList<>();

    try {
//        consulta sql ok
        String sql ="SELECT * FROM inmueble JOIN inquilino ON (inmueble.idInquilino = inquilino.idInquilino) JOIN propietario ON (inmueble.idPropietario = propietario.idPropietario) WHERE inquilino.dni = ? AND propietario.estado = 1 ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Inmueble inmueble = new Inmueble();
            inmueble.setIdInmueble(rs.getInt("idInmueble"));
            Inquilino inq = inqData.buscarInquilinoPorId(rs.getInt("idInquilino"));
            inmueble.setOcupante(inq);
            Propietario prop = proData.buscarPropietarioPorId(rs.getInt("idPropietario"));
            inmueble.setPropietario(prop);
            inmueble.setEstado(rs.getInt("estado"));
            inmueble.setCaracteristicas(rs.getString("caracteristicas"));
            inmueble.setDireccion(rs.getString("direccion"));
            inmueble.setZona(rs.getString("zona"));
            inmueble.setObservaciones(rs.getString("observaciones"));
            inmueble.setPrecio(rs.getFloat("precio"));
            inmueble.setSuperficieMinima(rs.getInt("superficieMinima"));
            inmueble.setTipoInmueble(rs.getString("tipoInmueble")); 
            inmueble.setRevisor(rs.getString("revisor"));
            
     inmuebles.add(inmueble);
        }

        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inmueble.");
    }
        return inmuebles;
}	 
	  
      public ArrayList<Inmueble> listInmuPorId(int id) {
    ArrayList<Inmueble> inmuebles = new ArrayList<>();
  con = Conexion.getConexion();
    try {
        String sql = "SELECT * FROM inmueble WHERE estado = ? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Inmueble inmueble = new Inmueble();
            inmueble.setIdInmueble(rs.getInt("idInmueble"));
            Propietario pro = proData.buscarPropietarioPorId(rs.getInt("idPropietario"));
            Inquilino Inqui= inqData.buscarInquilinoPorId(rs.getInt("idInquilino"));
            inmueble.setEstado(rs.getInt("estado"));
            inmueble.setCaracteristicas(rs.getString("caracteristicas"));
            inmueble.setDireccion(rs.getString("direccion"));
            inmueble.setZona(rs.getString("zona"));
            inmueble.setObservaciones(rs.getString("observaciones"));
            inmueble.setPrecio(rs.getFloat("precio"));
            inmueble.setSuperficieMinima(rs.getInt("superficieMinima"));
            inmueble.setTipoInmueble(rs.getString("tipoInmueble")); 


            inmuebles.add(inmueble);
        }

        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inmueble.");
    }
        return inmuebles;

    
}
}
