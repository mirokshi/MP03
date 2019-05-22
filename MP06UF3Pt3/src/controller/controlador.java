/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.modelo;
import org.bson.Document;
import view.vista;


/**
 *
 * @author mirokshi
 */
public final class controlador {
    vista v;
    modelo m;
    
    
    public controlador(vista v , modelo m){
        this.v = v;
        this.m = m;
        this.v.setVisible(true);

        listBd();
        actions();
    }

    public void listBd(){
        DefaultComboBoxModel model = new DefaultComboBoxModel(m.getBd());
        v.comboboxBd.setModel(model);
    }
    
    public void listCollection(ActionEvent evt){
        String bd = v.comboboxBd.getSelectedItem().toString();
        DefaultComboBoxModel model = new DefaultComboBoxModel(m.getCollection(bd));
        v.comboxColeccion.setModel(model);
         
    }
    
    public void listDocuments(ActionEvent evt){
        String document = v.comboxColeccion.getSelectedItem().toString();
        DefaultListModel model = new DefaultListModel();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        for (Document s : m.getDocument(document)) {
            JsonElement je=jp.parse(s.toJson());
            model.addElement(gson.toJson(je));
        }
        v.JListdocument.setModel(model);
    }
    
    public void listKeysDocument(ActionEvent evt){
        DefaultComboBoxModel model = new DefaultComboBoxModel(m.getKeysDocument());
        v.keysCombo.setModel(model);
    }
    
    public void actions(){
        
        ActionListener al=(ActionEvent e) -> {
            if (e.getSource().equals(v.getComboboxBd())) {
                listCollection(e);
                System.out.println("1 :"+ v.comboboxBd.getSelectedItem());   
            }
            if(e.getSource().equals(v.getComboxColeccion())){
                listDocuments(e);
                System.out.println("2 :"+v.comboxColeccion.getSelectedItem());
            }
            if(e.getSource().equals(v.getKeysCombo())){
                listKeysDocument(e);
                
            }
                    
        };
        
        v.JListdocument.addListSelectionListener((ListSelectionEvent e) -> {
            JTextArea tA =  v.getTextAreaDocuments();
            tA.setText(v.getJListdocument().getSelectedValue());
            v.setTextAreaDocuments(tA);
            System.out.println("3: "+ v.JListdocument.getSelectedValue());
            
        });
        
        v.comboboxBd.addActionListener(al);
        v.comboxColeccion.addActionListener(al);   
    }

    
    }

