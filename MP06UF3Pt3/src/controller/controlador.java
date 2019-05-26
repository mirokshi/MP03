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
import javax.swing.JComboBox;
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
        this.v.setResizable(false);

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
    
    public void listKeysDocument(ListSelectionEvent evt){
        Document doc = Document.parse(v.getJListdocument().getSelectedValue());
          DefaultComboBoxModel model = new DefaultComboBoxModel();
           String[] keys = m.getKeysDocument(doc);
        for (String key : keys) {
            model.addElement(key);
        }
        v.keysCombo.setModel(model);
    }
    
    
    public Object listValuesDocument(){
        Document doc = Document.parse(v.getJListdocument().getSelectedValue());
        return doc.get(v.getKeysCombo().getSelectedItem().toString());
    }
    
    public void updateDocument(){
        Document doc = Document.parse(v.getJListdocument().getSelectedValue());
        m.updateDocument(doc, v.getTextAreaDocuments().getText());
    }
    
    public void actions(){
        ActionListener al=(ActionEvent e) -> {
            if (e.getSource().equals(v.getComboboxBd())) {
                listCollection(e);
                System.out.println("Combo1 :"+ v.comboboxBd.getSelectedItem());   
            }
            if(e.getSource().equals(v.getComboxColeccion())){
                listDocuments(e);
               System.out.println("Combo2 :"+v.comboxColeccion.getSelectedItem());
            }
            if(e.getSource().equals(v.getKeysCombo())){
                System.out.println("Combo3 :"+v.keysCombo.getSelectedItem());
                JTextArea ta = v.getTextAreaKey();
                ta.setText(listValuesDocument().toString());
            }
            if(e.getSource().equals(v.getBtnInsertCollection())){
                System.out.println("Button1");
                m.insertDocument(v.getTextAreaDocuments().getText());
            }
            if (e.getSource().equals(v.getBtnBorrarCollection())) {
                System.out.println("Button2");
                m.deleteDocumuent(v.getTextAreaDocuments().getText());
            }
            if (e.getSource().equals(v.getBtnUpdateCollection())) {
                System.out.println("Button3");
                updateDocument();
            }
            
        };
        
        v.JListdocument.addListSelectionListener((ListSelectionEvent e) -> {
            JTextArea tA =  v.getTextAreaDocuments();
            tA.setText(v.getJListdocument().getSelectedValue());
            v.setTextAreaDocuments(tA);
            listKeysDocument(e);
            
        });
        
        v.comboboxBd.addActionListener(al);
        v.comboxColeccion.addActionListener(al);
        v.keysCombo.addActionListener(al);
        v.btnInsertCollection.addActionListener(al);
        v.btnDeleteCollection.addActionListener(al);
        v.btnUpdateCollection.addActionListener(al);
    }
}

