/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

/**
 *
 * @author mirokshi
 */
public class ReceptorVetador implements VetoableChangeListener{
    
    @Override
    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
        //DATABASE
        if (Model.PROP_DATABASE.equals(evt.getPropertyName())) {
//            String regex = "jdbc:mysql:\\/\\/[\\S]+[:][\\d]+[/][\\S]+[?]+[\\S]+";
             evt.getNewValue().toString();
            System.out.println("Cambio a la propiedad: "+evt.getPropertyName());
            System.out.println("Valor anterior: "+evt.getOldValue());
            System.out.println("Valor actual: "+evt.getNewValue());
        }
        //USER
        if (Model.PROP_USERDB.equals(evt.getPropertyName())) {
//            String regex = "\\s";
             evt.getNewValue().toString();
             System.out.println("Cambio a la propiedad: "+evt.getPropertyName());
            System.out.println("Valor anterior: "+evt.getOldValue());
            System.out.println("Valor actual: "+evt.getNewValue());
             
        }
        //PASSWORD
        if (Model.PROP_PASSWORDDB.equals(evt.getPropertyName())) {
//          String regex = "\\s";
             evt.getNewValue().toString();
             System.out.println("Cambio a la propiedad: "+evt.getPropertyName());
            System.out.println("Valor anterior: "+evt.getOldValue());
            System.out.println("Valor actual: "+evt.getNewValue());
        }
    }
}
