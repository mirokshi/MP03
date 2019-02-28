/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcmysql.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mvcmysql.model.Model;
import mvcmysql.model.TablaPintor;
import mvcmysql.model.TablaPinturas;
import mvcmysql.view.VistaPintores;
import static utilscontroller.Utils.loadTable;

/**
 *
 * @author profe
 */
public final class Controlador {

    private Model odb;
    private VistaPintores vista;
    private int filaselPintor = -1;
    private int filaselPintura = -1;
    private String nombre = "";
    private String apellido = "";
    private String pintura = "";
    private String fecha = "";
    private int idPintor = -1;
    private int idPintura = -1;

    public Controlador(Model odb, VistaPintores jf) {
        this.odb = odb;
        this.vista = jf;
//        cargarTablaPintores(odb.listarPintores(), TablaPintor.class);
        loadTable(odb.listarPintores(), vista.getjPintores(), TablaPintor.class);
        loadTable(odb.listarPinturas(), vista.getjPinturas(), TablaPinturas.class);
        borrarCampos();
        vista.setVisible(true);
        control();
    }

    public void borrarCampos() {
        //Se pone en blanco todos los campos
        vista.getjTextField1().setText("");
        vista.getjTextField2().setText("");
        vista.getjTextField3().setText("");
        vista.getjTextField4().setText("");
        nombre = apellido = pintura = fecha = "";
    }

    public void control() {

        ActionListener actionListener = (ActionEvent actionEvent) -> {
            if (actionEvent.getSource().equals(vista.getjButton6())) {
                if (filaselPintor != -1) {
                    odb.borrarPintor(idPintor);
                    borrarCampos();
                    loadTable(odb.listarPintores(), vista.getjPintores(), TablaPintor.class);
//                            cargarTablaPintores(odb.listarPintores(), TablaPintor.class);
                } else {
                    JOptionPane.showMessageDialog(null, "Para borrar un pintor primero debes seleccionarlo!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (actionEvent.getSource().equals(vista.getjButton6())) {
                if (filaselPintura != -1) {
                    odb.borrarPintura(idPintura);
                    borrarCampos();
                    loadTable(odb.listarPinturas(),vista.getjPinturas(), TablaPinturas.class);
                } else {
                    JOptionPane.showMessageDialog(null, "Para borrar una pintura primero debes seleccionarla!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (actionEvent.getSource().equals(vista.getjButton5())) {
                if (!nombre.equals("") || !apellido.equals("")) {
                    odb.insertarPintor(nombre, apellido);
                    borrarCampos();
                    loadTable(odb.listarPintores(), vista.getjPintores(), TablaPintor.class);
//                            cargarTablaPintores(odb.listarPintores(), TablaPintor.class);
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes introducir un pintor sin nombre o apellido!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (actionEvent.getSource().equals(vista.getjButton5())) {
                if (!pintura.equals("") || !fecha.equals("")) {
                    odb.insertarPintura(pintura, fecha);
                    borrarCampos();
                    loadTable(odb.listarPinturas(), vista.getjPinturas(), TablaPinturas.class);
//                            cargarTablaPinturas(odb.listarPinturas(), TablaPinturas.class);
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes introducir una sin nombre!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (actionEvent.getSource().equals(vista.getjButton7())) {
                if (filaselPintor != -1 && (!nombre.equals("") || !apellido.equals(""))) {
                    odb.modificarPintor(idPintor, nombre, apellido);
                    borrarCampos();
//                                cargarTablaPintores(odb.listarPintores(), TablaPintor.class);
                    loadTable(odb.listarPintores(), vista.getjPintores(), TablaPintor.class);
                } else {
                    JOptionPane.showMessageDialog(null, "Para modificar un pintor primer  debes de seleccionarlo!!","Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    odb.finalize();
                } catch (Throwable ex) {
                    System.out.println("Error al cerrar la BD!!");
                }
                System.exit(0);
            }
        };
        vista.getjButton4().addActionListener(actionListener);
        vista.getjButton5().addActionListener(actionListener);
        vista.getjButton6().addActionListener(actionListener);
        vista.getjButton7().addActionListener(actionListener);

        MouseAdapter mouseAdapter;
        mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.

                try {
                    filaselPintor = vista.getjPintores().getSelectedRow();
                    if (filaselPintor != -1) {
                        //if(jTable2.getValueAt(filasel, 0) instanceof String ) 
                        idPintor = Integer.parseInt(vista.getjPintores().getValueAt(filaselPintor, 0).toString());
                        //else id=(int)jTable2.getValueAt(filasel, 0);
                        nombre = (String) vista.getjPintores().getValueAt(filaselPintor, 1);
                        vista.getjTextField1().setText(nombre);
                        apellido = (String) vista.getjPintores().getValueAt(filaselPintor, 2);
                        vista.getjTextField2().setText(apellido);
                    } else {
                        borrarCampos();
                    }
                } catch (NumberFormatException ex) {
                }

                try {
                    filaselPintura = vista.getjPinturas().getSelectedRow();
                    if (filaselPintura != -1) {
                        //if(jTable2.getValueAt(filasel, 0) instanceof String ) 
                        idPintura = Integer.parseInt(vista.getjPinturas().getValueAt(filaselPintura, 0).toString());
                        //else id=(int)jTable2.getValueAt(filasel, 0);
                        pintura = (String) vista.getjPinturas().getValueAt(filaselPintura, 1);
                        vista.getjTextField3().setText(pintura);
                        fecha = (String) vista.getjPinturas().getValueAt(filaselPintura, 2);
                        vista.getjTextField4().setText(fecha);
                    } else {
                        borrarCampos();
                    }
                } catch (NumberFormatException ex) {
                }
            }

        };
        vista.getjPintores().addMouseListener(mouseAdapter);
        vista.getjPinturas().addMouseListener(mouseAdapter);

        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e); //To change body of generated methods, choose Tools | Templates.
                if (e.getSource().equals(vista.getjTextField1())) {
                    nombre = vista.getjTextField1().getText().trim();
                }
                if (e.getSource().equals(vista.getjTextField2())) {
                    apellido = vista.getjTextField2().getText().trim();
                }
                if (e.getSource().equals(vista.getjTextField3())) {
                    pintura = vista.getjTextField3().getText().trim();
                }
                if (e.getSource().equals(vista.getjTextField4())) {
                    fecha = vista.getjTextField4().getText().trim();
                }
            }

        };

        vista.getjTextField1().addFocusListener(focusAdapter);
        vista.getjTextField2().addFocusListener(focusAdapter);
        vista.getjTextField3().addFocusListener(focusAdapter);
        vista.getjTextField4().addFocusListener(focusAdapter);

        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e); //To change body of generated methods, choose Tools | Templates.
                if (e.getKeyChar() == '\n') {

                    try {
                        filaselPintor = vista.getjPintores().getSelectedRow();
                        if (filaselPintor != -1) {
                            //if(jTable2.getValueAt(filasel, 0) instanceof String ) 
                            idPintor = Integer.parseInt(vista.getjPintores().getValueAt(filaselPintor, 0).toString());
                            //else id=(int)jTable2.getValueAt(filasel, 0);
                            nombre = (String) vista.getjPintores().getValueAt(filaselPintor, 1);
                            vista.getjTextField1().setText(nombre);
                            apellido = (String) vista.getjPintores().getValueAt(filaselPintor, 2);
                            vista.getjTextField2().setText(apellido);
                        } else {
                            borrarCampos();
                        }
                    } catch (NumberFormatException ex) {
                    }

                    try {
                        filaselPintura = vista.getjPinturas().getSelectedRow();
                        if (filaselPintura != -1) {
                            //if(jTable2.getValueAt(filasel, 0) instanceof String ) 
                            idPintura = Integer.parseInt(vista.getjPinturas().getValueAt(filaselPintura, 0).toString());
                            //else id=(int)jTable2.getValueAt(filasel, 0);
                            pintura = (String) vista.getjPinturas().getValueAt(filaselPintura, 1);
                            vista.getjTextField3().setText(pintura);
                            fecha = (String) vista.getjPinturas().getValueAt(filaselPintura, 2);
                            vista.getjTextField4().setText(fecha);
                        } else {
                            borrarCampos();
                        }
                    } catch (NumberFormatException ex) {
                    }
                }
            }
        };

        vista.getjPintores().addKeyListener(keyAdapter);
        vista.getjPinturas().addKeyListener(keyAdapter);

        WindowAdapter windowAdapter = new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                //Mateix codi que quan paretem el botó de sortir del programa
                try {
                    odb.finalize();
                } catch (Throwable ex) {
                    System.out.println("Error al cerrar la BD!!");
                }
                System.exit(0);
            }
        };

        vista.addWindowListener(windowAdapter);
    }

}

//Classe filla de DefaultTableModel que conté un Listener per automàticament actualitzar a la BD els canvis fets a una jTable
class ModelCanvisBD extends DefaultTableModel {

    private ResultSet resultSet = null;
    private int columnaID;
    //El paràmetre ResultSet rs ha de ser el que hem usat per extreure les dades mostrades a la jTable, ha de ser del tipus actualitzable (CONCUR_UPDATABLE) 
    //sinó provoca una excepció i ha d'estar obert, tant ell com l'statement que el genera
    //Exemple:
    //statement = JFramePrincipal.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    //resultSet = statement.executeQuery(sql);    
    //El paràmetre colID indica quina columna del DefaultTableModel conté l'identificador de la fila de la taula
    public ModelCanvisBD(Vector data, Vector columnNames, ResultSet rs, int colID) {
        super(data, columnNames);
        resultSet = rs;
        columnaID = colID;
        this.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int row = e.getFirstRow();
                int column = e.getColumn();
                TableModel model = (TableModel) e.getSource();
                Object data = model.getValueAt(row, column);

                try {
                    int id = (Integer) model.getValueAt(row, columnaID);
                    resultSet.beforeFirst();
                    while (resultSet.next() && resultSet.getInt(columnaID + 1) != id);
                    resultSet.updateObject(column + 1, data);
                    resultSet.updateRow();
                } catch (SQLException ex) {
                    //Logger.getLogger(JFramePelis.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassCastException ex) {
                    JOptionPane.showMessageDialog(null, "Canvi de dada incorrecte!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );

    }
}
