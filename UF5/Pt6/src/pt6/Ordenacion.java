/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt6;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author mirokshi
 */
public class Ordenacion {
    public static void main(String[] args) {
        Collection<NumerosRaros> lista=new TreeSet<>(new OrdenarNumerosRaros());
        
        
        
    }
    
}

class NumerosRaros implements Comparable
{
    private int contenido;

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String toString() {
        return "NumerosRaros{" + "contenido=" + contenido + '}';
    }

    
    
    @Override
    public int compareTo(Object o) {
            if (this.getContenido()==((NumerosRaros)o).getContenido()) return 0 ;
            if (this.getContenido()>((NumerosRaros)o).getContenido()) return -1 ;
            if (this.getContenido()<((NumerosRaros)o).getContenido()) return 1 ;
            return 0;
    }
    
}

 class OrdenarNumerosRaros implements Comparator<NumerosRaros>
{

     @Override
    public int compare(NumerosRaros o1, NumerosRaros o2) {
        if (o1.getContenido()== o2.getContenido()) return 0;
            if (o1.getContenido()<o2.getContenido()) return -1;
            if (o1.getContenido()>o2.getContenido()) return 1 ;
        return 0;
    }
    
}
