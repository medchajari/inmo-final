package Entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kelly
 */
public class Inquilino {
    private int idInquilino;
    private String apellido;
    private String nombre;
    
    private int dni;
    private int cuit;
    private String lugarTrabajo;
    private int telefono;
    private String tipo;

    public Inquilino() {
    }

    public Inquilino(int idInquilino,  String apellido,String nombre, int dni, int cuit, String lugarTrabajo, String tipo, int telefono) {
        this.idInquilino = idInquilino;
	this.apellido = apellido;
        this.nombre = nombre;        
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.telefono= telefono;
        this.tipo = tipo;
    }

    public Inquilino( String apellido,String nombre, int dni, int cuit, String lugarTrabajo, int telefono, String tipo) {
        this.apellido = apellido;
	this.nombre = nombre;        
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.telefono= telefono;
        this.tipo = tipo;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return   apellido+ " " +  nombre + " dni: " + dni  + " Tipo=" + tipo  ;
    }

   
    

}