/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvcmysql;

import mvcmysql.view.VistaPintores;
import mvcmysql.model.Model;
import mvcmysql.controller.Controlador;

/**
 *
 * @author profe
 */
public class MVCMySQL {
    
    static Model model=new Model();
    static VistaPintores vista=new VistaPintores();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        PINTORES Y PINTURAS FAMOSAS 
        Controlador controlador = new Controlador(model, vista);
    }
    
}
