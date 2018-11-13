/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 *
 * @author mirokshi
 */
public class Arraylist {

    public static void main(String[] args) {
        
        Collection<tienda> productos=new ArrayList<>();
        
        
        tienda p=new tienda("raton", 10, 246.20);
        tienda p2=new tienda("teclados", 15, 315.98);
        tienda p3=new tienda("monitores", 3, 626.30);
        tienda p4=new tienda("disco duro", 7 , 687.90);
        
        //agrego
        productos.add(p);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        
        
        productos.forEach(s->System.out.println(s));     
        
        //elimmino todo
       productos.remove(p3);
        
        //muestro
         Iterator<tienda> it=productos.iterator();
         System.out.println("\n");
        while (it.hasNext()) {
            
            System.out.println(it.next());
        }
      
        
    }
    
}

class tienda {
    
    private String producto;
    private int cantidad;
    private double precio;
    

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public tienda(String producto, int cantidad, double precio) {
        
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda" + "{ Producto : " + producto + ", Cantidad : " + cantidad + ", Precio= : " + precio + "€ }";
    }

    

    

}

class cliente {
    private String dni;
    private String nombre;

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\ncliente{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
    
}

        
