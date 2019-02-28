/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt5;

import java.util.Collection;


/**
 *
 * @author mirokshi
 */
class Pintor {

    private int id;
    private String nombre;
    private String apeliido;
    private int edad;
    //Asociacion de un coleccion de pinturas a un pintor
    private Collection<Pinturas> pinturas;

    
    //Obreros
    public Pintor() {
    }

    public Pintor(int pintorId, String firstName, String lastName, int edad, Collection<Pinturas> pinturas) {
        this.id = pintorId;
        this.nombre = firstName;
        this.apeliido = lastName;
        this.edad = edad;
        this.pinturas = pinturas;
    }

    public Pintor(int pintorId, String firstName, String lastName, int edad) {
        this.id = pintorId;
        this.nombre = firstName;
        this.apeliido = lastName;
        this.edad = edad;
    }

    public Pintor(int pintorId, String firstName, String lastName, Collection<Pinturas> pinturas) {
        this.id = pintorId;
        this.nombre = firstName;
        this.apeliido = lastName;
        this.pinturas = pinturas;
    }

    public Pintor(int pintorId, String first_name, String last_name) {
        this.id = pintorId;
        this.nombre = first_name;
        this.apeliido = last_name;
    }

    public Pintor(String firstName, String lastName) {
        this.nombre = firstName;
        this.apeliido = lastName;
    }



    @Override
    public String toString() {
       if(this.pinturas == null) return "Pintor{" + "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apeliido + ", Edad: " + edad + "  ESTE PINTOR NO TIENE PINTURAS";
       return "Pintor{" + "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apeliido + ", Edad: " + edad + ", Pinturas: "+ pinturas +" }\n";
    }


    

    
    
    //G && S
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

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public Collection<Pinturas> getPinturas() {

        return pinturas;
        
    }

    public void setPinturas(Collection<Pinturas> pinturas) {
        this.pinturas = pinturas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
