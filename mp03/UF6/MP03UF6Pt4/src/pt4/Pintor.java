/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt4;

import java.util.Collection;


/**
 *
 * @author mirokshi
 */
class Pintor {

    private int pintorId;
    private String firstName;
    private String lastName;
    private int edad;
    //Asociacion de un coleccion de pinturas a un pintor
    private Collection<Pinturas> pinturas;

    
    //Obreros
    public Pintor() {
    }

    public Pintor(int pintorId, String firstName, String lastName, int edad, Collection<Pinturas> pinturas) {
        this.pintorId = pintorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.edad = edad;
        this.pinturas = pinturas;
    }

    public Pintor(int pintorId, String firstName, String lastName, int edad) {
        this.pintorId = pintorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.edad = edad;
    }

    public Pintor(int pintorId, String firstName, String lastName, Collection<Pinturas> pinturas) {
        this.pintorId = pintorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinturas = pinturas;
    }

    public Pintor(int pintorId, String first_name, String last_name) {
        this.pintorId = pintorId;
        this.firstName = first_name;
        this.lastName = last_name;
    }

    public Pintor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


//    //toString
//    @Override
//    public String toString() {
//        return "\nPintor{" + "ID: " + pintorId + "\n NOMBRE: " + firstName + "\n APELLIDO: " + lastName + "\n EDAD: " + edad + "\n PINTURA(S): " + pinturas + "}\n";
//    }

    @Override
    public String toString() {
        return "Pintor{" + "pintorId=" + pintorId + ", firstName=" + firstName + ", lastName=" + lastName + ", edad=" + edad + ", pinturas=" + pinturas + '}';
    }

    
    
    //G && S
    public int getPintorId() {
        return pintorId;
    }

    public void setPintorId(int pintorId) {
        this.pintorId = pintorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
