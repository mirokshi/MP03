/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exmvc;

import controller.controlador;
import model.modelo;
import view.vista;

/**
 *
 * @author mirokshi
 */
public class ExMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelo mod = new modelo();
        vista view = new vista();
        
        controlador ctrl = new controlador(view, mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
