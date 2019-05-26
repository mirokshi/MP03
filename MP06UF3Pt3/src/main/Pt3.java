/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.controlador;
import model.modelo;
import org.bson.Document;
import view.vista;

/**
 *
 * @author mirokshi
 */
public class Pt3 {

    Document document;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            vista v = new vista();
            modelo m = new modelo();
            controlador c = new controlador(v,m);            
    }
    
}
