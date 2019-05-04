package view;

import controller.Controlador;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author mirokshi
 */
public final class vista extends javax.swing.JFrame {

    Controlador controlador;

    public vista() {
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new Controlador();
        tableProducto.setModel(this.controlador.productos());
        tableAlmacen.setModel(this.controlador.almacenes());
        seleccionarProducto();
        seleccionarAlmacen();
        this.panel_product.setVisible(true);
        this.panel_almacen.setVisible(false);
    }

    private void insertarProducto() {
        try {
            int id = Integer.valueOf(fieldIdProducto.getText());
            String nombre = fieldNombreProducto.getText();
            String apellidos = fieldPrecioProducto.getText();
            boolean insertado = this.controlador.insertarProducto(id, nombre, apellidos);
            if (insertado == true) {
                JOptionPane.showMessageDialog(rootPane, "Datos guardados");
                this.cancelarProducto();
                tableProducto.setModel(this.controlador.productos());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Algo falló al insertar");
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "El ID introducido no es un número");
        }
    }
    
    public void seleccionarProducto() {
        tableProducto.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_evt) {
                if (Mouse_evt.getClickCount() == 1) {
                    fieldIdProducto.setText(tableProducto.getValueAt(tableProducto.getSelectedRow(), 0).toString());
                    fieldNombreProducto.setText(tableProducto.getValueAt(tableProducto.getSelectedRow(), 1).toString());
                    fieldPrecioProducto.setText(tableProducto.getValueAt(tableProducto.getSelectedRow(), 2).toString());
                }
            }
        });
    }

    private void actualizarProducto() {
        int id = Integer.valueOf(fieldIdProducto.getText());
        String nombre = fieldNombreProducto.getText();
        String precio = fieldPrecioProducto.getText();
        boolean insertado = this.controlador.modificarProducto(id, nombre, precio);
        if (insertado == true) {
            JOptionPane.showMessageDialog(rootPane, "Datos actualizados");
            this.cancelarProducto();
            tableProducto.setModel(this.controlador.productos());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Algo falló al actualizar");
        }
    }

    private void eliminarProducto() {
        try {
            int id = Integer.parseInt(fieldIdProducto.getText());
            boolean eliminado = this.controlador.borrarProducto(id);
            if (eliminado == true) {
                JOptionPane.showMessageDialog(rootPane, "Datos eliminados");
                this.cancelarProducto();
                tableProducto.setModel(this.controlador.productos());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Algo falló al eliminar");
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "El valor introducido no es un número");
        }
    }
    
    private void cancelarProducto() {
        fieldIdProducto.setText("");
        fieldNombreProducto.setText("");
        fieldPrecioProducto.setText("");
        
    }


    
        private void insertarAlmacen() {
        try {
            int id = Integer.valueOf(fieldIdAlmacen.getText());
            String nombre = fieldNombreAlmacen.getText();
            int capacidad = Integer.valueOf(fieldCapacidadAlmacen.getText());
            boolean insertado = this.controlador.insertarAlmacen(id, nombre, capacidad);
            if (insertado == true) {
                JOptionPane.showMessageDialog(rootPane, "Datos guardados");
                this.cancelarAlmacen();
                tableAlmacen.setModel(this.controlador.almacenes());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Algo falló al insertar");
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "El ID introducido no es un número");
            System.out.println(e);
        }
    }
    
    public void seleccionarAlmacen() {
        tableAlmacen.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_evt) {
                if (Mouse_evt.getClickCount() == 1) {
                    fieldIdAlmacen.setText(tableAlmacen.getValueAt(tableAlmacen.getSelectedRow(), 0).toString());
                    fieldNombreAlmacen.setText(tableAlmacen.getValueAt(tableAlmacen.getSelectedRow(), 1).toString());
                    fieldCapacidadAlmacen.setText(tableAlmacen.getValueAt(tableAlmacen.getSelectedRow(), 2).toString());
                }
            }
        });
    }

    private void actualizarAlmacen() {
        int id = Integer.valueOf(fieldIdAlmacen.getText());
        String nombre = fieldNombreAlmacen.getText();
        int capacidad = Integer.valueOf(fieldCapacidadAlmacen.getText());
        boolean insertado = this.controlador.modificarAlmacen(id, nombre, capacidad);
        if (insertado == true) {
            JOptionPane.showMessageDialog(rootPane, "Datos actualizados");
            this.cancelarAlmacen();
            tableAlmacen.setModel(this.controlador.almacenes());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Algo falló al actualizar");
        }
    }

    private void eliminarAlmacen() {
        try {
            int id = Integer.parseInt(fieldIdAlmacen.getText());
            boolean eliminado = this.controlador.borrarAlmacen(id);
            if (eliminado == true) {
                JOptionPane.showMessageDialog(rootPane, "Datos eliminados");
                this.cancelarAlmacen();
                tableAlmacen.setModel(this.controlador.almacenes());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Algo falló al eliminar");
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "El valor introducido no es un número");
        }
    }

    private void cancelarAlmacen() {
        fieldIdAlmacen.setText("");
        fieldNombreAlmacen.setText("");
        fieldCapacidadAlmacen.setText("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_product = new javax.swing.JPanel();
        cancelarProducto = new javax.swing.JButton();
        modificarProducto = new javax.swing.JButton();
        insertarProducto = new javax.swing.JButton();
        eliminarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        precioProducto = new javax.swing.JLabel();
        fieldPrecioProducto = new javax.swing.JTextField();
        nombreProducto = new javax.swing.JLabel();
        fieldNombreProducto = new javax.swing.JTextField();
        idProducto = new javax.swing.JLabel();
        fieldIdProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panel_almacen = new javax.swing.JPanel();
        cancelarAlmacen = new javax.swing.JButton();
        modificarAlmacen = new javax.swing.JButton();
        insertarAlmacen = new javax.swing.JButton();
        eliminarAlmacen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAlmacen = new javax.swing.JTable();
        capacidadAlmacen = new javax.swing.JLabel();
        fieldCapacidadAlmacen = new javax.swing.JTextField();
        nombreAlmacen = new javax.swing.JLabel();
        fieldNombreAlmacen = new javax.swing.JTextField();
        idAlmacen = new javax.swing.JLabel();
        fieldIdAlmacen = new javax.swing.JTextField();
        Almacen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(484, 450));
        setResizable(false);

        cancelarProducto.setText("Cancelar");
        cancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProductoActionPerformed(evt);
            }
        });

        modificarProducto.setText("Modificar");
        modificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProductoActionPerformed(evt);
            }
        });

        insertarProducto.setText("Insertar");
        insertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarProductoActionPerformed(evt);
            }
        });

        eliminarProducto.setText("Eliminar");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tableProducto);

        precioProducto.setText("Precio");

        nombreProducto.setText("Nombre:");

        idProducto.setText("Id:");

        jLabel7.setText("PRODUCTO");

        javax.swing.GroupLayout panel_productLayout = new javax.swing.GroupLayout(panel_product);
        panel_product.setLayout(panel_productLayout);
        panel_productLayout.setHorizontalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_productLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreProducto)
                    .addComponent(idProducto)
                    .addComponent(precioProducto))
                .addGap(18, 18, 18)
                .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_productLayout.createSequentialGroup()
                        .addComponent(fieldPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_productLayout.createSequentialGroup()
                        .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panel_productLayout.createSequentialGroup()
                .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_productLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(eliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(insertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_productLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_productLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_productLayout.setVerticalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_productLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idProducto)
                    .addComponent(fieldIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProducto)
                    .addComponent(fieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioProducto)
                    .addComponent(fieldPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        cancelarAlmacen.setText("Cancelar");
        cancelarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAlmacenActionPerformed(evt);
            }
        });

        modificarAlmacen.setText("Modificar");
        modificarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarAlmacenActionPerformed(evt);
            }
        });

        insertarAlmacen.setText("Insertar");
        insertarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarAlmacenActionPerformed(evt);
            }
        });

        eliminarAlmacen.setText("Eliminar");
        eliminarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAlmacenActionPerformed(evt);
            }
        });

        tableAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tableAlmacen);

        capacidadAlmacen.setText("Capacidad");

        nombreAlmacen.setText("Nombre:");

        idAlmacen.setText("Id:");

        Almacen.setText("ALMACEN");

        javax.swing.GroupLayout panel_almacenLayout = new javax.swing.GroupLayout(panel_almacen);
        panel_almacen.setLayout(panel_almacenLayout);
        panel_almacenLayout.setHorizontalGroup(
            panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_almacenLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21))
                .addGroup(panel_almacenLayout.createSequentialGroup()
                    .addGroup(panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_almacenLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(eliminarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(insertarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(modificarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cancelarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_almacenLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(capacidadAlmacen)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fieldCapacidadAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
            .addGroup(panel_almacenLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Almacen))
            .addGroup(panel_almacenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreAlmacen)
                    .addComponent(idAlmacen))
                .addGap(24, 24, 24)
                .addGroup(panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNombreAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_almacenLayout.setVerticalGroup(
            panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_almacenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Almacen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idAlmacen)
                    .addComponent(fieldIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAlmacen)
                    .addComponent(fieldNombreAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadAlmacen)
                    .addComponent(fieldCapacidadAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panel_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jMenu1.setText("Producto");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Almacen");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_product, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarProductoActionPerformed
        this.insertarProducto();
    }//GEN-LAST:event_insertarProductoActionPerformed

    private void cancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProductoActionPerformed
        this.cancelarProducto();
        System.exit(0);
    }//GEN-LAST:event_cancelarProductoActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        this.eliminarProducto();
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void modificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProductoActionPerformed
        this.actualizarProducto();
    }//GEN-LAST:event_modificarProductoActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        this.panel_product.setVisible(true);        
        this.panel_almacen.setVisible(false);
    }//GEN-LAST:event_jMenu1MenuSelected

    private void cancelarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAlmacenActionPerformed
        this.cancelarAlmacen();
        System.exit(0);
    }//GEN-LAST:event_cancelarAlmacenActionPerformed

    private void modificarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarAlmacenActionPerformed
        this.actualizarAlmacen();
    }//GEN-LAST:event_modificarAlmacenActionPerformed

    private void insertarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarAlmacenActionPerformed
        this.insertarAlmacen();
    }//GEN-LAST:event_insertarAlmacenActionPerformed

    private void eliminarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAlmacenActionPerformed
        this.eliminarAlmacen();
    }//GEN-LAST:event_eliminarAlmacenActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        this.panel_product.setVisible(false);        
        this.panel_almacen.setVisible(true);
    }//GEN-LAST:event_jMenu2MenuSelected

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Almacen;
    private javax.swing.JButton cancelarAlmacen;
    private javax.swing.JButton cancelarProducto;
    private javax.swing.JLabel capacidadAlmacen;
    private javax.swing.JButton eliminarAlmacen;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JTextField fieldCapacidadAlmacen;
    private javax.swing.JTextField fieldIdAlmacen;
    private javax.swing.JTextField fieldIdProducto;
    private javax.swing.JTextField fieldNombreAlmacen;
    private javax.swing.JTextField fieldNombreProducto;
    private javax.swing.JTextField fieldPrecioProducto;
    private javax.swing.JLabel idAlmacen;
    private javax.swing.JLabel idProducto;
    private javax.swing.JButton insertarAlmacen;
    private javax.swing.JButton insertarProducto;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificarAlmacen;
    private javax.swing.JButton modificarProducto;
    private javax.swing.JLabel nombreAlmacen;
    private javax.swing.JLabel nombreProducto;
    private javax.swing.JPanel panel_almacen;
    private javax.swing.JPanel panel_product;
    private javax.swing.JLabel precioProducto;
    private javax.swing.JTable tableAlmacen;
    private javax.swing.JTable tableProducto;
    // End of variables declaration//GEN-END:variables
}
