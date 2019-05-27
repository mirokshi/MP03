/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt2;

import controller.Controller;
import java.io.IOException;
import model.Model;
import view.View;

/**
 *
 * @author mirokshi
 */
public class Pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        View v=new View();
        try {
            // TODO code application logic here
            Model m=new Model();
            Controller c=new Controller(m,v);
            v.setVisible(true);
        } catch (IOException|ClassNotFoundException ex) {
            v.showMessage("Error al leer los datos.");
            System.exit(0);
        } 
    }
    }
    

