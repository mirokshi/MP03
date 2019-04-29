/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp06uf4pt3;

import controller.Controlador;
import java.beans.PropertyVetoException;

import model.Model;
import model.Receptor;
import model.ReceptorVetador;
import view.VistaPintores;

/**
 *
 * @author mirokshi
 */
public class MP06UF4Pt3{

    /**
     * @param args the command line arguments
     * @throws java.beans.PropertyVetoException
     */
    public static void main(String[] args)  throws PropertyVetoException {
         VistaPintores vista=new VistaPintores(); 
         Model model=new Model();
         Receptor r = new Receptor();
         ReceptorVetador rv = new ReceptorVetador();
         model.addPropertyChangeListener(r);
         model.addVetoableChangeListener(rv);
         
         String i ="jdbc:mysql://localhost:3306/";
         String f ="?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
         String bd="mp03";
         
         try {
            model.setDatabase(i+bd+f);
        } catch (PropertyVetoException e) {
        }
         
         try {
         model.setUserDb("debian-sys-maint");   
        } catch (PropertyVetoException e) {
             System.out.println("\nNo se ha permitido el cambio\n");
        }
         
         try {
            model.setPasswordDb("VhwKTX3PssrBuWGp");
        } catch (PropertyVetoException e) {
            System.out.println("\nNo se ha permitido el cambio\n");
        }
         
         
         Controlador controlador = new Controlador(model, vista);
         vista.setVisible(true);
         
        
        
    }
}
