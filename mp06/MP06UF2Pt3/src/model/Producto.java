/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mirokshi
 */
public class Producto {
      private String nombre;
      private String precio;
      private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Producto(String nombre, String precio, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }

    

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return nombre + " " + precio;
    }
    
    
    
}
