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
    private int idPropietario;
    String caracteristicas;
    String accesibilidad;
    String direccion ;
    boolean estadoLocal;
    String forma;
    Inquilino ocupante;
    float precioTazado;
    String revisor;
    int superficieMinima;
    char tipoLocal;
    String zona;
    boolean estado;

    public Inmueble() {
    }

    //constructor con todos los atributos, falta contructor con atributos mas importantes

    public Inmueble(int idInmueble, int idPropietario, String caracteristicas, String accesibilidad, String direccion, boolean estadoLocal, String forma, Inquilino ocupante, float precioTazado, String revisor, int superficieMinima, char tipoLocal, String zona, boolean estado) {
        this.idInmueble = idInmueble;
        this.idPropietario = idPropietario;
        this.caracteristicas = caracteristicas;
        this.accesibilidad = accesibilidad;
        this.direccion = direccion;
        this.estadoLocal = estadoLocal;
        this.forma = forma;
        this.ocupante = ocupante;
        this.precioTazado = precioTazado;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
        this.estado = estado;
    }

    public Inmueble(int idInmueble, String caracteristicas, String accesibilidad, String direccion, boolean estadoLocal, String forma, int superficieMinima, char tipoLocal, String zona, boolean estado) {
        this.idInmueble = idInmueble;
        this.caracteristicas = caracteristicas;
        this.accesibilidad = accesibilidad;
        this.direccion = direccion;
        this.estadoLocal = estadoLocal;
        this.forma = forma;
        this.superficieMinima = superficieMinima;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
        this.estado = estado;
    }
   

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }


    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstadoLocal() {
        return estadoLocal;
    }

    public void setEstadoLocal(boolean estadoLocal) {
        this.estadoLocal = estadoLocal;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Inquilino getOcupante() {
        return ocupante;
    }

    public void setOcupante(Inquilino ocupante) {
        this.ocupante = ocupante;
    }

    public float getPrecioTazado() {
        return precioTazado;
    }

    public void setPrecioTazado(float precioTazado) {
        this.precioTazado = precioTazado;
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

    public char getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(char tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "idInmueble=" + idInmueble + ", idPropietario=" + idPropietario + ", caracteristicas=" + caracteristicas + ", accesibilidad=" + accesibilidad + ", direccion=" + direccion + ", estadoLocal=" + estadoLocal + ", forma=" + forma + ", ocupante=" + ocupante + ", precioTazado=" + precioTazado + ", revisor=" + revisor + ", superficieMinima=" + superficieMinima + ", tipoLocal=" + tipoLocal + ", zona=" + zona + ", estado=" + estado + '}';
    }

    
    
    
}
