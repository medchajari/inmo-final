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
    private int idInquilino;
    private int idInmueble;
    private LocalDate fechaRealizacion;
    private Date fechaInicio;
    private Date fechaTerminacion;
    private char marca;
    String vendedor;
    String garante;
    boolean estado;

    public Contrato() {
    }

    public Contrato(int idContrato, int idInquilino, int idInmueble, LocalDate fechaRealizacion, Date fechaInicio, Date fechaTerminacion, char marca, String vendedor, String garante, boolean estado) {
        this.idContrato = idContrato;
        this.idInquilino = idInquilino;
        this.idInmueble = idInmueble;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaInicio = fechaInicio;
        this.fechaTerminacion = fechaTerminacion;
        this.marca = marca;
        this.vendedor = vendedor;
        this.garante = garante;
        this.estado = estado;
    }

    public Contrato(int idInquilino, int idInmueble, LocalDate fechaRealizacion, Date fechaInicio, Date fechaTerminacion, String garante, boolean estado) {
        this.idInquilino = idInquilino;
        this.idInmueble = idInmueble;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaInicio = fechaInicio;
        this.fechaTerminacion = fechaTerminacion;
        this.garante = garante;
        this.estado = estado;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(Date fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
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
        return "Contrato{" + "idContrato=" + idContrato + ", idInquilino=" + idInquilino + ", idInmueble=" + idInmueble + ", fechaRealizacion=" + fechaRealizacion + ", fechaInicio=" + fechaInicio + ", fechaTerminacion=" + fechaTerminacion + ", marca=" + marca + ", vendedor=" + vendedor + ", garante=" + garante + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
}
