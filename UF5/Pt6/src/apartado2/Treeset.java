/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado2;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mirokshi
 */
public class Treeset {

    public static void main(String[] args) {
        Set<Libro> set = new TreeSet<>();

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
         Iterator<Libro> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
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
