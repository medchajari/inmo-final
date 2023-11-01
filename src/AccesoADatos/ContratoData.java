/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Contrato;
import Entidades.Inmueble;
import Entidades.Inquilino;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class ContratoData {
       private Connection con;
       private InmuebleData inmData;
       private InquilinoData inqData;
       private Inmueble inm;


    public ContratoData(Connection con) {
        this.con = con;
    }
    

    public void crearContrato(Contrato contrato){
	    
	 if (contrato.getInmueble() == null) {
        JOptionPane.showMessageDialog(null, "El contrato no tiene un inmueble asociado. Asegúrate de establecer el inmueble antes de crear el contrato.");
        return;  
    }
    
    try {
        String sql = "INSERT INTO contrato (idInquilino, fechaFin, fechaInicio, fechaRealizacion, idInmueble, vendedor, garante, estado) VALUES (?, ?, ?, ?, ?, ?, ?, 1)";

    
        Connection con = Conexion.getConexion();
Inmueble inm = new  Inmueble();
        // Iniciar una transacción
        con.setAutoCommit(false);

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, contrato.getOcupante().getIdInquilino() + "");

            java.sql.Date sqlFechaFin = new java.sql.Date(contrato.getFechaFin().getTime());
            java.sql.Date sqlFechaInicio = new java.sql.Date(contrato.getFechaInicio().getTime());
            java.sql.Date sqlFechaRealizacion = new java.sql.Date(contrato.getFechaRealizacion().getTime());
            ps.setDate(2, sqlFechaFin);
            ps.setDate(3, sqlFechaInicio);
            ps.setDate(4, sqlFechaRealizacion);
            ps.setInt(5, contrato.getInmueble().getIdInmueble());
            ps.setString(6, contrato.getVendedor());
            ps.setString(7, contrato.getGarante());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                contrato.setIdContrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato guardado exitosamente.");
            }

            ps.close();

         

        } catch (Exception e) {
           
            con.rollback();
            JOptionPane.showMessageDialog(null, "Error al crear el contrato: " + e.getMessage());
        } finally {
            
            con.setAutoCommit(true);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato." + e.getMessage());
    }
    }
    
    public Contrato obtenerContratoPorID(int idContrato) {
        Connection con = null;
        Contrato contrato = null;

        try {
            con = Conexion.getConexion();
            String sql = "SELECT * FROM contrato WHERE idContrato = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idContrato);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
              
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    
                }
            }
        }

        return contrato;
    }

    
    public void buscarContratoPorId(int idContrato){
        String sql = "UPDATE contrato SET idContrato, ( idInquilino, fechaFin, fechaInicio, idInmueble, garante, estado) VALUES (?,?,?,?,?,?)";
     Contrato contrato = null;
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, contrato.getOcupante().getIdInquilino()+"");
        ps.setDate(2, contrato.getFechaFin());
        ps.setDate(3, contrato.getFechaInicio());
        ps.setInt(4, contrato.getInmueble().getIdInmueble());
        ps.setString(5, contrato.getGarante());
        ps.setInt(6, contrato.isEstado());

        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Contrato modificado Exitosamente.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla contrato.");
    }
    }
    
public void cancelarContrato(int idContrato) {
    
    if (con == null) {
        JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        return;
    }

    try {
        
        String sqlUpdateContrato = "UPDATE contrato SET estado = 0 WHERE idContrato = ?";
        PreparedStatement psUpdateContrato = con.prepareStatement(sqlUpdateContrato);
        psUpdateContrato.setInt(1, idContrato);

        int rowsUpdated = psUpdateContrato.executeUpdate();

        if (rowsUpdated > 0) {
           
            desocuparInmueble(idContrato);
            JOptionPane.showMessageDialog(null, "Contrato cancelado exitosamente.");
        } else {
            
            JOptionPane.showMessageDialog(null, "El contrato no se pudo cancelar.");
        }

        psUpdateContrato.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al cancelar el contrato: " + ex.getMessage());
    }
}

public void desocuparInmueble(int idContrato) {
   
    int idInmueble = obtenerIdInmueblePorContrato(idContrato);
    
    if (idInmueble != -1) {
        try {
            
            String sqlUpdateInmueble = "UPDATE inmueble SET estado = 0, idinquilino = 0 WHERE idInmueble = ?";
            PreparedStatement psUpdateInmueble = con.prepareStatement(sqlUpdateInmueble);
            psUpdateInmueble.setInt(1, idInmueble);

            int rowsUpdated = psUpdateInmueble.executeUpdate();

            if (rowsUpdated > 0) {
                
            } else {
                JOptionPane.showMessageDialog(null, "(1)El inmueble no se encontró o no se pudo desocupar.");
            }

            psUpdateInmueble.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al desocupar el inmueble: " + ex.getMessage());
        }
    }
}

public int obtenerIdInmueblePorContrato(int idContrato) {
    int idInmueble = -1;

    try {
       
        String sqlSelectInmueble = "SELECT idInmueble FROM contrato WHERE idContrato = ?";
        PreparedStatement psSelectInmueble = con.prepareStatement(sqlSelectInmueble);
        psSelectInmueble.setInt(1, idContrato);

        ResultSet rs = psSelectInmueble.executeQuery();

        if (rs.next()) {
            idInmueble = rs.getInt("idInmueble");
        }

        rs.close();
        psSelectInmueble.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener el ID de inmueble por contrato: " + ex.getMessage());
    }

    return idInmueble;
}

    
public void renovarContrato(int idContrato, Date nuevaFechaFin) {
    Connection con = null;
    try {
        con = Conexion.getConexion();

       
        String sqlRenovarContrato = "UPDATE contrato SET fechaFin = ? WHERE idContrato = ?";
        PreparedStatement psRenovarContrato = con.prepareStatement(sqlRenovarContrato);
        psRenovarContrato.setDate(1, nuevaFechaFin);
        psRenovarContrato.setInt(2, idContrato);

        int rowsUpdated = psRenovarContrato.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Contrato renovado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo renovar el contrato.");
        }

        psRenovarContrato.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al renovar el contrato: " + e.getMessage());
    } finally {
        
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
               
            }
        }
    }
}
    
    public List<Contrato> listarContratos() {
    List<Contrato> contratos = new ArrayList<>();
    
    String sql = "SELECT * FROM contrato  WHERE estado = 1";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Contrato contrato = new Contrato();
            contrato.setIdContrato(rs.getInt("idContrato"));

           
          
            Inquilino inquilino = inqData.buscarInquilinoPorDni(rs.getInt("dni"));
                    
            contrato.setOcupante(inquilino);

          
	    contrato.setIdInmueble(inm);
            contrato.setInmueble(inm);
            contrato.setFechaRealizacion(rs.getDate("fechaRealizacion"));
            contrato.setFechaInicio(rs.getDate("fechaInicio"));
            contrato.setFechaFin(rs.getDate("fechaFin"));
            contrato.setMarca(rs.getString("marca").charAt(0));
            contrato.setVendedor(rs.getString("vendedor"));
            contrato.setGarante(rs.getString("garante"));
            contrato.setEstado(rs.getInt("estado"));

            contratos.add(contrato);
        }

        rs.close();
        ps.close();
    } catch (SQLException e) {
        System.out.println("Algo salió mal al listar los contratos: " + e.getMessage());
    }

    return contratos;
}
    
 public List<Contrato> listarContratosActivos() {
    List<Contrato> contratos = new ArrayList<>();

    String sql = "SELECT contrato.*, inquilino.* FROM contrato " +
                 "INNER JOIN inquilino ON contrato.idinquilino = inquilino.idinquilino " +
                 "WHERE contrato.estado = 1 order by fechaFin";

    con = Conexion.getConexion();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Contrato contrato = new Contrato();
            contrato.setIdContrato(rs.getInt("idContrato"));

           
            Inquilino inquilino = new Inquilino();
            inquilino.setIdInquilino(rs.getInt("idInquilino"));
            inquilino.setNombre(rs.getString("nombre"));
            inquilino.setApellido(rs.getString("apellido"));
          

            contrato.setOcupante(inquilino);

           
            Inmueble inmueble = new Inmueble();
            inmueble.setIdInmueble(rs.getInt("idInmueble"));
            

            contrato.setIdInmueble(inmueble);

            contrato.setFechaInicio(rs.getDate("fechaInicio"));
            contrato.setFechaFin(rs.getDate("fechaFin"));
            contrato.setVendedor(rs.getString("vendedor"));
            contrato.setGarante(rs.getString("garante"));
            contrato.setEstado(rs.getInt("estado"));

            contratos.add(contrato);
        }

        rs.close();
        ps.close();
    } catch (SQLException e) {
        System.out.println("(11) Algo salió mal al listar los contratos activos: " + e.getMessage());
    }

    return contratos;
    }
}
