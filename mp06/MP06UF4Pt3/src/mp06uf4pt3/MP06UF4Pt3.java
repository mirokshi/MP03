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
//        PINTORES Y PINTURAS FAMOSAS 
         VistaPintores vista=new VistaPintores(); 
         Model model=new Model();
         Receptor r = new Receptor();
         ReceptorVetador rv = new ReceptorVetador();
         model.addPropertyChangeListener(r);
         model.addVetoableChangeListener(rv);
         
         
         model.setUserDb("debian-sys-maint");
         model.setPasswordDb("VhwKTX3PssrBuWGp");
         Controlador controlador = new Controlador(model, vista);
         vista.setVisible(true);
        
        
    }
}
