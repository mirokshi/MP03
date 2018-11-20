/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.model;
import vista.vista;

/**
 *
 * @author mirokshi
 */
public class controlador {
    private vista v;
    private model m;

    
    public controlador(vista v, model m) {
        this.v = v;
        this.m = m;
        control();
    }
    
    public void control(){
        ActionListener al= (ActionEvent e) -> {
            //Miro si el objecto que provoca la accion es el boton de calcular
            if (e.getSource().equals(v.getCalcularButton())) {
                   
                //Calculo la posicion de la palabra dentro de la frase 
                m.calcularPosicion(v.getFraseTextField().getText().trim(), v.getPalabraTextField().getText().trim());
                
                //Modifico la posicion mostrada a la vista
                v.getPosicionLabel().setText("Posicion : "+ m.getPosicion());
            }
        };
        
        //Asocion el ActionListener con los componentes que me interesan
        v.getCalcularButton().addActionListener(al);
        
    }
    
    
}
