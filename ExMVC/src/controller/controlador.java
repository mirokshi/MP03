/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.modelo;
import view.vista;
/**
 *
 * @author mirokshi
 */
public class controlador implements ActionListener{

private modelo model;
private vista view;

public controlador(vista view, modelo model){
    this.view = view;
    this.model = model;
    this.view.multiplicar.addActionListener(this);
}
    
public void  iniciar(){
    view.setTitle("MVC");
    view.setLocationRelativeTo(null);
    
}

public void actionPerformed(ActionEvent e){
    model.setNum(Integer.parseInt(view.jTextField1.getText()));
    model.setNum2(Integer.parseInt(view.jTextField2.getText()));
    model.multiplicar();
    view.textResult.setText(String.valueOf(model.getResult()));
}
    
}
