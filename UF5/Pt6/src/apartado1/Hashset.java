/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado1;

import java.util.*; 
/**
 *
 * @author mirokshi
 */
public class Hashset {
    

	public static void main(String[]args) 
	{ 
		HashSet<String> h = new HashSet<String>(); 

		// Adding elements into HashSet usind add() 
		h.add("India"); 
		h.add("Australia"); 
		h.add("South Africa"); 
		h.add("India");// adding duplicate elements 

		// Displaying the HashSet 
		System.out.println(h); 
		System.out.println("List contains India or not:" + 
						h.contains("India")); 

		// Removing items from HashSet using remove() 
		h.remove("Australia"); 
		System.out.println("List after removing Australia:"+h); 

		// Iterating over hash set items 
		System.out.println("Iterating over list:"); 
		Iterator<String> i = h.iterator(); 
		while (i.hasNext()) 
			System.out.println(i.next()); 
	} 
}

class Pais {
    private String nombre;
    private double extension;
    private int poblacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Pais(String nombre, double extension, int poblacion) {
        this.nombre = nombre;
        this.extension = extension;
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", extension=" + extension + ", poblacion=" + poblacion + '}';
    }
    
    

    
    
}


class Persona
{
    String nombre;
    int edad;
    
    
    
}

