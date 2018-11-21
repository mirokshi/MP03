/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mirokshi
 */
public class Treeset {
    
public static void main(String[] args) {
    
    
        Set<Libro> set = new TreeSet<>(new OrdenarLibros());

        //Creo libro
        Libro b1 = new Libro(121, " Citas del Presidente Mao Tse-Tung", "Mao Tse-Tung", 820000000);
        Libro b2 = new Libro(233, "Harry Potter", "J.K. Rowling", 400000000);
        Libro b3 = new Libro(101, "El Alquimista", "Paulo Coelho", 65000000);
        Libro b4 = new Libro(271, "El diario de Ana Frank", "Ana Frank", 27000000);

        //Añado los libro al Treeset
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        
        
        //Listo los libros 
        set.forEach(Libro -> {
            System.out.println(Libro);
        });
        
    }
}

class Libro implements Comparable<Libro> {

    int id;
    String nombre, autor;
    int cantidad;

    public Libro(int id, String nombre, String autor, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Libro " + "\nID: " + id + "\nNombre: " + nombre + "\nAutor: " + autor + "Numero de copias: " + cantidad + '\n';
    }

    //De menor a mayor
    public int compareTo(Libro b) {
        if (id > b.id) return 1; 
        if (id < b.id) return -1;
        if (id == b.id) return 0;
        return 0;
        
    }

}

class OrdenarLibros implements Comparator<Libro>{

    //Ordeno de mayor a menor
    @Override
    public int compare(Libro libro1, Libro libro2) {
                
        if(libro1.id == libro2.id) return 0;
        if(libro1.id < libro2.id) return 1;
        if(libro1.id > libro2.id) return -1;
        return 0;
    }
    
}

