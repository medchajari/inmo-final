/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Contrato;
import Entidades.Inmueble;
import Entidades.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelly
 */
public class ContratoData {
       private Connection con = null;
       private InmuebleData inmData;
       private InquilinoData inqData;
       private Inmueble inm;

public ContratoData(){        
        con=Conexion.getConexion();
        inmData = new InmuebleData();
        inqData = new InquilinoData();
        inm = new Inmueble();
}
    

    public void crearContrato(Contrato contrato){
        //INSERT INTO `contrato`(`idContrato`, `idInquilino`, `fechaFin`, `fechaInicio`, `fechaRealizacion`, `marca`, `idInmueble`, `vendedor`, `garante`, `estado`) VALUES ()
        String sql = "INSERT INTO contrato( idInquilino, fechaFin, fechaInicio, fechaRealizacion, marca, idInmueble, vendedor, garante, estado) VALUES (?,?,?,?,?,?,?,?,?,1)";
      try {
            PreparedStatement ps = con.prepareStatement(sql,ContratoData.Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, contrato.getOcupante().getIdInquilino()+"");
            ps.setDate(2, contrato.getFechaFin());
            ps.setDate(3, contrato.getFechaInicio());
            ps.setDate(4, contrato.getFechaRealizacion());
            ps.setString(5, contrato.getMarca()+"");
            ps.setInt(6, contrato.getInmueble().getIdInmueble());
            ps.setString(7, contrato.getVendedor());
            ps.setString(8, contrato.getGarante());
            ps.setBoolean(9, contrato.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
 if(rs.next()){
                
                contrato.setIdContrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Contrato guardado exitosamente.");
            
            }
            ps.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato.");
        }
    
    }
    
     private static class Statement {

        private static int RETURN_GENERATED_KEYS;

        public Statement() {
        }
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
        ps.setBoolean(6, contrato.isEstado());

        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Contrato modificado Exitosamente.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla contrato.");
    }
    }
    
    
    public void cancelarContrato(int idContrato){
        String sql = "DELETE FROM contrato WHERE idContrato = ?"; 
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idContrato);
        
        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Contrato dado de baja exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el contrato con ID proporcionado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla Contrato.");
    }
        
    }
    
    
    public void renovarContrato(int id){
        //"UPDATE inquilino SET apellido =?, nombre = ?, dni=?, cuit =?, lugarTrabajo=?, telefono=?, tipo= ? WHERE idInquilino = ?";
    
        String sql = "UPDATE `contrato` SET  fechaFin, fechaInicio, idInmueble, estado = '1' WHERE `contrato`.`idContrato` = ?";
        PreparedStatement ps = null;
        Contrato contrato = null;
        try{
            ps= con.prepareStatement(sql);
            
            ps.setDate(1, contrato.getFechaFin());
            ps.setDate(2, contrato.getFechaInicio());
            ps.setInt(3, contrato.getInmueble().getIdInmueble());
            ps.setBoolean(4, contrato.isEstado()); 
    int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Contratao renovado Exitosamente.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla contrato.");
    }
    }
    
    public List<Contrato> listarContratos() {
    List<Contrato> contratos = new ArrayList<>();
    
    String sql = "SELECT * FROM contrato";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Contrato contrato = new Contrato();
            contrato.setIdContrato(rs.getInt("idContrato"));

            // Cargar el inquilino (usando su ID, ajusta según tu implementación)
          
            Inquilino inquilino = inqData.buscarInquilinoPorDni(rs.getInt("dni"));
                    
            contrato.setOcupante(inquilino);

            // Cargar el inmueble (usando su ID, ajusta según tu implementación)
            inmData.listarInmueble(rs.getInt("idInmueble"));
            contrato.setInmueble(inm);
            contrato.setFechaRealizacion(rs.getDate("fechaRealizacion"));
            contrato.setFechaInicio(rs.getDate("fechaInicio"));
            contrato.setFechaFin(rs.getDate("fechaFin"));
            contrato.setMarca(rs.getString("marca").charAt(0));
            contrato.setVendedor(rs.getString("vendedor"));
            contrato.setGarante(rs.getString("garante"));
            contrato.setEstado(rs.getBoolean("estado"));

            contratos.add(contrato);
        }

        rs.close();
        ps.close();
    } catch (SQLException e) {
        System.out.println("Algo salió mal al listar los contratos: " + e.getMessage());
    }

    return contratos;
}
    }
