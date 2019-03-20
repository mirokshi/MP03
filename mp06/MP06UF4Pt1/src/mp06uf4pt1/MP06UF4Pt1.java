/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp06uf4pt1;

import bean.Producte;
import bean.Receptor;
import bean.ReceptorVetador;
import java.beans.PropertyVetoException;
import java.util.Date;


/**
 *
 * @author mirokshi
 */
public class MP06UF4Pt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PropertyVetoException {
        // TODO code application logic here
        Producte b=new Producte();
        
        String[] caracteristicas = {"24 pulgadas","144hz","4k"};
        Date date = new Date();
        
        
        //Ingreso un nuevo producto
        b.setNumSerie("A123456789B");
        b.setDenominacion("Monitor");
        b.setFabricante("ASUS");
        b.setStockActual(50);
        b.setStockMin(1);
        b.setCosto(99.99f);
        b.setPvp(149.99f);
        b.setAnyFabricacion(2015);
        b.setCaracteristicas(caracteristicas);
        b.setCategoria("Componentes");
        b.setUbicacion("Almacen 1A");
        b.setFechaAlta(date);

        
        Receptor r=new Receptor();
        ReceptorVetador rv=new ReceptorVetador();
        b.addPropertyChangeListener(r);
        b.addVetoableChangeListener(rv);
        
        
        System.out.println("--1--");
        System.out.println("Intento cambio a la propiedad Stock Actual");
        System.out.println("Valor actual: "+b.getStockActual());
        System.out.println("Nuevo valor: -20");
        try {
            b.setStockActual(-20);
        } catch (PropertyVetoException e) {
            System.out.println("\nNo se ha permitido el cambio\n");
        }
        
        System.out.println("--2--");
        System.out.println("Intento cambio al Stock Minimo");
        System.out.println("Valor actual: "+b.getStockMin());
        System.out.println("Nuevo valor: 20");
        try {
            
            b.setStockMin(20);
        } catch (PropertyVetoException e) {
            System.out.println("\nNo se ha permitido el cambio\n");
        }
            
//              System.out.println("--3--");
//        System.out.println("Intento cambio al Stock Minimo");
//        System.out.println("Valor actual: "+b.getPvp());
//        System.out.println("Nuevo valor: 20");
//        try {
//            
//            b.setPvp(-9.0f);
//        } catch (PropertyVetoException e) {
//            System.out.println("\nNo se ha permitido el cambio\n");
//        }
//          
                
        if (b.getStockActual()<=b.getStockMin()) {
            System.out.println("El stock actual es menor al minimo");
        }
        
        if (b.getAnyFabricacion()<b.getAnyFabricacion()-5 || b.getAnyFabricacion()<b.getFechaAlta().getYear()) {
            System.out.println("El año de fabricación es inferior a hace 5 años o superior al año actual");
        }
    }
    
}
