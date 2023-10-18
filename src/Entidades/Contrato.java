package Entidades;

import java.sql.Date;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kelly
 */
public class Contrato {

    private int idContrato;
    private Inquilino ocupante;
    private Inmueble inmueble;
    private Date fechaRealizacion;
    private Date fechaInicio;
    private Date fechaFin;
    private char marca;
    String vendedor;
    String garante;
    boolean estado;

    public Contrato() {
    }

    public Contrato(int idContrato, Inquilino ocupante, Inmueble inmueble, Date fechaRealizacion, Date fechaInicio, Date fechaFin, char marca, String vendedor, String garante, boolean estado) {
        this.idContrato = idContrato;
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

    public Contrato(Inquilino ocupante, Inmueble inmueble, Date fechaRealizacion, Date fechaInicio, Date fechaFin, char marca, String vendedor, String garante, boolean estado) {
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

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", ocupante=" + ocupante + ", inmueble=" + inmueble + ", fechaRealizacion=" + fechaRealizacion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", marca=" + marca + ", vendedor=" + vendedor + ", garante=" + garante + ", estado=" + estado + '}';
    }

    

    

}
