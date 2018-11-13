/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author mirokshi
 */
public class Pt6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    cajaStrings cs=new cajaStrings();
    cs.set("una cadena");    
    System.out.println(cs.get());
    
    cajaObjetos co=new cajaObjetos();
    co.set("una cadena");
    String contenido=(String)co.get();
    System.out.println(contenido);
    co.set(new Double(0.0));
        
    cajaGeneral<Double> cg=new cajaGeneral<Double>();
    cg.set(0.0);
    System.out.println(cg.get());
    
    Collection<String> lista=new ArrayList<String>();
    
    lista.add("Primera cadena");
    lista.add("Segunda cadena");
    
    Iterator<String> it=lista.iterator();
            
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    
    }
    
    Collection<String> listaT=new TreeSet<String>();
    
    
}

class cajaStrings
{
    private String contenido;
    
    public void set(String s)
    {        
        contenido=s;
    }
    
    public String get()
    {
    return contenido;    
    }
}

class cajaObjetos
{
    private Object contenido=null;
    
    public void set(Object o)
    {
        contenido=o;
    }
    
    public Object get()
    {
        return contenido;
    }
}



class cajaGeneral <T>
{
    private T contenido=null;
    
    public void set(T s)
    {
        contenido=s;
    }
    
    public T get()
    {
        return contenido;
    }
            
}
