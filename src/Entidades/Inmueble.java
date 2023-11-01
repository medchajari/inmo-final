package Entidades;


import Entidades.Inquilino;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
                                                     
/**
 *
 * @author Kelly
 */
public class Inmueble {
    private int idInmueble;
    private Inquilino ocupante;
    private Propietario propietario;
    private int idPropietario;
    private String caracteristicas;
    private String direccion; 
    private String zona;
    private String tipoInmueble;
    private float precio;
    private String revisor;
    private int superficieMinima;
    private String observaciones;
    private int estado;

    public Inmueble() {
    }

    public Inmueble(int idInmueble, Inquilino ocupante, Propietario propietario, int idPropietario,String caracteristicas, String direccion, String zona, String tipoInmueble, float precio, String revisor, int superficieMinima, String observaciones, int estado) {
        this.idInmueble = idInmueble;
        this.ocupante = ocupante;
        this.propietario = propietario;
	this.idPropietario = idPropietario;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.zona = zona;
        this.tipoInmueble = tipoInmueble;
        this.precio = precio;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public Inmueble(Inquilino ocupante, Propietario propietario,int idPropietario, String caracteristicas, String direccion, String zona, String tipoInmueble, float precio, String revisor, int superficieMinima, String observaciones, int estado) {
        this.ocupante = ocupante;
        this.propietario = propietario;
	this.idPropietario = idPropietario;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.zona = zona;
        this.tipoInmueble = tipoInmueble;
        this.precio = precio;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public Inquilino getOcupante() {
        return ocupante;
    }

    public void setOcupante(Inquilino ocupante) {
        this.ocupante = ocupante;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
     public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public int getSuperficieMinima() {
        return superficieMinima;
    }

    public void setSuperficieMinima(int superficieMinima) {
        this.superficieMinima = superficieMinima;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int isEstado() {
        return estado;
    }
    
     public int getEstado() {
        return estado;
    }

   

    public void setEstado(int estado) {
        this.estado = estado;
    }

	@Override
	public String toString() {
		return " " + idInmueble + ' ';
	}

//  @Override
//    public String toString() {
//        //alumno.getApellido()+ "," + alumno.getNombre()+ "," + materia.getNombre();
//        return idInmueble  + "," +  ocupante.getIdInquilino() + "," + propietario.getIdPropietario() + "," + caracteristicas
//                + "," + direccion + "," + zona + "," + tipoInmueble + "," + precio + "," + superficieMinima ;
//    }	

	
    

}
