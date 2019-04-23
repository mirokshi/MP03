/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author mirokshi
 */
public class Receptor implements PropertyChangeListener {
     @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (Model.PROP_DATABASE.equals(evt.getPropertyName())) {
                System.out.println("BD: " + evt.getNewValue().toString());
            
        }
        if (Model.PROP_USERDB.equals(evt.getPropertyName())) {
                System.out.println("USER: " + evt.getNewValue().toString());
            
        }
        if (Model.PROP_PASSWORDDB.equals(evt.getPropertyName())) {
                System.out.println("CORRECT PASSWORD!");
            
        }

    }
}
