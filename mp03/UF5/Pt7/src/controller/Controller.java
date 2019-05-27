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
import model.Extinguisher;
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

        TableColumn tc = Utils.<Extinguisher>loadTable((ArrayList<Extinguisher>) m.getData(), v.getExtinguisherTable(), Extinguisher.class, false);

        ActionListener actionListener = (ActionEvent e) -> {
            //Accion boton CRUD
            if (e.getSource().equals(v.getCrudButton())) {
                v.getModelName().setText("");
                v.getTipo().setText("");
                v.getTamaño().setText("");
                Utils.loadTable((ArrayList<Extinguisher>) m.getData(), v.getExtinguisherTable(), Extinguisher.class, false);
                v.getjPanel3().removeAll();
                v.getjPanel3().repaint();
                v.getjPanel3().revalidate();
                v.getjPanel3().add(v.getjPanel5());
                v.getjPanel3().revalidate();

            }
            //Accion boton List
            if (e.getSource().equals(v.getListButton())) {
                Utils.loadTable((ArrayList<Extinguisher>) m.getData(), v.getExtinguisherTableList(), Extinguisher.class, false);
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
                    v.showMessage("El model debe estar formado por dos palabras");

                } else {
                    m.addData(v.getModelName().getText().trim(), v.getTipo().getText().trim(), v.getTamaño().getText().trim());
                    Utils.loadTable((ArrayList<Extinguisher>) m.getData(), v.getExtinguisherTable(), Extinguisher.class, false);
                    v.cleanFields();
                }

            }
            //Accion modificar
            if (e.getSource().equals(v.getModifyButton())) {

                int filasel = v.getExtinguisherTable().getSelectedRow();

                if (filasel != -1) {
                    //Utilizo el metodo Validate de la clase que e ccreado para comprobar si el nombre del modelo es correcto
                    if (!nameValidator.validate(v.getModelName().getText().trim())) {
                        v.showMessage("El model debe estar formado por dos palabras");

                    } else {
                        v.getExtinguisherTable().getColumnModel().addColumn(tc);
                        m.modifyData(v.getExtinguisherTable().getValueAt(filasel, 3),
                                v.getModelName().getText(),
                                v.getTipo().getText(),
                                v.getTamaño().getText());
                        v.getExtinguisherTable().getColumnModel().removeColumn(tc);

                        Utils.loadTable((ArrayList<Extinguisher>) m.getData(), v.getExtinguisherTable(), Extinguisher.class, false);
                        v.cleanFields();
                    }
                } else {
                    v.showMessage("Tienes que seleccionar un registro!!!");
                }
            }

            //Accion borrar
            if (e.getSource().equals(v.getRemoveButton())) {

                int filasel = v.getExtinguisherTable().getSelectedRow();

                if (filasel != -1) {
                    v.getExtinguisherTable().getColumnModel().addColumn(tc);
                    m.removeData(v.getExtinguisherTable().getValueAt(filasel, 3));
                    v.getExtinguisherTable().getColumnModel().removeColumn(tc);
                    Utils.loadTable((ArrayList<Extinguisher>) m.getData(), v.getExtinguisherTable(), Extinguisher.class, false);
                    v.cleanFields();
                } else {
                    v.showMessage("Tienes que seleccionar un registro!!!");
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

                int filasel = v.getExtinguisherTable().getSelectedRow();

                if (filasel != -1) {
                    v.getModelName().setText(v.getExtinguisherTable().getValueAt(filasel, 0).toString());
                    v.getTipo().setText(v.getExtinguisherTable().getValueAt(filasel, 1).toString());
                    v.getTamaño().setText(v.getExtinguisherTable().getValueAt(filasel, 2).toString());
                } else {
                    v.cleanFields();
                }
            }

        };

        v.getExtinguisherTable().addMouseListener(mouseAdapter);

        //Salir
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                //Mateix codi que quan apretem el botó de sortir del programa
                try {
                    //Guardem les dades de la taula al fitxer
                    m.saveData();
                } catch (IOException ex) {
                    v.showMessage("Error al guardar los datos");
                }
                System.exit(0);
            }

        };

        v.addWindowListener(windowAdapter);

    }

}
