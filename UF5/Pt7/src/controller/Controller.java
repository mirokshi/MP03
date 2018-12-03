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
import model.Entinguisher;
import model.Entinguisher.Type;
import model.Entinguisher.Size;
import model.Model;
import model.ModelNameValidator;
import utilscontroller.Utils;
import view.View;

/**
 *
 * @author profe
 */
public class Controller {

    private Model m;
    private View v;

    //Declaro la clase ModelNameValidator
    ModelNameValidator nameValidator = new ModelNameValidator();

    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;
        control();
        v.getListButton().doClick();
    }

    public void control() {

        TableColumn tc = Utils.<Entinguisher>loadTable((ArrayList<Entinguisher>) m.getData(), v.getEntinguisherTable(), Entinguisher.class, false);

        ActionListener actionListener = (ActionEvent e) -> {
            //Accion boton CRUD
            if (e.getSource().equals(v.getCrudButton())) {
                v.getModelName().setText("");
                Utils.loadCombo(Type.values(), v.getTypeCombo());
                Utils.loadCombo(Size.values(), v.getSizeCombo());
                Utils.loadTable((ArrayList<Entinguisher>) m.getData(), v.getEntinguisherTable(), Entinguisher.class, false);
                v.getjPanel3().removeAll();
                v.getjPanel3().repaint();
                v.getjPanel3().revalidate();
                v.getjPanel3().add(v.getjPanel5());
                v.getjPanel3().revalidate();

            }
            //Accion boton List
            if (e.getSource().equals(v.getListButton())) {
                Utils.loadTable((ArrayList<Entinguisher>) m.getData(), v.getExtinguisherTableList(), Entinguisher.class, false);
                v.getjPanel3().removeAll();
                v.getjPanel3().repaint();
                v.getjPanel3().revalidate();
                v.getjPanel3().add(v.getjPanel4());
                v.getjPanel3().revalidate();

            }
            //Accion salir
            if (e.getSource().equals(v.getExitButton())) {
                try {
                    m.saveData();
                } catch (IOException ex) {
                    v.showMessage("Error when saving data.");
                }
                System.exit(0);

            }
            //Accion agregar
            if (e.getSource().equals(v.getAddButton())) {

                
                //Utilizo el metodo Validate de la clase que e ccreado para comprobar si el nombre del modelo es correcto
                if (!nameValidator.validate(v.getModelName().getText().trim())) {
                    v.showMessage("Invalid model name");

                } else {
                    m.addData(v.getModelName().getText().trim(), v.getTypeCombo().getSelectedItem(), v.getSizeCombo().getSelectedItem());
                    Utils.loadTable((ArrayList<Entinguisher>) m.getData(), v.getEntinguisherTable(), Entinguisher.class, false);
                    v.cleanFields();
                }

            }
            //Accion modificar
            if (e.getSource().equals(v.getModifyButton())) {

                int filasel = v.getEntinguisherTable().getSelectedRow();

                if (filasel != -1) {
                    //Utilizo el metodo Validate de la clase que e ccreado para comprobar si el nombre del modelo es correcto
                    if (!nameValidator.validate(v.getModelName().getText().trim())) {
                        v.showMessage("Invalid model name");

                    } else {
                        v.getEntinguisherTable().getColumnModel().addColumn(tc);
                        m.modifyData(v.getEntinguisherTable().getValueAt(filasel, 3),
                                v.getModelName().getText(),
                                v.getTypeCombo().getSelectedItem(),
                                v.getSizeCombo().getSelectedItem());
                        v.getEntinguisherTable().getColumnModel().removeColumn(tc);

                        Utils.loadTable((ArrayList<Entinguisher>) m.getData(), v.getEntinguisherTable(), Entinguisher.class, false);
                        v.cleanFields();
                    }
                } else {
                    v.showMessage("You have to select an item!!!");
                }
            }

            //Accion borrar
            if (e.getSource().equals(v.getRemoveButton())) {

                int filasel = v.getEntinguisherTable().getSelectedRow();

                if (filasel != -1) {
                    v.getEntinguisherTable().getColumnModel().addColumn(tc);
                    m.removeData(v.getEntinguisherTable().getValueAt(filasel, 3));
                    v.getEntinguisherTable().getColumnModel().removeColumn(tc);
                    Utils.loadTable((ArrayList<Entinguisher>) m.getData(), v.getEntinguisherTable(), Entinguisher.class, false);
                    v.cleanFields();
                } else {
                    v.showMessage("You have to select an item!!!");
                }
            }

        };

        //Listeners a los botones
        v.getCrudButton().addActionListener(actionListener);
        v.getListButton().addActionListener(actionListener);
        v.getExitButton().addActionListener(actionListener);
        v.getAddButton().addActionListener(actionListener);
        v.getModifyButton().addActionListener(actionListener);
        v.getRemoveButton().addActionListener(actionListener);

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int filasel = v.getEntinguisherTable().getSelectedRow();

                if (filasel != -1) {
                    v.getModelName().setText(v.getEntinguisherTable().getValueAt(filasel, 0).toString());
                    v.getTypeCombo().setSelectedItem(v.getEntinguisherTable().getValueAt(filasel, 1));
                    v.getSizeCombo().setSelectedItem(v.getEntinguisherTable().getValueAt(filasel, 2));
                } else {
                    v.cleanFields();
                }
            }

        };

        v.getEntinguisherTable().addMouseListener(mouseAdapter);

        //Salir
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                //Mateix codi que quan apretem el botó de sortir del programa
                try {
                    //Guardem les dades de la taula al fitxer
                    m.saveData();
                } catch (IOException ex) {
                    v.showMessage("Error when saving data.");
                }
                System.exit(0);
            }

        };

        v.addWindowListener(windowAdapter);

    }

}
