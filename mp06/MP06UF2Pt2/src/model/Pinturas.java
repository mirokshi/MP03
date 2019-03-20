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
public class Pinturas {
    
    private int id;
    private String nombre;
    private String epoca;
    private int fecha_creacion;
    private Pintores id_pintor;

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

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public int getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(int fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Pintores getId_pintor() {
        return id_pintor;
    }

    public void setId_pintor(Pintores id_pintor) {
        this.id_pintor = id_pintor;
    }
    
    
           
}
