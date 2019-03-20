/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

/**
 *
 * @author mirokshi
 */
public class ReceptorVetador implements VetoableChangeListener {

    @Override
    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
        if ((int)evt.getNewValue()<0) {
            System.out.println("Cambio impedido a la propiedad :"+evt.getPropertyName());
            System.out.println("Motivo: nuevo valor "+evt.getNewValue()+" incorrecto");
            throw new PropertyVetoException("error",evt);
        }else{
        System.out.println("Cambio a la propiedad: "+evt.getPropertyName());
        System.out.println("Valor anterior: "+evt.getOldValue());
        System.out.println("Valor actual: "+evt.getNewValue());
        }
    }
    
}
