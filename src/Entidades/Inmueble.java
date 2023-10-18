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
    private String caracteristicas;
    private String direccion; 
    private String zona;
    private char tipoInmueble;
    private float precio;
    private String revisor;
    private int superficieMinima;
    private String observaciones;
    private boolean estado;

    public Inmueble() {
    }

    public Inmueble(int idInmueble, Inquilino ocupante, Propietario propietario, String caracteristicas, String direccion, String zona, char tipoInmueble, float precio, String revisor, int superficieMinima, String observaciones, boolean estado) {
        this.idInmueble = idInmueble;
        this.ocupante = ocupante;
        this.propietario = propietario;
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

    public Inmueble(Inquilino ocupante, Propietario propietario, String caracteristicas, String direccion, String zona, char tipoInmueble, float precio, String revisor, int superficieMinima, String observaciones, boolean estado) {
        this.ocupante = ocupante;
        this.propietario = propietario;
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

    public char getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(char tipoInmueble) {
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "idInmueble=" + idInmueble + ", ocupante=" + ocupante + ", propietario=" + propietario + ", caracteristicas=" + caracteristicas + ", direccion=" + direccion + ", zona=" + zona + ", tipoInmueble=" + tipoInmueble + ", precioTazado=" + precio + ", revisor=" + revisor + ", superficieMinima=" + superficieMinima + ", observaciones=" + observaciones + ", estado=" + estado + '}';
    }
    
    

}
