package Entidades;

import java.sql.Date;


public class Contrato {

    private int idContrato;
    private Inquilino ocupante;
    private Inmueble inmueble;
    private java.sql.Date fechaRealizacion;
    private java.sql.Date fechaInicio;
    private java.sql.Date fechaFin;
    private char marca;
     private Inmueble idInmueble;
    String vendedor;
    String garante;
    int estado;

    public Contrato() {
    }

    public Contrato(int idContrato, Inquilino ocupante, Inmueble inmueble, Date fechaRealizacion, Date fechaInicio, Date fechaFin, char marca, Inmueble idInmueble, String vendedor, String garante, int estado) {
        this.idContrato = idContrato;
        this.ocupante = ocupante;
        this.inmueble = inmueble;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.marca = marca;
	this.idInmueble= idInmueble;
        this.vendedor = vendedor;
        this.garante = garante;
        this.estado = estado;
    }

    public Contrato(Inquilino ocupante, Inmueble inmueble, Date fechaRealizacion, Date fechaInicio, Date fechaFin, char marca, String vendedor, String garante, int estado) {
        this.ocupante = ocupante;
        this.inmueble = inmueble;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.marca = marca;
        this.vendedor = vendedor;
        this.garante = garante;
        this.estado = estado;
    }


    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Inquilino getOcupante() {
        return ocupante;
    }

    public void setOcupante(Inquilino ocupante) {
        this.ocupante = ocupante;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

   public java.sql.Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(java.sql.Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public java.sql.Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(java.sql.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public java.sql.Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(java.sql.Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }
    
    public Inmueble getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Inmueble idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getGarante() {
        return garante;
    }

    public void setGarante(String garante) {
        this.garante = garante;
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", ocupante=" + idInmueble+ocupante + ", inmueble=" + inmueble + ", fechaRealizacion=" + fechaRealizacion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", marca=" + marca + ", vendedor=" + vendedor + ", garante=" + garante + ", estado=" + estado + '}';
    }

	

    

    

}
