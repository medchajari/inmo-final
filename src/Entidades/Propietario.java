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
public class Propietario {
    private int idPropietario;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private int telefono;
    private int estado;

    public Propietario() {
    }
    
     public Propietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public Propietario(int idPropietario, String nombre, String apellido, int dni, String domicilio, int telefono, int estado) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Propietario(String nombre, String apellido, int dni, String domicilio, int telefono, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

 

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int Estado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
     public int getEstado() {
        return estado;
    }
    

	@Override
	public String toString() {
		return nombre +" ,"+   apellido +" ,"+   dni +" ,"+   domicilio +" ,"+   telefono  +" ,"+  estado +" ,"+  '}';
	}
    
    
    
}
