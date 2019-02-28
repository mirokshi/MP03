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
		HashSet<pais> pais= new HashSet<>(); 

                pais pais1=new pais("India", 3287263, 1210193422);
                pais pais2=new pais("Uganda", 241038, 42971836);
                pais pais3=new pais("Brasil",8515770, 208385000);
                pais pais4=new pais("Grecia", 131957, 11329600);
                       
                
                //agrego 4 paises
                pais.add(pais1); 
		pais.add(pais2); 
		pais.add(pais3); 
                pais.add(pais4);
		pais.add(pais1);// agrego un elemento duplicado

                
                //Listo los elementos
                System.out.println(pais);
                
                 //Total de elementos en la lista
                System.out.println("Numero de paises en la lista"+ pais.size());
                
                
                //Uso la clase contains
		System.out.println("La lista contiene Grecia? : " + pais.contains(pais4)); 

		// Elimino uno de la lista
		pais.remove(pais2); 
		System.out.println("Liste despues de quitar Uganda:\n"+pais); 

	} 
}

class pais {
    private String nombre;
    private int extension;
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

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public pais(String nombre, int extension, int poblacion) {
        this.nombre = nombre;
        this.extension = extension;
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", extension=" + extension + "km2 , poblacion=" + poblacion + "hab. }\n";
    }
    
    
    
}

class Persona
{
    private String nombre;
    private String apellido;
    private int edad;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}

