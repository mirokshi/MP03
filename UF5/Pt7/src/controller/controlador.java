/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import model.Person;
import model.Person.Gender;
import model.modelo;

import utilscontroller.Utils;
import view.vista;


/**
 *
 * @author mirokshi
 */
public class controlador {
    private modelo m;
    private vista v;
    

    public controlador(modelo m, vista v) {
        this.m = m;
        this.v = v;
        control();
        v.getListButton().doClick();
    }

    public void control() {

        //El mètode loadTable(...) retorna una columna que conté a cada fila 
        //l'objecte bicycle corresponent als camps de la fila 
        TableColumn tc=Utils.<Person>loadTable((ArrayList<Person>) m.getData(), v.getPeopleTable(), Person.class,false);
        
        //Codi que s'executarà quan apretem algun botó de la vista 
        ActionListener actionListener = (ActionEvent e) -> {
            //Accions a fer quan apretem el botó CRUD
            if (e.getSource().equals(v.getCrudButton())) {
                //Carreguem els objectes en les dades
                v.getModelName().setText("");
                v.getDni().setText("");
                Utils.loadCombo(Gender.values(), v.getGeneroCombo());
                Utils.loadTable((ArrayList<Person>) m.getData(), v.getPeopleTable(), Person.class, false);
                //Mostrem els panels adequats
                v.getjPanel3().removeAll();
                v.getjPanel3().repaint();
                v.getjPanel3().revalidate();
                v.getjPanel3().add(v.getjPanel5());
                v.getjPanel3().revalidate();

            }
            //Accions a fer quan apretem el botó List
            if (e.getSource().equals(v.getListButton())) {
                //Carreguem els objectes en les dades
                Utils.loadTable((ArrayList<Person>) m.getData(), v.getPeopleTableLlist(), Person.class, false);
                //Mostrem els panels adequats
                v.getjPanel3().removeAll();
                v.getjPanel3().repaint();
                v.getjPanel3().revalidate();
                v.getjPanel3().add(v.getjPanel4());
                v.getjPanel3().revalidate();

            }
            //Accions a fer quan apretem el botó Exit            
            if (e.getSource().equals(v.getExitButton())) {
                try {
                    //Guardem les dades de la taula al fitxer
                    m.saveData();
                } catch (IOException ex) {
                    v.showMessage("Error al guardar les dades.");
                }
                System.exit(0);

            }
            //Accions a fer quan apretem el botó Add            
            if (e.getSource().equals(v.getAddButton())) {
                //Passem les dades introduïdes i les afegim 
                m.addData(v.getModelName().getText().trim(), v.getDni().getText().trim(), v.getGeneroCombo().getSelectedItem());
                //Refresquem la taula
                Utils.loadTable((ArrayList<Person>) m.getData(), v.getPeopleTable(), Person.class, false);
                //Posem los camps en blanc
                v.cleanFields();
            }
            //Accions a fer quan apretem el botó Modify
            if(e.getSource().equals(v.getModifyButton())){
            
                //Guardem la fila seleccionada. Si no hi ha cap obtindrem un -1 
                int filasel=v.getPeopleTable().getSelectedRow();
                
                //Si hem seleccionat una fila actualitzem l'objecte bicicleta 
                //associat en els valors posats als components de la vista
                if(filasel!=-1){
                    //Afegim momentàniament la columna en los objectes a la taula
                    //i en això recuperem l'objecte Person que passem al mètode
                    //modifyData() del model (el seu 1r paràmetre)
                    v.getPeopleTable().getColumnModel().addColumn(tc);
                    m.modifyData(v.getPeopleTable().getValueAt(filasel, 3), 
                            v.getModelName().getText(), 
                            v.getDni().getText(),
                            v.getGeneroCombo().getSelectedItem());
                    //Tornem a eliminar la columna de la taula
                    v.getPeopleTable().getColumnModel().removeColumn(tc);

                    //Refresquem la taula
                    Utils.loadTable((ArrayList<Person>) m.getData(), v.getPeopleTable(), Person.class, false);
                    //Posem los camps en blanc
                    v.cleanFields();
                } 
                //I si no hem seleccionat mostrem missatge d'advertiment
                else v.showMessage("Has de seleccionar una bicicleta!!");
            }

            //Accions a fer quan apretem el botó Remove
            if(e.getSource().equals(v.getRemoveButton())){
            
                //Guardem la fila seleccionada. Si no hi ha cap obtindrem un -1 
                int filasel=v.getPeopleTable().getSelectedRow();
                
                //Si hem seleccionat una fila eliminem l'objecte bicicleta 
                //associat de l'ArrayList que conté les dades de l'aplicació
                if(filasel!=-1){
                    //Afegim momentàniament la columna en los objectes a la taula
                    //i en això recuperem l'objecte Person que passem al mètode
                    //removeData() del model
                    v.getPeopleTable().getColumnModel().addColumn(tc);
                    m.removeData(v.getPeopleTable().getValueAt(filasel, 3));
                    //Tornem a eliminar la columna de la taula
                    v.getPeopleTable().getColumnModel().removeColumn(tc);

                    //Refresquem la taula
                    Utils.loadTable((ArrayList<Person>) m.getData(), v.getPeopleTable(), Person.class, false);
                    //Posem los camps en blanc
                    v.cleanFields();
                } 
                //I si no hem seleccionat mostrem missatge d'advertiment
                else v.showMessage("Has de seleccionar una bicicleta!!");
            }





        };

        //Afegim els action listeners als botons
        v.getCrudButton().addActionListener(actionListener);
        v.getListButton().addActionListener(actionListener);
        v.getExitButton().addActionListener(actionListener);
        v.getAddButton().addActionListener(actionListener);
        v.getModifyButton().addActionListener(actionListener);
        v.getRemoveButton().addActionListener(actionListener);

        
        //Codi que s'executarà quan apretem sobre la taula. Les taules no accepten
        //ActionListeners, només mouseListeners o Adapters
        MouseAdapter mouseAdapter = new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //Guardem la fila seleccionada. Si no hi ha cap obtindrem un -1 
                int filasel=v.getPeopleTable().getSelectedRow();
                
                //Si hem seleccionat una fila actualitzem els components en els
                //valors de la bicicleta seleccionada
                if(filasel!=-1){
                    v.getModelName().setText(v.getPeopleTable().getValueAt(filasel, 0).toString());
                    v.getDni().setText(v.getPeopleTable().getValueAt(filasel, 1).toString());
                    v.getGeneroCombo().setSelectedItem(v.getPeopleTable().getValueAt(filasel, 2));
                } 
                //I si no hem seleccionat els posem en blanc
                else v.cleanFields();
            }

        };

        //Associem el window adapter a la vista
        v.getPeopleTable().addMouseListener(mouseAdapter);
        
        
        
        
        
        
        /**
         * *******************************************************************
         * Per a que funcione el de baix, hem de posar la propietat 
         * defaultCloseOperation del JFrame en el valor DISPOSE
         * setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
         */
        //Per a que si tanquem la finestra apretant la x fessem el mateix que si
        //sortim apretant el botó Exit
        WindowAdapter windowAdapter = new WindowAdapter() {
           
            @Override
            public void windowClosed(WindowEvent e) {
                //Mateix codi que quan apretem el botó de sortir del programa
                try {
                    //Guardem les dades de la taula al fitxer
                    m.saveData();
                } catch (IOException ex) {
                    v.showMessage("Error al guardar les dades.");
                }
                System.exit(0);
            }

        };

        //Associem el window adapter a la vista
        v.addWindowListener(windowAdapter);

    }

    
}
