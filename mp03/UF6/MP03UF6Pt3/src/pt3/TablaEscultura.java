/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt3;

/**
 *
 * @author mirokshi
 */
public class TablaEscultura {
    private int EsculturaID;
    private String nombre;
    private int fecha;
    private String descripcion="escultura";

    
    
    
    public TablaEscultura() {
    }

    @Override
    public String toString() {
        return "TablaEscultura{" + "EsculturaID=" + EsculturaID + ", nombre=" +
                nombre + ", fecha=" + fecha + ", descripcion=" + descripcion + '}';
    }

    public int getEsculturaID() {
        return EsculturaID;
    }

    public void setEsculturaID(int EsculturaID) {
        this.EsculturaID = EsculturaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
