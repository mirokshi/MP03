/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mirokshi
 */
public class ReceptorVetador implements VetoableChangeListener{
    
    @Override
    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
        if (Model.PROP_DATABASE.equals(evt.getPropertyName())) {
            String pattern = "jdbc:mysql:\\/\\/[\\S]+[:][\\d]+[/][\\S]+[?]+[\\S]+";
            String i ="jdbc:mysql://localhost:3306/";
            String f ="?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Pattern r = Pattern.compile(pattern);
            System.out.println(evt.getNewValue().toString());
            Matcher m = r.matcher(evt.getNewValue().toString());
            if (!m.find()) {
                System.out.println("Error al cambiar de base de datos");
                throw new PropertyVetoException("error", evt);
            }

        }
        if (Model.PROP_USERDB.equals(evt.getPropertyName())) {
            String pattern =  "\\s";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(evt.getNewValue().toString());
            if (m.find()) {
                System.out.println("Error al cambiar el usuario");
                throw new PropertyVetoException("error", evt);
            }


        }
        if (Model.PROP_PASSWORDDB.equals(evt.getPropertyName())) {
            String pattern = "\\s";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(evt.getNewValue().toString());
            if (m.find()) {
                System.out.println("Error al cambiar la contraseña");
            throw new PropertyVetoException("error", evt);
            
            }

        }
    }
}
