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
public class Almacen {
    private String nombre;
    private int capacidad;
    private int id;

    public Almacen() {
        
    }

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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Almacen(String nombre, int capacidad, int id) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.id = id;
    }

    
}
