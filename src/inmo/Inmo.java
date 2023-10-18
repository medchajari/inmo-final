/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmo;

import AccesoADatos.Conexion;
import AccesoADatos.PropietarioData;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Inmo {

    
    public static void main(String[] args) {
        
        Connection conexion = Conexion.getConexion();
        Propietario prop = new Propietario();
        PropietarioData proD= new PropietarioData();

//----------------------------------------GUARDAR PROPIETARIO-------------------------------------------
      proD.guardarPropietario(new Propietario("Fabricio","enrique",5445554,"cordoba 220",15444872,true));
//----------------------------------------ELIMINAR PROPIETARIO-----------------------------------------
//    int idPropietarioAEliminar = 5;
//    proD.eliminarPropietario(idPropietarioAEliminar);
//	try {
//        conexion.close();
//	} catch (SQLException e) {
//	}
////----------------------------------------MODIFICAR PROPIETARIO----------------------------------------
//    Propietario propietarioAModificar = new Propietario();
//    propietarioAModificar.setIdPropietario(1); 
//    propietarioAModificar.setNombre("Juana");
//    propietarioAModificar.setApellido("baaaa");
//    propietarioAModificar.setDni(335648);
//    propietarioAModificar.setTelefono(1656877);
//    propietarioAModificar.setDomicilio("Pablo Stampa 1325");
//    propietarioAModificar.setEstado(false);
//
//    
//	proD.modificarPropietario(propietarioAModificar);
//    try {
//        conexion.close();
//    } catch (SQLException e) {
//    }
//----------------------------------------BUSCAR PROPIETARIO POR DNI---(tener en cuenta activo y no activo)---------------------------------
//        Propietario propEncont= proD.buscarPropietarioPorDni(335648);
//
//        if(propEncont != null){
//            System.out.println("Dni: " + propEncont.getDni());
//            System.out.println("Apellido: " + propEncont.getApellido());
//	    System.out.println("Nombre: " + propEncont.getNombre());
//	    System.out.println("Domicilio: " + propEncont.getDomicilio());
//	    System.out.println("Telefono: " + propEncont.getTelefono());
//        }
//---------------------------------------LISTAR PROPIETARIOS---------------------(tener en cuenta activo y no activo, con opcion)---------------------------
//   ArrayList<Propietario> propietarios = proD.listarPropietarios();
//
//		for (Propietario propietario : propietarios) {
//			System.out.println(propietario+"\n"+"----------------------------------------------------------------------"); 
//		}
//
//		try {
//			conexion.close();
//		} catch (SQLException e) {
//		}







}
   



    

    }
    
